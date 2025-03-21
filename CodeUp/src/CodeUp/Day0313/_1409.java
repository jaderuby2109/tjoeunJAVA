package CodeUp.Day0313;

import java.util.Scanner;

// 첫째 줄에 숫자 10개가 차례대로 입력된다.
// 둘째 줄에 k값이 입력된다.

// k번째 숫자가 무엇이었는지 출력한다.
public class _1409 {
	public static void main(String[] args) {
		int number[] = new int[10];
		int index    = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 입력 : ");

		for (int i = 0; i < number.length; i++) {
			number[i] = sc.nextInt();
		}

		System.out.print("출력할 순번 : ");
		index = sc.nextInt();

		sc.close();

		System.out.println(index + "번째 숫자는 " + number[index - 1] + "입니다.");
	}
}
