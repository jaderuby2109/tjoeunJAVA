package CodeUp.Day0325;

import java.util.ArrayList;
import java.util.Collections;

//전화번호 목록
//https://school.programmers.co.kr/learn/courses/30/lessons/42577
//
//K번째수
//https://school.programmers.co.kr/learn/courses/30/lessons/42748
//
//모의고사
//https://school.programmers.co.kr/learn/courses/30/lessons/42840
	
class Solution {
	public int[] solution(int[] array, int[][] commands) {

		int count = 0;

		if (!(array.length >= 1 && array.length <= 100))
			return null;

		for (int is : array) {
			if (!(is >= 1 && is <= 100))
				count++;
		}

		if (!(commands.length >= 1 && commands.length <= 50))
			return null;

		for (int i = 0; i < commands.length; i++) {
			if (commands[i].length != 3)
				count++;
		}
		if (count > 0)
			return null;

		int[] answer = new int[commands.length];
		
		for (int i = 0; i < commands.length; i++) {
			
			if (commands[i].length < 3) {
				answer[i] = 0 ; continue;
			}
			
			if (commands[i][0] > commands[i][1]) {
				answer[i] = 0 ; continue;
			}
			
			ArrayList<Integer> copy = new ArrayList<Integer>();

			// 복사
			for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
				copy.add(array[j]);
			}

			// 정렬
			Collections.sort(copy);
			
			// k 번째 값
			answer[i] = copy.get(commands[i][2] - 1);
		}

		return answer;
	}
}

public class Q01 {
	public static void main(String[] args) {
		int[]   array    = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
		//[5, 6, 3]
		Solution s = new Solution();
		for (int is : s.solution(array, commands)) {
			System.out.println(is);
		}
		System.out.println();
	}

}
