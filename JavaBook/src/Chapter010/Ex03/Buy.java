package Chapter010.Ex03;

public interface Buy {

	void buy();

	default void order() {
		System.out.println("Buy : order : 구매 주문");
	}

	default void sellOrder() {
		System.out.println("Buy : sellOrder : 판매 주문");
	}

	default void buyOrder() {
		System.out.println("Buy : buyOrder : 구매 주문");
	}
}
