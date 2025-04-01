package Chapter015.Ex06_보조스트림;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy_FileStream {

	public static void main(String[] args) {

		long millisecond = 0;
		try(FileInputStream fis = new FileInputStream("Chapter15\\Chapter15.zip");
				FileOutputStream fos = new FileOutputStream("Chapter15\\Chapter15_copy.zip")){
		
			millisecond = System.currentTimeMillis();
			
			int i;
			while( ( i = fis.read()) != -1){
				fos.write(i);
			}
			
			millisecond = System.currentTimeMillis() - millisecond;
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("파일 복사하는 데 " + millisecond + " milliseconds 소요되었습니다.");
	}
}
