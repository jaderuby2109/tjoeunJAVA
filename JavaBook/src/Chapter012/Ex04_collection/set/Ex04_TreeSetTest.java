package Chapter012.Ex04_collection.set;

import java.util.TreeSet;

public class Ex04_TreeSetTest {

	public static void main(String[] args) {

		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("홍길동");
		treeSet.add("강감찬");
		treeSet.add("이순신");

		for (String str : treeSet) {
			System.out.println(str);
		}
		
		TreeSet<Integer> intSet = new TreeSet<Integer>();
		intSet.add(10);
		intSet.add(5);
		intSet.add(-2);
		intSet.add(20);
		
		for (int str : intSet) {
			System.out.println(str);
		}
	}
}
