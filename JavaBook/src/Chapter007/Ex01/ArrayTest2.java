package Chapter007.Ex01;

public class ArrayTest2 {

	public static void main(String[] args) {

		double[] data = new double[5];

		data[0] = 10.0;
		data[1] = 20.0;
		data[2] = 30.0;

		// 배열의 길이와 유효한 값이 저장되어 있는 배열 요소 갯수
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}
}
