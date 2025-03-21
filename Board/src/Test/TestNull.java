package Test;

import java.util.ArrayList;

class AA {
	int           a;
	String        b;
	AA            aa;
	AA            aList[] = new AA[5];
	ArrayList<AA> aArr    = new ArrayList<AA>();
}

public class TestNull {

	public static void main(String[] args) {

		AA aa = new AA();

		if (aa.a == 0)
			System.out.println("1");

		if (aa.b == null)
			System.out.println("2");

		if (aa.aa == null)
			System.out.println("3");

		if (aa.aList != null)
			System.out.println("4");

		for (AA aa2 : aa.aList) {
			if (aa2 != null)
				System.out.println("44");
		}

		if (aa.aArr != null)
			System.out.println("5");

		for (AA aa2 : aa.aArr) {
			if (aa2 != null)
				System.out.println("55");
		}

		//test();

	}

	private static void test() {
		int           a;
		String        b;
		AA            aa;
		AA            aList[] = new AA[5];
		ArrayList<AA> aArr    = new ArrayList<AA>();

		//		if (a == 0)
		System.out.println("1");

		//		if (b == null)
		System.out.println("2");

		//		if (aa == null)
		System.out.println("3");

		if (aList != null)
			System.out.println("4");

		for (AA aa2 : aList) {
			if (aa2 != null)
				System.out.println("44");
		}

		if (aArr != null)
			System.out.println("5");

		for (AA aa2 : aArr) {
			if (aa2 != null)
				System.out.println("55");
		}
	}
}
