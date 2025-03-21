package CodeUp.Day0318;

import java.util.Scanner;

// 첫 번째 가족과 두 번째 가족은 각각 2kg의 고추를 받는다.
// 세 번째 가족부터는 바로 직전의 두 가족이 받은 고추의 양을 합친 만큼 받는다.
// 단, 받아야 하는 고추의 양이 30kg 이상이면 1kg를 받는다.
//
// 충남이네 가족의 축제 참가번호(k)와
// 첫 번째 가족과 두 번째 가족이 받는 고추의 양(a)이 스페이스로 구분되어 입력된다.
// [입력값의 범위]
// 3 <= k <= 1,000
// 1 <= a < 30
//
// 충남이네 가족이 기념품으로 받을 수 있는 고추의 양을 출력한다.

public class _2411 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		System.out.print("(3 <= k <= 1,000) (1 <= a < 30) : ");
		int k = sc.nextInt();
		int a = sc.nextInt();

		sc.close();

		if (!(k >= 3 && k <= 1000)) {
			return;
		}
		if (!(a >= 1 && a < 30)) {
			return;
		}

		int num1 = a;
		int num2 = a;
		int sum  = a;

		for (int i = 3; i <= k; i++) {

			sum = num1 + num2;

			if (sum >= 30)
				sum = 1;

//			System.out.print((i - 2) + " : " + num1 + "\t" + (i - 2) + " : " + num2 + "\t sum : " + sum);
//			System.out.println();

			num1 = num2;
			num2 = sum;
		}

		System.out.println(sum);
	}
}
