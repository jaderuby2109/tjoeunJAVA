package Day15_0401.Ex01_ByteStream;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutputStreamEx {
	public static void main(String[] args) {
		String filePath = "./src/Day15_0401/FileSample/sample.dat";

		try (	// FileInputStream 객체를 사용하여, 파일을 byte 단위로 입력
				FileOutputStream fos = new FileOutputStream(filePath);
				// BufferedInputStream 객체를 사용하여, 파일 입력 성능 향상
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				// DataInputStream 객체를 사용하여, 기본 데이터 타입을 입력
				DataOutputStream dos = new DataOutputStream(bos);) {

			// 데이터 출력
			dos.writeInt(10000);
			dos.writeDouble(3.141592);
			dos.writeBoolean(true);

			System.out.println("sample.dat 파일을 출력하였습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
