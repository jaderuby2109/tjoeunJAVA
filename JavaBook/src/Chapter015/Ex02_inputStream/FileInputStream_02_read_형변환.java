package Chapter015.Ex02_inputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream_02_read_형변환 {

	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("Chapter15\\input.txt")) {
			int i;
			// -1은 '파일의 끝'
			while ((i = fis.read()) != -1) {
				// 바이트 값을 아스키 코드 값에 해당하는 문자열로 출력
				System.out.println((char) i);
			}
			System.out.println("end");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
