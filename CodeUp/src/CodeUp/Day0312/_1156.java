package CodeUp.Day0312;

import java.util.Scanner;

// 용준이와 봉찬이는 공기 놀이로 내기를 하였다.
// 만약 홀수개의 돌을 쥐게 되면 용준이가 이기게 되고, 짝수개의 돌을 쥐게 되면 봉찬이가 이기는 것으로 룰을 정하였다.
// 어떤 자연수가 입력되면 홀수이면 "odd"을 출력하고, 짝수이면 "even"을 출력하시오.

// 자연수 하나가 입력된다.

// 홀수이면 odd를 출력, 짝수이면 even을 출력하시오.
public class _1156 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		sc.close();

		if (num % 2 == 1)
			System.out.println("odd");
		else
			System.out.println("even");

	}
}
