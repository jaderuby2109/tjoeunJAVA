package CodeUp.Day0312;

import java.util.Scanner;

// n이 입력되면 다음과 같은 삼각형을 출력하시오.
// 예)
// n 이 5 이면
// *
// **
// ***
// ****
// *****

// 길이 n이 입력된다.

// 삼각형을 출력한다.
public class _1353 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("입력 : ");
		int num = sc.nextInt();

		sc.close();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {

				System.out.print("*");
			}
			System.out.println();
		}

	}
}
