package Chapter015.Ex02_inputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStream_06_write_read {

	public static void main(String[] args) throws IOException {

		try (FileOutputStream fos = new FileOutputStream("Chapter15\\resource.txt");
				FileInputStream fis = new FileInputStream("Chapter15\\resource.txt")) {

			fos.write(65);
			fos.write(66);
			fos.write(67);

			System.out.println((char) fis.read());
			System.out.println((char) fis.read());
			System.out.println((char) fis.read());

		} catch (IOException e) {
			System.out.println(e);
		}
	}
}