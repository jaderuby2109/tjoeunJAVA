package Day0313;

import java.util.Scanner;

public class Ex06_Arrays {

	public static void main(String[] args) {
		// 2행, 3열
		// 정방행렬
		// [][][]
		// [][][]

		// 비정방 행렬
		// [][]
		// [][][][]
		// [][][]

		int arr[][] = new int[3][];
		arr[0] = new int[2];
		arr[1] = new int[4];
		arr[2] = new int[3];

		try (Scanner sc = new Scanner(System.in)) {

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print(i + "행 " + j + "열 입력 : ");
					arr[i][j] = sc.nextInt();
				}
			}

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + "\t");
				}
				System.out.println();
			}

			for (int[] is : arr) {
				for (int js : is) {
					System.out.print(js + "\t");
				}
				System.out.println();
			}

		}
	}
}
