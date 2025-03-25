package lombokEx;

import lombok.NonNull;

// 롬복
// : 롬복은 어노테이션을 이용하여 코드를 자동 생성해준다.
// @NoArgsConstructor		// 기본 생성자
// @AllArgsConstructor		// 모든 매개변수 생성자
// @RequiredArgsConstructor	// 필수 생성자
// @NonNull					// 필수 생성자의 매개변수로 지정
// @Getter					// getter
// @Setter					// setter
// @ToString				// toString
// @Data					// @Getter, @Setter, @ToString, @RequiredArgsConstructor, @EqualsAndHashCode

public class Person {
	@NonNull
	private String name;
	@NonNull
	private int    age;
	private double height;
	private double weight;
	public String  title;
	public String  content;

	// @Override
	// public String toString() {
	// return "Person [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + "]";
	// }

}
