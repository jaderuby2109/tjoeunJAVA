package Chapter010.interfaceex;

public interface Buy {

	void buy();
	
	default void order(){
		System.out.println("");
	}
}



