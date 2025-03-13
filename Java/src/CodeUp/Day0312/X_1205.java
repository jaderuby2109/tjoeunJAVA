package CodeUp.Day0312;

import java.util.Scanner;

// 두 실수 a, b가 입력되면 그 두수를 더하거나 빼거나 곱하거나 나누거나 제곱을 해서 가장 큰 수를 출력하시오.
// 예를 들어 1과 2가 입력되면,
// 1 + 2 = 3 , 2 + 1 = 3
// 1 - 2 = -1 , 2 - 1 = 1
// 1 * 2 = 2 , 2 * 1 = 2
// 1 / 2 = 0.5 , 2 / 1 = 2
// 1^2=1 , 2^1 = 2
// 따라서 최댓값은 3이다.

// 실수 a, b가 입력된다. ( a와 b의 계산결과는 모두 int범위 이내이고, 계산이 불가능한 경우는 입력되지 않는다.)

// 최댓값을 소수점이하 6자리로 출력한다.
public class X_1205 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			double max = 0;

			System.out.print("값1 : ");
			double num1 = sc.nextDouble();
			System.out.print("값2 : ");
			double num2 = sc.nextDouble();
			
			max = (max < num1 + num2 && num1 + num2 < Integer.MAX_VALUE ) ? num1 + num2 : max;
			System.out.println(num1 + num2);
			max = (max < num1 - num2 && num1 - num2 < Integer.MAX_VALUE) ? num1 - num2 : max;
			System.out.println(num1 - num2);
			max = (max < num1 * num2 && num1 * num2 < Integer.MAX_VALUE) ? num1 * num2 : max;
			System.out.println(num1 * num2);
			max = (max < num1 / num2 && num1 / num2 < Integer.MAX_VALUE) ? num1 / num2 : max;
			System.out.println(num1 / num2);
			max = (max < num2 / num1 && num2 / num1 < Integer.MAX_VALUE) ? num2 / num1 : max;
			System.out.println(num2 / num1);
			max = (max < Math.pow(num2, num1) && Math.pow(num2, num1) < Integer.MAX_VALUE) ? Math.pow(num2, num1) : max;
			System.out.println(Math.pow(num2, num1));
			max = (max < Math.pow(num1, num2) && Math.pow(num1, num2) < Integer.MAX_VALUE) ? Math.pow(num1, num2) : max;
			System.out.println(Math.pow(num1, num2));
			
			System.out.println("최대값은 " + max + "입니다.");

		} catch (Exception e) {
			System.out.println("에러가 발생했습니다.");
		}
	}

}
