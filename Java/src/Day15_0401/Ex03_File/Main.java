package Day15_0401.Ex03_File;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		FileManager m  = new FileManager();
		Scanner     sc = new Scanner(System.in);
		// String fileName = "./src/Day15_0401/FileSample/";
		do {
			// TODO : 정의한 메소드 기능을 활용하여 파일 관리 프로그램이 실행되도록 완성해보세요.

			// 메뉴판 출력
			m.menu();

			// 메뉴번호 입력
			int menuNum = sc.nextInt();
			sc.nextLine();

			// 0번 -> 종료
			if (menuNum == 0) {
				System.out.println("프로그램 종료");
				break;
			}

			// 파일 경로 입력
			System.out.print("파일 경로 : ");
			String path = sc.nextLine();
			// String path = "./src/Day15_0401/FileSample";

			// 메뉴 선택
			switch (menuNum) {
				case 1 :
					// 1. 폴더 내의 파일 목록 조회
					System.out.println("--------------폴더 내의 파일 목록 조회");
					m.fileList(path);
					break;
				case 2 :
					// 2. 파일 정보 조회
					System.out.println("----------------------파일 정보 조회");
					m.fileInfo(path);
					break;
				case 3 :
					// 3. 폴더 생성
					System.out.println("--------------------------폴더 생성");
					m.makeDirectory(path);
					break;
				case 4 :
					// 4. 폴더 삭제
					System.out.println("--------------------------폴더 삭제");
					m.deleteDirectory(path);
					break;
				case 5 :
					// 5. 파일 생성
					System.out.print("파일 이름 : ");
					String newFileName = sc.nextLine();
					System.out.println("--------------------------파일 생성");
					m.createFile(path, newFileName);
					break;
				case 6 :
					// 6. 파일 삭제
					System.out.println("--------------------------파일 삭제");
					m.deleteFile(path);
					break;

				default :
					System.out.println("메뉴 번호를 확인하세요.");
					break;
			}

		} while (true);
		sc.close();
	}
}
