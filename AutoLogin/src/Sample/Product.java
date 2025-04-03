package Sample;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Product {
	String name;	// 상품명
	int    price;	// 가격
	int    count;	// 재고수
}