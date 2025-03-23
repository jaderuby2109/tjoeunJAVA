package Chapter007.Ex03;

import java.util.ArrayList;

import Chapter007.Ex02.Book;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<Book> library = new ArrayList<Book>();

		// 요솟값 추가
		library.add(new Book("태백산맥", "조정래"));
		library.add(new Book("데미안", "헤르만 헤세"));
		library.add(new Book("어떻게 살 것인가", "유시민"));
		library.add(new Book("토지", "박경리"));
		library.add(new Book("어린왕자", "생텍쥐페리"));

		for (int i = 0; i < library.size(); i++) {
			Book book = library.get(i);
			book.showBookInfo();
		}
		System.out.println();

		System.out.println("=== 향상된 for문 사용 ===");
		for (Book book : library) {
			book.showBookInfo();
		}
		System.out.println();

		System.out.println("=== 객체 하나 삭제 ===");
		Book book1 = library.remove(2);
		book1.showBookInfo();
		System.out.println();

		System.out.println("=== 객체 하나 삭제 후 ===");
		for (Book book : library) {
			book.showBookInfo();
		}
		System.out.println(library.size());
		System.out.println();

		// 조건절에 library.size()를 사용하면 하나씩 삭제 할 때마다 size()의 값이 달라짐
		int size = library.size();
		for (int i = 0; i < size; i++) {
			library.remove(0);
		}
	}
}
