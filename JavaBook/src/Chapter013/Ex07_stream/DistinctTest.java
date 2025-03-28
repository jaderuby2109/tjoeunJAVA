package Chapter013.Ex07_stream;

import java.util.ArrayList;
import java.util.List;

class Student {
	private int    id;
	private String name;

	public Student(int id, String name) {
		this.id   = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}

public class DistinctTest {

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

		// 이름이 같아도 다른 객체이므로 중복해서 나옴
		studentList.stream()
				// 같은 멤버는 제외하기
				.distinct()
				// 출력
				.forEach(s -> System.out.print(s.getName() + ", "));
		System.out.println();
		System.out.println();

		// 이름으로 map을 만든 후 중복 제거
		studentList.stream()
				// 이름으로 맵만들기
				.map(Student::getName)
				// 같은 멤버는 제외하기
				.distinct()
				// 출력
				.forEach(s -> System.out.print(s + ", "));
		System.out.println();
		System.out.println();
	}
}
