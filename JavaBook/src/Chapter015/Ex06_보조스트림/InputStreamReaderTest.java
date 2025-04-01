package Chapter015.Ex06_보조스트림;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("Chapter15\\reader.txt");
				// 보 조스트림인 InputStreamReader의 매개변수로
				// 기반 스트림인 FileInputStream을 받아 생성함
				InputStreamReader isr = new InputStreamReader(fis);
				// FileReader로 읽으면 되나 보조 스트림의 이해를 돕기 위한 코드
		) {
			int i;
			while ((i = isr.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
