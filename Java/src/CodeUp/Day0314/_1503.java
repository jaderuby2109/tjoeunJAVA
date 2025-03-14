package CodeUp.Day0314;

import java.util.Scanner;

// 한개의 정수가 입력된다. (2<=N<=50)

// N*N배열을 지그재그 형태로 출력한다. (숫자와 숫자사이는 공백으로 구분한다.)
public class _1503 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 (2 <= N <= 50) : ");
		int num = sc.nextInt();

		sc.close();

		int arr[][] = new int[num][num];

		int index = 0;

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = ++index;
				}
			} else {
				for (int j = arr[i].length - 1; j >= 0; j--) {
					arr[i][j] = ++index;
				}
			}
		}

		for (int[] is : arr) {
			for (int is2 : is) {
				System.out.print(is2 + "\t");
			}
			System.out.println();

		}
	}
}
