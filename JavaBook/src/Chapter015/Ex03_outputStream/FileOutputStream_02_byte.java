package Chapter015.Ex03_outputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_02_byte {

	public static void main(String[] args) throws IOException {

		// FileOutputStream fos
		// = new FileOutputStream("Chapter15\\output_02_byte.txt", true);
		// try (fos) {	// java8 환경에서 (에러)
		try (FileOutputStream fos
		// 이어쓰기
				= new FileOutputStream("Chapter15\\output_02_byte.txt", true);) {

			byte[] bs   = new byte[26];
			byte   data = 65;	// 'A'의 아스키 코드 값
			for (int i = 0; i < bs.length; i++) {
				bs[i] = data;
				data++;
			}

			// 배열을 한꺼번에 출력
			fos.write(bs);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
	}
}
