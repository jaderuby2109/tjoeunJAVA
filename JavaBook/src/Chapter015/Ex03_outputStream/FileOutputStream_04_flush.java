package Chapter015.Ex03_outputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_04_flush {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = null;
		fos = new FileOutputStream("Chapter15\\output_04_flush.txt", true);

		fos.write(65);  // A
		fos.write(66);  // B
		fos.write(67);  // C

		// 자료의 양이 출력할 만큼 많지 않으면
		// write()메서드로 출력했어도 파일에 쓰이지 않거나 전송되지 않을 수 있음
		// 강제전송
		fos.flush();

		// colse()에서 flust()호출 함
		fos.close();

		System.out.println("출력이 완료되었습니다.");
	}
}
