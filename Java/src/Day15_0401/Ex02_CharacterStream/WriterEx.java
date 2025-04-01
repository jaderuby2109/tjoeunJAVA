package Day15_0401.Ex02_CharacterStream;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriterEx {
	public static void main(String[] args) {
		// 파일 경로
		String fileName = "./src/Day15_0401/FileSample/sample.txt";

		try (	// FileWriter 객체를 사용하여 파일 문자 단이로 입력
				FileWriter fw = new FileWriter(fileName);
				// BufferedWriter 객체로 파일 데이터 입력 성능 향상
				BufferedWriter bw = new BufferedWriter(fw);) {

			bw.write("Hello Java~!\n");
			bw.write("This is Bae Eun Ju\n");
			// \n은 엔터(개행) 이스케이프 문자
			
			System.out.println("sample.txt 파일을 출력하였습니다.");
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}
