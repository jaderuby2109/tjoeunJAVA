package Day0324.Ex01_Generics;

class Box2<T> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}

class Main {
	public static void main(String[] args) {
		Box2<String> box = new Box2<String>();
		box.setT("상자");
		System.out.println(box);

		// int는 기본 자료형이라 사용불가
		// Box<int> num = new Box<int>();
		Box2<Integer> num = new Box2<Integer>();
		num.setT(10);
		System.out.println(num);

		// int[]는 참조 자료형이라 사용 가능
		Box2<int[]> arr = new Box2<int[]>();
		arr.setT(new int[] { 1, 2, 3, 4, 5 });
		for (int i : arr.getT()) {
			System.out.print(i + " ");
		}

	}
}