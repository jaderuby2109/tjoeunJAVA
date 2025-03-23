package Chapter007.Ex01;

public class ArrayCopy {

	public static void main(String[] args) {

		int[] array1 = { 10, 20, 30, 40, 50 };
		int[] array2 = { 1, 2, 3, 4, 5 };

		// array1의 값을
		// array1의 0번째 인덱스부터
		// array2에 넣을 예정
		// array2의 1번째 인덱스부터 
		// 4개 복사
		System.arraycopy(array1, 0, array2, 1, 4);

		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
	}
}
