package Chapter012.Ex03;

public class Point<T, V> {

	// 정수 혹은 실수로 하고 싶은 경우
	T x;
	V y;

	Point(T x, V y) {
		this.x = x;
		this.y = y;
	}

	public T getX() {
		return x;
	}

	public V getY() {
		return y;
	}
}
