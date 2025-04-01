package Day15_0401.Ex02_CharacterStream;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReaderEx {
	public static void main(String[] args) {
		// 파일 경로
		String fileName = "./src/Day15_0401/FileSample/sample.txt";

		try (	// FileReader 객체를 사용하여 파일 문자 단위로 입력
				FileReader fr = new FileReader(fileName);
				// BufferedReader 객체로 파일 데이터 입력 성능 향상
				BufferedReader br = new BufferedReader(fr);) {

			String text;
			// readLint() : 파일의 문자 데이터를 한 줄씩 입력 - 데이터가 더이상 없으면 null을 반환
			while ((text = br.readLine()) != null) {
				System.out.println(text);
			}
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}
