package Chapter010.Ex03;

public class CustomerTest {

	public static void main(String[] args) {

		// (자식) = (자식)
		Customer customer = new Customer();
		customer.order();
		customer.buyOrder();
		customer.sellOrder();
		System.out.println();

		// (부모) = (자식)
		// 자식클래스에서 선언한 부모클래스에 존재하지 않는 메서드 호출 불가
		Buy buyer = customer;
		buyer.buy();
		buyer.order();
		System.out.println();

		// (부모) = (자식)
		Sell seller = customer;
		seller.sell();
		seller.order();
		System.out.println();

		// (자식) = (자식) (부모)
		// 업 캐스팅한 클래스를 다시 다운 캐스팅 하면 자식 클래스의 메서드는 사용 가능
		if (seller instanceof Customer) {
			Customer customer2 = (Customer) seller;
			customer2.buy();
			customer2.sell();
			customer2.order();
			customer2.buyOrder();
			customer2.sellOrder();
		}

	}
}
