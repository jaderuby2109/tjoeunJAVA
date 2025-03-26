package Chapter013.Ex07_stream;

import java.util.Arrays;
import java.util.List;

public class LimitTest {
	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("파인애플", "사과", "바나나", "귤");

		System.out.print("기본 정렬 (오름차순으로 정렬): ");

		fruits.stream().sorted()
				// 원하는 개수만큼 가져옴
				.limit(2)
				// 출력
				.forEach(s -> System.out.print(s + " "));
		System.out.println();

		System.out.print("맞춤형 정렬 (문자열 길이에 따라 정렬): ");

		fruits.stream()
				// 문자열 길이에 따라 정렬
				.sorted((f1, f2) -> Integer.compare(f1.length(), f2.length()))
				// 원하는 개수만큼 가져옴
				.limit(2)
				// 출력
				.forEach(s -> System.out.print(s + " "));
	}
}
