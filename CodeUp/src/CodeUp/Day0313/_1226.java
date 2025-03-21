package CodeUp.Day0313;

import java.util.Scanner;

// 로또 순위 매기는 방법)
// 등수 방법
// 1등 당첨번호 6개 일치
// 2등 당첨번호 5개 일치 + 보너스번호 일치
// 3등 5개 번호 일치
// 4등 4개 번호 일치
// 5등 3개 번호 일치
// 꽝 2개 이하 일치
//
// 예)
// 13 23 24 35 40 45 7 ===> 로또 당첨번호 + 보너스 번호
// 2 6 7 23 40 44 ====> 지혜가 가진 로또 번호

// 첫 줄에 로또 당첨번호 6개와 보너스 번호 1개가 주어진다.
// 둘째 줄에 지혜가 가지고 있는 로또 번호 6개가 주어진다.

// 지혜의 당첨 결과를 출력한다.
// 출력방법)
// 1등 = 1 출력, 2등 = 2 출력, 3등 = 3 출력, 4등 = 4 출력, 5등 = 5 출력, 꽝 = 0 출력

public class _1226 {

	public static void main(String[] args) {
		int[] lotto  = new int[7];
		int[] lotto2 = new int[6];
		int   same   = 0;
		int   bonus  = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("이번주 로또 당첨 번호는 (마지막 보너스번호) : ");

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = sc.nextInt();
		}
		sc.nextLine();

		System.out.print("내가 가진 로또 당첨 번호는 : ");
		for (int i = 0; i < lotto2.length; i++) {
			lotto2[i] = sc.nextInt();
		}
		sc.nextLine();

		sc.close();

		// 당첨 확인

		// 일치 하는 갯수 확인
		for (int i = 0; i < lotto.length - 1; i++) {
			for (int j = 0; j < lotto2.length; j++) {
				if (lotto[i] == lotto2[j]) {
					same++;
					break;
				}
			}
		}

		switch (same) {
			case 6:
				System.out.println("1 (6개 맞음)");
				break;
			case 5:

				for (int i : lotto2) {
					if (i == lotto[lotto.length - 1]) {
						bonus++;
						break;
					}
				}

				if (bonus == 1)
					System.out.println("2 (5개 + 보너스 맞음)");
				else
					System.out.println("3 (5개 맞음)");
				break;
			case 4:
				System.out.println("4 (4개 맞음)");
				break;
			case 3:
				System.out.println("5 (3개 맞음)");
				break;
			default:
				System.out.println("꽝");
				break;
		}
	}
}
