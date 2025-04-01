package Chapter015.Ex02_inputStream;
import java.io.FileInputStream;

public class FileInputStream_04_read_byteCount_for {

	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("Chapter15\\input2.txt")) {

			byte[] bs = new byte[10];
			int    i;
			while ((i = fis.read(bs, 0, 10)) != -1) {
				for (int k = 0; k < i; k++) {
					System.out.print((char) bs[k]);
				}
				System.out.println(": " + i + "바이트 읽음");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}
}