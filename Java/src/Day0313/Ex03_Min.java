package Day0313;

import java.util.Scanner;

public class Ex03_Min {

	public static void main(String[] args) {

		// 1.
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("입력할 숫자의 개수 : ");
			int n = sc.nextInt();

			// 2.
			int arr[] = new int[n];
			// 4. Integer.MAX_VALUE : int의 최댓값
			int min = Integer.MAX_VALUE;

			// 3.
			for (int i = 0; i < arr.length; i++) {
				System.out.print("입력 : ");
				arr[i] = sc.nextInt();
				// 5.
				min = min > arr[i] ? arr[i] : min;
			}

			// 6.
			System.out.println("최솟값 : " + min);
		}
	}
}
