
package Chapter015.Ex03_outputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_03_byteStartLength {

	public static void main(String[] args) {

		try (FileOutputStream fos
		// 덮어쓰기
				= new FileOutputStream("Chapter15\\output_03_byteStartLength.txt")) {

			byte[] bs   = new byte[26];
			byte   data = 65;
			for (int i = 0; i < bs.length; i++) {
				bs[i] = data;
				data++;
			}
			// 배열의 값 중 start 부터 length 개수만큼 출력
			fos.write(bs, 2, 10);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
	}
}
