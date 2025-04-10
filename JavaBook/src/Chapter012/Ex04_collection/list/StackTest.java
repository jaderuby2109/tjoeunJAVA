package Chapter012.Ex04_collection.list;

import java.util.ArrayList;

class MyStack {

	private ArrayList<String> arrayStack = new ArrayList<String>();

	// 데이터 넣기
	public void push(String data) {
		arrayStack.add(data);
	}

	// 데이터 가져오기
	public String pop() {
		int len = arrayStack.size();
		if (len == 0) {
			System.out.println("스택이 비었습니다.");
			return null;
		}

		// 마지막 데이터 반환
		return (arrayStack.remove(len - 1));
	}
}

public class StackTest {

	public static void main(String[] args) {

		MyStack stack = new MyStack();
		stack.push("A");
		stack.push("B");
		stack.push("C");

		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}
