package Chapter010.Ex05;

public class BookShelfTest {

	public static void main(String[] args) {

		Queue shelfQueue = new BookShelf();
		// Queue 의 추상메서드 BookShelf에서 재정의
		shelfQueue.enQueue("태백산맥 1");
		shelfQueue.enQueue("태백산맥 2");
		shelfQueue.enQueue("태백산맥 3");

		System.out.println(shelfQueue.getSize());

		// 첫번째 인덱스의 값을 반환하고 해당 인덱스를 지운다.
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.getSize());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.getSize());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.getSize());
	}
}
