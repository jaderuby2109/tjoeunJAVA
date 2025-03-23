package Chapter012.Ex02;

public class GenericPrinter2<T> {
	private T material;					// 제네릭 자료형

	public void setMaterial(T material) {
		this.material = material;
	}

	public T getMaterial() {			// 제네릭 자료형 변수를 반환하는 제네릭 메서드
		return material;
	}

	public String toString() {
		return material.toString();
	}
}
