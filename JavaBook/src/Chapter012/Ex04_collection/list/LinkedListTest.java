package Chapter012.Ex04_collection.list;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {

		LinkedList<String> myList = new LinkedList<String>();

		myList.add("A");
		myList.add("B");
		myList.add("C");

		System.out.println(myList);
		System.out.println();
		
		System.out.println("--- 추가 ---");
		myList.add(1, "D");
		System.out.println(myList);
		System.out.println();

		System.out.println("--- 맨 앞에 추가 ---");
		myList.addFirst("O");
		System.out.println(myList);
		System.out.println();

		System.out.println("--- 마지막 삭제 ---");
		System.out.println(myList.removeLast());
		System.out.println();

		System.out.println("--- 삭제 후 ---");
		System.out.println(myList);
	}
}
