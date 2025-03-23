package Chapter012.Ex01;

import Chapter012.Ex02.Material;

public class Plastic extends Material {

	public void doPrinting() {
		System.out.println("Plastic 재료로 출력합니다.");
	}

	public String toString() {
		System.out.println("재료는 Plastic입니다.");
		return "재료는 Plastic입니다.";
	}
}
