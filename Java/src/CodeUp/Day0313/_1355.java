package CodeUp.Day0313;

import java.util.Scanner;

// 길이 n이 입력되면 다음과 같은 역삼각형을 출력한다.
// 예)
// n이 5이면
// *****
// ****
// ***
// **
// *
public class _1355 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("입력 : ");
		int num = sc.nextInt();

		sc.close();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {

				if (i <= j)
					System.out.print("*");
			}
			System.out.println();
		}
	}
}
