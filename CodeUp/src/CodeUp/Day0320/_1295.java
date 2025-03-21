package CodeUp.Day0320;

import java.util.Scanner;

// 주어지는 문장의 대문자를 소문자로, 소문자를 대문자로 변경하는 프로그램을 작성하라.
//
// 한 줄의 공백없는 문장이 입력된다.(최대 길이:1000)
//
// 대소문자를 서로 변환한 결과를 출력한다.
//
// 입력 예시 CodeChallenge2014withMSP
// 출력 예시 cODEcHALLENGE2014WITHmsp

public class _1295 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();

		sc.close();

		char[] charArray = input.toCharArray();

		for (int index = 0; index < charArray.length; index++) {
			char ch = charArray[index];
			if (Character.isUpperCase(ch)) {
				charArray[index] = Character.toLowerCase(ch);
			} else {
				charArray[index] = Character.toUpperCase(ch);
			}
		}

		System.out.println(charArray);

	}
}
