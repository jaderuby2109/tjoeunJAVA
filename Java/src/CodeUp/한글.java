package CodeUp;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class 한글 {
	public static void main(String[] args) throws Exception {
		System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8.name()));

	}
}
