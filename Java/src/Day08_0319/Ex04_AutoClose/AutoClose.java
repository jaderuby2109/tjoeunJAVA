package Day08_0319.Ex04_AutoClose;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/**
 * test.txt 파일을 입력받아 텍스트 파일의 내용을 출력하는 프로그램 
 */
public class AutoClose {

	public static void main(String[] args) {

		// AutoClose
		// try ( 자동으로 자원 해제 할 객체 생성 ) { } 
		// : finally 구문에서 close() 하지 않아도, 자동으로 자원 해제 해준다.
		// * AutoClosable 인터페이스를 구현한 클래스이어야 자동으로 자원 해제 가능
		try (FileInputStream fis = new FileInputStream("test.txt");
			 InputStreamReader in = new InputStreamReader(fis, "UTF-8");
		) {

			int read = 0;
			while ((read = in.read()) != -1) {
				System.out.print((char) read);
			}
		} catch (FileNotFoundException e) {
			// FileNotFoundException		: 파일 없음
			System.out.println("파일을 찾을 수 없습니다.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// UnsupportedEncodingException	: 인코딩 에러
			System.out.println("지원하지 않는 인코딩 타입 입니다.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			// IOException					: 파일 입출력 에러
			System.out.println("파일 입출력에 관련된 예외가 발생했습니다.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		// End try

	}
	
}
