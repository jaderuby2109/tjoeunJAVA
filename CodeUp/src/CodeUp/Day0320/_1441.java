package CodeUp.Day0320;

import java.util.Scanner;

public class _1441 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		sc.close();
		int[] arr = { 5, 2, 9, 1, 5, 6 };

		System.out.println("정렬 전 배열:");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();

		int     n = arr.length;
		boolean swapped;

		for (int i = 0; i < n - 1; i++) {
			swapped = false;

			for (int j = 0; j < n - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					// Swap arr[j] and arr[j + 1]
					int temp = arr[j];
					arr[j]     = arr[j + 1];
					arr[j + 1] = temp;
					swapped    = true;
				}
			}

			// 만약 swap이 발생하지 않았다면 정렬 완료된 상태이므로 종료
			if (!swapped)
				break;
		}

		System.out.println("정렬 후 배열:");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
