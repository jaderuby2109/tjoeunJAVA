package Chapter007.Ex01;

public class TwoDimension2 {

	public static void main(String[] args) {

		int[][] arr = new int[2][3];
		// int[][] arr = {{1, 2}, {3, 4, 5, 6}};

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
			System.out.println();
		}

		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
	}
}
