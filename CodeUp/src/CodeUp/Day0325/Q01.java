package CodeUp.Day0325;

import java.util.Arrays;

class Solution {
	public int[] solution(int[] array, int[][] commands) {

		int[][] copy = new int[commands.length][];
		int[] answer = new int[commands.length];

		// 복사
		for (int i = 0; i < copy.length; i++) {
			copy[i] = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
			
			// 정렬
			int[] copyOne = copy[i];
			
			for (int row = 0; row < copyOne.length - 1; row++) {
				for (int col = 0; col < copyOne.length - 1 - row; col++) {
					if (copyOne[col] > copyOne[col + 1]) {
						int temp = copyOne[col];
						copyOne[col]     = copyOne[col + 1];
						copyOne[col + 1] = temp;
					}
				}
			}
		}

		for (int i = 0; i < answer.length; i++) {
			answer[i] = copy[i][commands[i][2] - 1];
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
