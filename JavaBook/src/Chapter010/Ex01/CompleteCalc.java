package Chapter010.Ex01;

public class CompleteCalc extends Calculator{

	@Override
	public int times(int num1, int num2) {

		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2 != 0 )
			return num1/num2;
		else
			return Calc.ERROR;
	}

	public void showInfo(){
		System.out.println("CompleteCalc : showInfo : Calc 인터페이스를 구현했습니다." );
	}

	@Override
	public void description() {
		super.description();
		System.out.println("CompleteCalc : description : Calc 인터페이스를 오버라이드했습니다.");
	}
	
	
}
