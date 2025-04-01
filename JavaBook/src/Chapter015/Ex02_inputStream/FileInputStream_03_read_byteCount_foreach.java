package Chapter015.Ex02_inputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream_03_read_byteCount_foreach {

	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("Chapter15\\input2.txt")) {

			byte[] bs = new byte[10];
			int    i;
			// -1은 '파일의 끝'
			while ((i = fis.read(bs)) != -1) {
				for (byte b : bs) {
					System.out.print((char) b);
				}
				System.out.println(": " + i + "바이트 읽음");
				// bs배열에 이미 데이터가 들어 있는 상태에서
				// 마지막에 6바이트만 갱신 했기 때문에 10글자 모두 출력됨
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}
}