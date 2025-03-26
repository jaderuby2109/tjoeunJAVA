package Chapter013.Ex04_lambda;

public class TestStringConcat2 {

	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 = "World";

		StringConcat concat = new StringConcat() {
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + ", " + s2);
			}
		};
		
		concat.makeString(s1, s2);
	}
}