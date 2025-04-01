package Chapter015.Ex03_outputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_01_writer {

	public static void main(String[] args) {

		try (FileOutputStream fos
				// = new FileOutputStream("Chapter15\\output_01_writer.txt")) {
				// 매개변수 true는 이어쓰기
				= new FileOutputStream("Chapter15\\output_01_writer.txt", true)) {
			// FileOutputStream은 숫자를 쓰면 해당하는 알파벳으로 변환되어 출력됨
			fos.write(65);  // A
			fos.write(66);  // B
			fos.write(67);  // C
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
	}
}
