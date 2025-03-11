package Day01;

import java.util.Scanner;
// import : 외부 클래스를 포함시키기
// import 패키지명.클래스명;

public class Ex02_Scanner {

	public static void main(String[] args) {

		System.out.print("a : ");
		
		// 객체 생성 키워드 : new
		// 클래스타입 객체명 = new 클래스명();
		// Scanner : 표준 입력 객체
		Scanner sc = new Scanner(System.in);

		// 에러 : 빨간색 밑줄로 표시
		// 에러가 발생하면, 프로그램 실행 불가
		// 경고 : 노란색 밑줄로 표시
		// 경고가 발생해도, 프로그램 실행 가능

		// nextInt() : 정수 하나를 입력 받는 메소드
		int a = sc.nextInt();
		System.out.println("a : " + a);

		// close() : Scanner 객체를 메모리에서 제하는 메소드
		sc.close();

		// Scanner 객체를 해제한 후에는 더이상 입력을 받을 수 없다.
		// sc.nextInt();

	}
	
	public static void test() {

		int a;
		System.out.print("입력하세요. : ");

		try (Scanner sc = new Scanner(System.in)) {

			while (sc.hasNext()) {
				a = sc.nextInt();
				System.out.println("입력하신 값은 : " + a);
			}
		} catch (Exception e) {
			System.out.println("에러가 발생했습니다.");
		}

	}
}
