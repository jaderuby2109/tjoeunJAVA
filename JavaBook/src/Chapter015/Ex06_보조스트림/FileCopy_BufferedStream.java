package Chapter015.Ex06_보조스트림;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy_BufferedStream {

	public static void main(String[] args) {

		long millisecond = 0;
		try (
				// 기반 스트림 : 가져오기 : 
				FileInputStream fis = new FileInputStream("Chapter15\\Chapter15.zip");
				// 기반 스트림 : 내보내기 : 
				FileOutputStream fos = new FileOutputStream("Chapter15\\Chapter15_copy.zip");
				// 보조 스트림 : 가져오기 : 
				BufferedInputStream bis = new BufferedInputStream(fis);
				// 보조 스트림 : 내보내기 : 
				BufferedOutputStream bos = new BufferedOutputStream(fos)) {

			millisecond = System.currentTimeMillis();

			int i;
			while ((i = bis.read()) != -1) {
				bos.write(i);
			}

			millisecond = System.currentTimeMillis() - millisecond;
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("파일 복사하는 데 " + millisecond + " milliseconds 소요되었습니다.");
	}
}
