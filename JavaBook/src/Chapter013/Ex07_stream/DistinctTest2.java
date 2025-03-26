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
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		MyStudent student = (MyStudent) o;
		return id == student.id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}

public class DistinctTest2 {

	public static void main(String[] args) {
		Student studentLee   = new Student(100, "이윤선");
		Student studentMoon  = new Student(200, "문찬욱");
		Student studentLee2  = new Student(100, "이윤선");
		Student studentLee3  = new Student(200, "이윤선");
		Student studentMoon2 = new Student(100, "문찬욱");

		List<Student> studentList = new ArrayList<>();
		studentList.add(studentLee);
		studentList.add(studentMoon);
		studentList.add(studentLee2);
		studentList.add(studentLee3);
		studentList.add(studentMoon2);

		studentList.stream()
				// 이름으로 맵만들기
				.map(Student::getName)
				// 같은 멤버는 제외하기
				.distinct()
				// 출력
				.forEach(s -> System.out.print(s + ", "));
		System.out.println();

		studentList.stream()
				// 같은 멤버는 제외하기
				.distinct()
				// 출력
				.forEach(s -> System.out.print(s.getName() + ", "));
		System.out.println();

		studentList.stream().distinct().forEach(s -> System.out.println(s.getName() + "님 안녕하세요"));
	}
}
