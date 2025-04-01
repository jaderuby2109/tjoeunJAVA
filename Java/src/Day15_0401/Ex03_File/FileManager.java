package Day15_0401.Ex03_File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * - 메뉴 출력 메소드 
 * - 폴더 내의 파일 목록 조회 
 * - 파일 정보 조회 
 * - 폴더 생성 
 * - 폴더 삭제 
 * - 파일 생성 
 * - 파일 삭제
 */
public class FileManager {

	/** 메뉴 출력 메소드 */
	public void menu() {
		System.out.println(":::::::::: 파일 관리 ::::::::::");
		System.out.println("1. 파일 목록");
		System.out.println("2. 파일 조회");
		System.out.println("3. 폴더 생성");
		System.out.println("4. 폴더 삭제");
		System.out.println("5. 파일 생성");
		System.out.println("6. 파일 삭제");
		System.out.println("0. 프로그램 종료");
		System.out.print(":::::::::: 번호 : ");
	}

	/**
	 * 폴더 내의 파일 목록 조회
	 * @param path
	 */
	public void fileList(String path) {
		System.out.println(path);
		System.out.println("-------------------------------------");
		// 경로를 지정하여 파일 객체 생성
		File file = new File(path);
		// 하위 경로의 파일 목록을 File[] 배열로 변환
		File[] fileList = file.listFiles();

		System.out.println("파일명\t\t\t수정일자\t\t\t용량");
		for (File subFile : fileList) {
			printFileInfo(subFile);
		}
	}

	private void printFileInfo(File file) {
		// 수정일자
		long             update     = file.lastModified();	// 최종 수정일자
		Date             date       = new Date(update);		// java.util.Date
		SimpleDateFormat sdf        = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String           updateDate = sdf.format(date);

		// 파일명
		String fileName = (file.getName() + "                    ").substring(0, 20);

		// 용량
		long size = file.length();

		System.out.println(fileName + "\t" + updateDate + "\t" + size);
	}

	/**
	 * 파일 정보 조회
	 * @param filePath
	 */
	public void fileInfo(String filePath) {
		File file = new File(filePath);
		System.out.print("파일 종류 : ");
		if (file.isDirectory()) System.out.println("파일 디렉토리");
		if (file.isFile()) System.out.println("일반파일");
		printFileInfo(file);
	}

	/**
	 * 폴더 생성
	 * @param path
	 */
	public void makeDirectory(String path) {
		File file = new File(path);

		// 폴더 생성
		// mkdir() : 생성할 경로의 상위 경로까지 기존 디렉토리가 존재해야 한다. (없으면 에러)
		// mkdirs() : 생성할 경로의 상위 경로까지 디렉토리를 생성한다.
		if (file.mkdirs()) {
			System.out.println("디렉토리 생성 성공!");
		} else {
			System.out.println("디렉토리 생성 실패!");
		}
		System.out.println("경로 : " + path);
	}

	/**
	 * 폴더 삭제
	 * @param path
	 */
	public void deleteDirectory(String path) {
		File   file     = new File(path);
		
//		File[] fileList = file.listFiles();
//		
//		// 하위 경로에 파일이 있으면, 하위 파일을 먼저 삭제
//		// 파일이면 file.listFiles() = null 이다.
//		if (null != fileList) {
//			for (File subFile : fileList) {
//				// 하위 경로를 지운다.
//				deleteDirectory(subFile.getPath());
//			}
//		}
		// 경로가 디렉토리이면 하위 디렉토리 먼저 삭제
		if (file.isDirectory()) {
			File[] fileList = file.listFiles();
			for (File subFile : fileList) {
				// 하위 경로를 지운다.
				deleteDirectory(subFile.getPath());
			}
		}
		// 경로가 파일이면 파일 삭제
		if (file.isFile()) {
			deleteFile(file.getPath());
		}

		// TODO : 지정 폴더 하위 경로에 다른 파일이 있으면?
		// if (file.delete()) {
		// System.out.println("폴더 삭제 성공!");
		// } else {
		// System.out.println("폴더 삭제 실패!");
		// }
	}

	/**
	 * 파일 삭제
	 * @param path		: 파일을 생성할 경로
	 * @param fileName	: 파일명
	 */
	public void createFile(String path, String fileName) {
		if (path.lastIndexOf("/") != path.length()) {
			path += "/";
		}

		// TODO FileWriter 객체를 사용하여 간단한 텍스트를 입력하여 지정한 파일로 출력하시오.
		// 1. File 객체 생성
		File file = new File(path, fileName);

		// 2. File 객체를 초기화는 FileWriter 객체 생성
		try (FileWriter fw = new FileWriter(file);) {

			// 3. 사용자로부터 문자열 입력
			Scanner sc = new Scanner(System.in);
			System.out.print("입력할 문자열 : ");
			String str = sc.nextLine();
			// 시스템 전체에서 close 되므로 닫으면 안됨
			// sc.close();
			// 4. 입력받은 문자열을 지정한 파일에 출력
			fw.write(str);
			fw.close();
			// * 예외처리
			System.out.println("파일 생성 성공!");
		} catch (IOException e) {
			System.out.println("파일 생성 실패!");
		}
	}

	/**
	 * 파일 삭제
	 * @param path
	 */
	public void deleteFile(String path) {
		File file = new File(path);

		// 파일 존재 여부 확인
		if (file.exists() && file.delete()) {
			System.out.println(file.getName() + " : 파일을 삭제하였습니다.");
		} else if (file.exists()) {
			System.out.println(file.getName() + " : 파일 삭제에 실패하였습니다.");
		} else {
			System.out.println(file.getName() + " : 파일이 존재하지 않습니다.");
		}
	}
}
