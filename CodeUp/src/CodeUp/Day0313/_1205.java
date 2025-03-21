package CodeUp.Day0313;

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
public class _1205 {

	public static void main(String[] args) {
		double puls      = 0, minus1 = 0, minus2 = 0, multiple = 0;
		double division1 = 0, division2 = 0, squareRoot1 = 0, squareRoot2 = 0;
		double max       = Double.MIN_VALUE;
		double boundary  = Integer.MAX_VALUE;

		Scanner sc = new Scanner(System.in);

		System.out.print("값1 : ");
		double num1 = sc.nextDouble();
		System.out.print("값2 : ");
		double num2 = sc.nextDouble();

		sc.close();

		puls      = num1 + num2;
		minus1    = num1 - num2;
		minus2    = num2 - num1;
		multiple  = num1 * num2;
		division1 = (double) num1 / (double) num2;
		division2 = (double) num2 / (double) num1;

		squareRoot1 = num1;
		for (int i = 0; i < num2; i++) {
			squareRoot1 = squareRoot1 * (double) num1;
		}

		squareRoot2 = num2;
		for (int i = 0; i < num1; i++) {
			squareRoot2 = squareRoot2 * (double) num2;
		}
		System.out.println(num1 + "+" + num2 + " : " + puls);
		System.out.println(num1 + "-" + num2 + " : " + minus1);
		System.out.println(num2 + "-" + num1 + " : " + minus2);
		System.out.println(num1 + "*" + num2 + " : " + multiple);
		System.out.println(num1 + "/" + num2 + " : " + division1);
		System.out.println(num2 + "/" + num1 + " : " + division2);
		System.out.println(num1 + "^" + num2 + " : " + squareRoot1);
		System.out.println(num2 + "^" + num1 + " : " + squareRoot2);

		puls        = puls > boundary ? Double.MIN_VALUE : puls;
		minus1      = minus1 > boundary ? Double.MIN_VALUE : minus1;
		minus2      = minus2 > boundary ? Double.MIN_VALUE : minus2;
		multiple    = multiple > boundary ? Double.MIN_VALUE : multiple;
		division1   = division1 > boundary ? Double.MIN_VALUE : division1;
		division2   = division2 > boundary ? Double.MIN_VALUE : division2;
		squareRoot1 = squareRoot1 > boundary ? Double.MIN_VALUE : squareRoot1;
		squareRoot1 = squareRoot1 > boundary ? Double.MIN_VALUE : squareRoot1;

		if (max < puls)
			max = puls;
		if (max < minus1)
			max = minus1;
		if (max < minus2)
			max = minus2;
		if (max < multiple)
			max = multiple;
		if (max < division1)
			max = division1;
		if (max < division2)
			max = division2;
		if (max < squareRoot1)
			max = squareRoot1;
		if (max < squareRoot1)
			max = squareRoot1;

		System.out.println("최대값은 " + max + "입니다.");
	}
}
