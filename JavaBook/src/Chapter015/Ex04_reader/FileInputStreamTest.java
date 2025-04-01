package Chapter015.Ex04_reader;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;

		fis = new FileInputStream("Chapter15\\reader.txt");
		int i;
		// 1바이트씩 읽기 때문에 2바이트 한글이 깨짐
		while ((i = fis.read()) != -1) {
			System.out.print((char) i);
		}
		fis.close();
		System.out.println("end");
	}
}
