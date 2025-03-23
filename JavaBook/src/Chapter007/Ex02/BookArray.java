package Chapter007.Ex02;

public class BookArray {

	public static void main(String[] args) {
		// 각각의 Book 인스턴스 주솟값을 담을 공간 5개를 생성
		Book[] library = new Book[5];

		for (int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
	}
}
