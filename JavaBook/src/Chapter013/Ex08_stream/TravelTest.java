package Chapter013.Ex08_stream;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {

	public static void main(String[] args) {

		// 고객 생성
		TravelCustomer customerLee  = new TravelCustomer("이순신", 40, 100);
		TravelCustomer customerKim  = new TravelCustomer("김유신", 20, 100);
		TravelCustomer customerHong = new TravelCustomer("홍길동", 13, 50);

		// 고객 추가
		List<TravelCustomer> customerList = new ArrayList<>();
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerHong);

		System.out.println("== 고객 명단 추가된 순서대로 출력 ==");
		customerList.stream()
				// 고객 이름만 가져오기
				.map(c -> c.getName())
				// 명단 출력하기
				.forEach(s -> System.out.println(s));

		int total = customerList.stream()
				// 가격 가져오기
				.mapToInt(c -> c.getPrice())
				// 합산
				.sum();
		System.out.println("총 여행 비용은 :" + total + "입니다");

		System.out.println("== 20세 이상 고객 명단 정렬하여 출력 ==");
		customerList.stream()
				// 20세 이상 고객
				.filter(c -> c.getAge() >= 20)
				// 이름 가져오기
				.map(c -> c.getName())
				// 정렬
				.sorted()
				// 명단 출력하기
				.forEach(s -> System.out.println(s));
	}
}
