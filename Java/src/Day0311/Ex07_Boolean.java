package Day0311;

import java.util.Scanner;

public class Ex07_Boolean {

	public static void main(String[] args) {
		
		// boolean
		// true(참), false(거짓) 논리 값만 가지는 자료형

		boolean check1 = false ;
		boolean check2 = true ;
		System.out.println("check1 : " + check1);
		System.out.println("check2 : " + check2);

		Scanner sc = new Scanner(System.in);
		
		boolean on = sc.nextBoolean();
		
		System.out.println("on : " + on);
		
		if (on) {
			System.out.println("전원 ON");
		} else {
			System.out.println("전원 OFF");
		}
		
		sc.close();
	}
	
}
