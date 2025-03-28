package Chapter013.Ex07_stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CollectTest {
	public static void main(String[] args) {
		Predicate<Integer> isPositive = x -> x > 0;

		List<Integer> numbers         = Arrays.asList(5, -10, -22, 0, 43, 7);
		List<Integer> positiveNumbers = numbers.stream()
				// 짝수 값만 필터
				.filter(isPositive)
				// 리스트로 만들기
				.collect(Collectors.toList());

		long count = numbers.stream().filter(isPositive).count();
		System.out.println(count);
		System.out.println(positiveNumbers);
	}
}
