package Chapter010.Ex05;

public interface Queue {
	/** 배열에 요소 추가 */
	void enQueue(String title);

	/** 맨 처음 요소를 배열에서 삭제하고 반환 */
	String deQueue();

	/** 배열 요소 개수 반환 */
	int getSize();
}
