package Day15_0401.Ex02_CharacterStream;

import java.io.FileReader;
import java.io.FileWriter;

public class FileCopy {
	public static void main(String[] args) {
		// 파일 경로
		String fileName1 = "./src/Day15_0401/FileSample/sample.txt";
		String fileName2 = "./src/Day15_0401/FileSample/sample2.txt";

		try (	// FileReader 객체를 사용하여 파일 문자 단위로 읽기
				FileReader fr = new FileReader(fileName1);
				// FileWriter 객체를 사용하여 파일 문자 단위로 쓰기
				FileWriter fw = new FileWriter(fileName2);
				) {
			int text;
			// readLint() : 파일의 문자 데이터를 한 줄씩 입력 - 데이터가 더이상 없으면 null을 반환
			while ((text = fr.read()) != -1) {
				// \n은 엔터(개행) 이스케이프 문자
				fw.write(text + "\n");
			}
			System.out.println("파일이 복사되었습니다.");
			System.out.println("sample.txt -> sample2.txt");
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}
