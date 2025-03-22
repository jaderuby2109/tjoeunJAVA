package Chapter010.Ex03;

public interface Sell {

	void sell();

	default void order() {
		System.out.println("Sell : order : 판매 주문");
	}

	default void sellOrder() {
		System.out.println("Sell : sellOrder : 판매 주문");
	}

	default void buyOrder() {
		System.out.println("Sell : buyOrder : 구매 주문");
	}
}
