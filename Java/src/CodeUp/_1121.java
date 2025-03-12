package CodeUp;

import java.util.Scanner;

// 정수 계산에서 나머지를 구하시오.
// 예를 들어
// 7 / 5 의 나머지는 2입니다.

// 두 정수 a, b를 입력받는다.
// a는 피제수, b는 제수를 나타낸다.
// 예) 7 5 가 입력되었다면 ====> 7 / 5 를 뜻함

// 나머지를 출력한다.
public class _1121 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("나누어질 값 : ");
			int num1 = sc.nextInt();
			System.out.print("나눌 값 : ");
			int num2 = sc.nextInt();

			System.out.println(num1 + "을 " + num2 + "로 나눈 나머지는 " + (num1 % num2) + "입니다.");
		} catch (Exception e) {
			System.out.println("에러가 발생했습니다.");
		}
	}

}
