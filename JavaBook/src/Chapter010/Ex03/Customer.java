package Chapter010.Ex03;

public class Customer implements Buy, Sell {
	
	@Override
	public void buy() {
		System.out.println("Customer : buy : 구매 하기");
	}

	@Override
	public void sell() {
		System.out.println("Customer : sell : 판매 하기");
	}

	@Override
	public void order() {
		System.out.println("Customer : order : 고객 판매 주문");
	}

	@Override
	public void sellOrder() {
		Sell.super.order();
	}

	@Override
	public void buyOrder() {
		Buy.super.order();
	}
}
