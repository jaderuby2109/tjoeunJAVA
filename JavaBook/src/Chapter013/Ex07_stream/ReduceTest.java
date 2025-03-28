package Chapter013.Ex07_stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String> {

	/** 문장의 길이가 긴 값을 리턴 */
	@Override
	public String apply(String s1, String s2) {
		if (s1.getBytes().length >= s2.getBytes().length) return s1;
		else return s2;
	}
}

public class ReduceTest {

	public static void main(String[] args) {

		String[] greetings = {"안녕하세요~~~", "hello", "Good morning", "반갑습니다^^"};

		String result = Arrays.stream(greetings)
				// 각 요소를 비교하여 문장의 길이가 더 긴 문장을 반환한다.
				.reduce("", (s1, s2) -> {
					if (s1.getBytes().length >= s2.getBytes().length) {
						return s1;
					} else {
						return s2;
					}
				});

		System.out.println(result);

		// BinaryOperator 함수형 메서드 호출
		String str = Arrays.stream(greetings).reduce(new CompareString()).get();
		System.out.println(str);

	}
}
