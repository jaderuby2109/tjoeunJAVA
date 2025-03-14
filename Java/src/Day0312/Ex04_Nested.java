package Day0312;

import java.util.Scanner;

public class Ex04_Nested {

	public static void main(String[] args) {

		// 정보처리기사 합격 기준
		// * 응시자격	: 대학교 4학년
		// * 점수		: 60점 이상
		Scanner sc = new Scanner(System.in);

		System.out.print("학년 : ");
		int year = sc.nextInt();
		System.out.print("점수 : ");
		int score = sc.nextInt();

		sc.close();

		// 합격!
		// 불합격!
		// 응시 자격이 없습니다.
		if (year >= 4) {
			if (score >= 60)
				System.out.println("합격");
			else
				System.out.println("불합격");
		} else {
			System.out.println("응시 자격이 없습니다.");
		}

		print1(year, score);
		print2(year, score);
		print3(year, score);
	}

	private static void print1(int year, int score) {
		// 4학년이상
		if (year == 4) {
			if (score >= 60)
				System.out.println("합격");
			else
				System.out.println("불합격");
		} else {
			System.out.println("응시 자격이 없습니다.");
		}
	}

	private static void print2(int year, int score) {
		// 중첩 if문 권장하지 않습니다.
		// 조건문(if)문 중첩하지 않고 조건을 작성 할 수 있다.
		if (year == 4 && score >= 60)
			System.out.println("합격");
		else if (year == 4)
			System.out.println("불합격");
		else
			System.out.println("응시 자격이 없습니다.");
	}

	private static void print3(int year, int score) {
		// 중첩 if문 권장하지 않습니다.
		// 조건문(if)문 중첩하지 않고 조건을 작성 할 수 있다.
		if (year != 4)
			System.out.println("응시 자격이 없습니다.");
		else if (score >= 60)
			System.out.println("합격");
		else
			System.out.println("불합격");
	}
}
