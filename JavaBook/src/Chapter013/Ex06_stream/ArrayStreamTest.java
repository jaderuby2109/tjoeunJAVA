package Chapter013.Ex06_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayStreamTest {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();

		Arrays.stream(arr).forEach(n -> System.out.println(n));
		System.out.println();

		int sum = Arrays.stream(arr).sum();
		System.out.println(sum);
		System.out.println();

		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		int sum2 = list.stream().mapToInt(n -> n.intValue()).sum();
		System.out.println(sum2);
	}
}
