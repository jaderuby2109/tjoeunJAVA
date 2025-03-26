package Chapter013.Ex04_lambda;

public class TestStringConcat4 {

	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 = "World";
		
		int i = 100 ;

		StringConcat concat = (s, v) -> { 
			// i = 200 ;				// 변경 할 수 없음
			System.out.println(i);		// 참조 할 수 있음
			System.out.println(s + ", " + v);
		};
		concat.makeString(s1, s2);
	}
}