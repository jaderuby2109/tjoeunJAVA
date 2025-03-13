package CodeUp.Day0312;

import java.util.Scanner;

// 길이 n이 입력되면 역삼각형을 출력한다.
// 예)
// n이 5이면
// *****
// ****
// ***
// **
// *
public class _1354 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			System.out.print("입력 : ");
			int num = sc.nextInt();

			for (int i = 1; i <= num; i++) {
				for (int j = num; j >= i; j--) {

					System.out.print("*");
				}
				System.out.println();
			}

		} catch (Exception e) {
			System.out.println("에러가 발생했습니다.");
		}
	}
}
