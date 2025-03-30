package Chapter013.stream;

import java.util.ArrayList;
import java.util.TreeSet;

public class Test {
	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(5);
		intList.add(2);
		intList.add(100);
		intList.add(50);
		intList.add(1);

		for (Integer integer : intList) {
			System.out.print(integer + " ");
		}
		System.out.println();

		TreeSet<Integer> treeSetList = new TreeSet<Integer>(intList);
		for (Integer integer : treeSetList) {
			System.out.print(integer + " ");
		}
	}
}
