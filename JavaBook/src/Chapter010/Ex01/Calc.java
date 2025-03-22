package Chapter010.Ex01;

public interface Calc {
	
	double PI = 3.14;
	int ERROR = -999999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default void description(){
		System.out.println("Calc : description : default 메서드 입니다.");
		System.out.println("정수 계산기를 구현합니다.");
		myMethod();
	}
	
	private void myMethod() {
		System.out.println("Calc : myMethod : private 메서드 입니다.");
	}
	
	default void description2(){
		System.out.println("Calc : description2 : default 메서드 입니다.");
	}
	
	static int total(int[] arr){
		System.out.println("Calc : total : static 메서드 입니다.");
		
		int total = 0;
		
		for(int i: arr){
			total += i;
		}
		myStaticMethod();
		return total;
	}
	
	private static void myStaticMethod() {
		System.out.println("Calc : myStaticMethod : private static 메서드 입니다.");
	}
}
