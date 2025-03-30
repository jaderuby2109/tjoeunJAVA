package Chapter015.Ex01_표준입출력;

import java.io.IOException;

public class SystemInTest2 {

	public static void main(String[] args) {
		System.out.println("알파벳 여러 개를 쓰고 [Enter]를 누르세요");

		int i;
		try {
			while ((i = System.in.read()) != '\n') {
				System.out.println((char) i);
				System.err.println((char) i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
