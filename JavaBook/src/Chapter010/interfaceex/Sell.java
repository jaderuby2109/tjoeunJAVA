package Chapter010.interfaceex;

public interface Sell {
	
	void sell();
	
	default void order(){
		System.out.println("�Ǹ� �ֹ�");
	}
}



