package Chapter012.Ex04_collection.list;

import java.util.ArrayList;

class MyQueue {

	private ArrayList<String> arrayQueue = new ArrayList<String>();

	// 데이터 넣기
	public void enQueue(String data) {
		arrayQueue.add(data);
	}

	// 데이터 가져오기
	public String deQueue() {
		int len = arrayQueue.size();
		if (len == 0) {
			System.out.println("큐가 비었습니다.");
			return null;
		}

		// 첫 번째 데이터 반환
		return (arrayQueue.remove(0));
	}
}

public class QueueTest {

	public static void main(String[] args) {

		MyQueue queue = new MyQueue();
		queue.enQueue("A");
		queue.enQueue("B");
		queue.enQueue("C");

		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
	}
}
