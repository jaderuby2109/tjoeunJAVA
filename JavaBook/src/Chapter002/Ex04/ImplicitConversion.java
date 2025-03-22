package Chapter002.Ex04;

public class ImplicitConversion {

	public static void main(String[] args) {
		
		// 묵시적 형 변환
		
		int    n    = 10;				// int 형 변수에 정수 값 10을 대입
		double dnum = n;				// int 형 변수 n의 값을 double 형 변수 dnum에 대입

		// 바이트 크기가 작은 자료형에서 큰 자료형으로 대입하는 경우
		byte bNum = 10;
		int  iNum = bNum;				// byte 형 변수 bNum의 값을 int 형 변수 iNum에 대입함

		System.out.println(bNum);
		System.out.println(iNum);

		// 덜 정밀한 자료형에서 더 정밀한 자료형으로 대입하는 경우
		int   iNum2 = 20;
		float fNum  = iNum2;			// int 형 변수 iNum2의 값을 float 형 변수 fNum에 대입함

		System.out.println(iNum);
		System.out.println(fNum);

		// 연산 중에 자동으로 형 변환되는 경우
		double dNum;
		dNum = fNum + iNum;
		System.out.println(dNum);
	}
}
