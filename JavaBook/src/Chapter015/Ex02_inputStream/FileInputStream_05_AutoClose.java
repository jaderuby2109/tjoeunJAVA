package Chapter015.Ex02_inputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream_05_AutoClose {

	public static void main(String[] args) throws IOException {

		try (FileInputStream fis = new FileInputStream("Chapter15\\input.txt")) {
			System.out.println((char) fis.read());
			System.out.println((char) fis.read());
			System.out.println((char) fis.read());

		} catch (IOException e) {
			System.out.println(e);
		}
	}
}