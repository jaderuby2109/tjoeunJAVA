package Chapter013.Ex07_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class MyStudent {
	private int    id;
	private String name;

	public MyStudent(int id, String name) {
		this.id   = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		// 확인할 Object를 MyStudent로 변환 후 this의 id가 확인할 Object의 id값과 같은지 확인
		MyStudent student = (MyStudent) o;
		// hashCode가 같은지 비교
		return id == student.id;
	}

	@Override
	public int hashCode() {
		// 아이디만 가지고 hashCode를 생성
		return Objects.hash(id);
	}
}

public class DistinctTest2 {

	public static void main(String[] args) {
		MyStudent studentLee   = new MyStudent(100, "이윤선");
		MyStudent studentMoon  = new MyStudent(200, "문찬욱");
		MyStudent studentLee2  = new MyStudent(100, "이윤선");
		MyStudent studentLee3  = new MyStudent(200, "이윤선");
		MyStudent studentMoon2 = new MyStudent(100, "문찬욱");

		List<MyStudent> studentList = new ArrayList<>();
		studentList.add(studentLee);
		studentList.add(studentMoon);
		studentList.add(studentLee2);
		studentList.add(studentLee3);
		studentList.add(studentMoon2);

		// 이름이 같아도 다른 객체이므로 중복해서 나옴 -> hashCode로 동일 값 비고
		studentList.stream()
				// 같은 멤버는 제외하기
				.distinct()
				// 출력
				.forEach(s -> System.out.print(s.getName() + ", "));
		System.out.println();
		System.out.println();

		studentList.stream().distinct().forEach(s -> System.out.println(s.getName() + "님 안녕하세요"));
	}
}
