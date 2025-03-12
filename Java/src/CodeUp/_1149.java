package CodeUp;

import java.util.Scanner;

// 두 정수 중 큰 정수를 출력한다.

// 두 정수가 입력된다.

// 두 정수 중 큰 정수를 출력한다.
public class _1149 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("값1 : ");
			int num1 = sc.nextInt();
			System.out.print("값2 : ");
			int num2 = sc.nextInt();

			System.out.println("(" + num1 + ")과 (" + num2 + ") 중 큰 수는 (" 
						+ ((num1 > num2) ? num1 : num2) + ")입니다.");

		} catch (Exception e) {
			System.out.println("에러가 발생했습니다.");
		}
	}
}
