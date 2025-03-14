package CodeUp.Day0313;

import java.util.Scanner;

// 이번에는 데이터의 개수가 n개가 들어오고, n개의 데이터를 거꾸로 출력하는 프로그램을 작성하시오.

// 첫째 줄에 데이터의 개수 n이 입력된다. ( n <= 1,000 )
// 둘째 줄에 공백을 기준으로 n개 데이터가 입력된다.

// n개의 데이터를 입력의 역순으로 출력한다.
public class _1402 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("입력 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {

				if (i <= j )
				System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
		
		
		sc.close();
	}
}
