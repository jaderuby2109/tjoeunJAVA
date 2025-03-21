package Test;

import java.util.Arrays;

interface AAA {
	public C[] list();
}

class BBB implements AAA {

	C clist[] = new C[10];

	public BBB() {
		clist[0] = new C();
	}

	@Override
	public String toString() {
		return "BBB [clist=" + Arrays.toString(clist) + "]";
	}

	public C[] list() {
		return clist;
	}
}

class C {
	int c;

	@Override
	public String toString() {
		return "C [c=" + c + "]";
	}
}

public class TestCreateList {

	public static void main(String[] args) {

		AAA aaa = new BBB();

		C cList[] = aaa.list();

		for (C c : cList) {
			if (c.equals(null))
				continue;
			System.out.println(c);
		}

	}

}
