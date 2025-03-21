package CodeUp.Day0320;

import java.util.Scanner;

// 영민이는 프로그램을 이용하여 계산기를 만들려고한다.
// 하지만 영민이는 프로그램을 얼마 배우지 않아 어려워하고있다.
// 우리가 영민이를 위해 계산기 프로그램을 만들어주자.

// 연산식이 한줄로 입력된다.
// 연산식의 형식은 정수+정수 또는 정수-정수 또는 정수*정수 또는 정수/정수의 형태이다.

// 계산 결과를 정수로 출력한다.
// 나눗셈일 경우 실수로 출력하되 소수 둘째자리까지 출력한다.
// (0으로 나누는 경우는 입력되지 않는다.)
public class _1231 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("계산식 입력 (숫자수식숫자) : ");
		String input = sc.nextLine();

		sc.close();

		int x1 = input.indexOf("+");
		int x2 = input.indexOf("-");
		int x3 = input.indexOf("*");
		int x4 = input.indexOf("/");

		String[] num = null;
		if (x3 > -1) {
			num = input.split("\\*");
			int num1 = Integer.parseInt(num[0]);
			int num2 = Integer.parseInt(num[1]);

			System.out.println(num1 * num2);
		} else if (x4 > -1) {
			num = input.split("\\/");
			int num1 = Integer.parseInt(num[0]);
			int num2 = Integer.parseInt(num[1]);

			System.out.println(Math.round((double) num1 / (double) num2 * 100) / (double) 100);

		} else if (x1 > -1) {
			num = input.split("\\+");
			int num1 = Integer.parseInt(num[0]);
			int num2 = Integer.parseInt(num[1]);

			System.out.println(num1 + num2);

		} else if (x2 > -1) {
			num = input.split("\\-");
			int num1 = Integer.parseInt(num[0]);
			int num2 = Integer.parseInt(num[1]);

			System.out.println(num1 - num2);
		}

	}
}
