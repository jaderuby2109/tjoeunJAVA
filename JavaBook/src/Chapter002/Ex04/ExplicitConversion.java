package Chapter002.Ex04;

public class ExplicitConversion {

	public static void main(String[] args) {

		// 명시적 형 변환

		// 바이트 크기가 큰 자료형에서 작은 자료형으로 대입하는 경우
		int  iNum = 10;
		byte bNum = (byte) iNum;		// 강제로 형을 바꾸려면 바꿀 형을 괄호 안에 명시해야 함
		System.out.println(bNum);

		iNum = 1000;
		bNum = (byte) iNum;				// 자료 손실이 발생 함
		System.out.println(bNum);

		// 더 정밀한 자료형에서 덜 정밀한 자료형으로 대입하는 경우
		double dNum1 = 1.2;
		float  fNum2 = 0.9F;
		System.out.println(dNum1);
		System.out.println(fNum2);

		// 연산 중 형 변환되는 경우
		int iNum3 = (int) dNum1 + (int) fNum2;
		int iNum4 = (int) (dNum1 + fNum2);
		System.out.println(iNum3);
		System.out.println(iNum4);

	}
}
