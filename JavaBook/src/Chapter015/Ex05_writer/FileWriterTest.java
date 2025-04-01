package Chapter015.Ex05_writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {

		try(FileWriter fw = new FileWriter("Chapter15\\writer.txt")){
			fw.write('A');
			char buf[] = {'B','C','D','E','F','G'};
			
			fw.write(buf);
			fw.write(13);
			fw.write("안녕하세요. 잘 써지네요");
			fw.write(13);
			fw.write(buf, 1, 2);
			fw.write(13);
			fw.write("65");
			fw.write(13);
			fw.write("A");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("출력이 완료되었습니다.");
	}
}
