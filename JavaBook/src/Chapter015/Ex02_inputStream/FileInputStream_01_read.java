package Chapter015.Ex02_inputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream_01_read {

	public static void main(String[] args) {
		FileInputStream fis = null;

		try {
			fis = new FileInputStream("Chapter15\\input.txt");

			// 한 바이트씩 자료를 읽어 들였기 때문
			for (int i = 0 ; i < 15 ; i++)
			System.out.println(fis.read());

		} catch (IOException e) {
			// 지정된 경로에 파일이 없을 경우 : FileNotFoundException
			// 지정된 경로를 찾을 수 없는 경우 등 : FileNotFoundException
			System.out.println(e.getMessage());
			System.out.println(e);
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				System.out.println(e);
			} catch (NullPointerException e) {
				// 파일 입력 스트림이 null인경우
				System.out.println(e);
			}
		}
		System.out.println("end");
	}
}
