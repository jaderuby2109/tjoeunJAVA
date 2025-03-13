package CodeUp.Day0313;

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
//		print1();
//		print2();
		print3();
	}

	private static void print1() {
		try (Scanner sc = new Scanner(System.in)) {

			System.out.print("계산식 입력 (숫자 수식 숫자) : ");
			double num1 = sc.nextDouble();
			String str = sc.next();
			double num2 = sc.nextDouble();
			
			if (!("+".equals(str) || "-".equals(str) || "*".equals(str) || "/".equals(str))) {
				System.out.println("잘못 된 수식입니다.");
				return ;
			}
			
			if ("/".equals(str) && num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
				return ;
			} 

			System.out.println(
					switch (str) {
						case "+" -> num1 + num2;
						case "-" -> num1 - num2;
						case "*" -> num1 * num2;
						case "/" -> Math.round((double) num1 / (double)num2 * 100) / (double) 100 ;
						default -> "";
					}
			);
					
			
		} catch (Exception e) {
			System.out.println("에러가 발생했습니다.");
		}
	}

	private static void print2() {
		try (Scanner sc = new Scanner(System.in)) {

			System.out.print("계산식 입력 (숫자 수식 숫자) : ");
			double num1   = sc.nextDouble();
			String str    = sc.next();
			double num2   = sc.nextDouble();

			if (!("+".equals(str) || "-".equals(str) || "*".equals(str) || "/".equals(str))) {
				System.out.println("잘못 된 수식입니다.");
				return;
			}

			if ("/".equals(str) && num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
				return;
			}

			System.out.printf("%.2f", switch (str) {
				case "+" -> num1 + num2;
				case "-" -> num1 - num2;
				case "*" -> num1 * num2;
				case "/" -> (double) num1 / (double) num2;
				default  -> 0;
			});

		} catch (Exception e) {
			System.out.println("에러가 발생했습니다.");
		}
	}
	
	private static void print3() {
		try (Scanner sc = new Scanner(System.in)) {

			System.out.print("계산식 입력 (숫자수식숫자) : ");
			String str    = sc.next();
			double num1   = 0;
			double num2   = 0;

			if (!("+".equals(str) || "-".equals(str) || "*".equals(str) || "/".equals(str))) {
				System.out.println("잘못 된 수식입니다.");
				return;
			}

			if ("/".equals(str) && num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
				return;
			}

			System.out.printf("%.2f", switch (str) {
				case "+" -> num1 + num2;
				case "-" -> num1 - num2;
				case "*" -> num1 * num2;
				case "/" -> (double) num1 / (double) num2;
				default  -> 0;
			});

		} catch (Exception e) {
			System.out.println("에러가 발생했습니다.");
		}
	}
}
