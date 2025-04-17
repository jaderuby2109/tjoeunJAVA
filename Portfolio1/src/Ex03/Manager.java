package Ex03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

//모두의 코딩에서 월말 코딩 대회를 열었다. 
//매니저는 학생들의 성적을 취합하여 "student.txt" 파일로 정리하였다. 
//한 학생의 성적은 다음과 같은 양식으로 기록되어 있다. 
//txt 파일에서 학생들의 성적정보 (번호/이름/성적/수업이름) 추출하여, 
//성적 순으로 내림차순, 번호 순으로 오름차순 정렬하여 출력하시오.
public class Manager {

	public static void main(String[] args) {

		// 학생 목록
		ArrayList<Student> list = new ArrayList<Student>();

		// 텍스트 파일 읽어서 학생 목록에 추가
		list = getTxtToList(list);

		// 정렬
		sortScoreAndNo(list);

		// 출력
		printList(list);
	}

	/**
	 * 텍스트 파일입력
	 * @param list
	 * @return
	 */
	private static ArrayList<Student> getTxtToList(ArrayList<Student> list) {
		File file = new File("student.txt");
		// 파일 읽기
		try (Scanner sc = new Scanner(file)) {
			Student student;

			while (sc.hasNextLine()) {
				// 한 줄 읽어서
				String   strLine = sc.nextLine();
				// '/'단위로 분할
				String[] data    = strLine.split("/");

				int    no        = Integer.parseInt(data[0]);
				String name      = data[1];
				int    score     = Integer.parseInt(data[2]);
				String className = data[3];

				student = new Student(no, name, score, className);
				list.add(student);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return list;
	}

	/**
	 * 리스트 정렬
	 * @param list
	 * @return
	 */
	public static void sortScoreAndNo(ArrayList<Student> list) {

		Comparator<Student> com = (s1, s2) -> {

			// 성적순
			if (s1.getScore() > s2.getScore()) return -1;
			else if (s1.getScore() < s2.getScore()) return 1;
			else {
				// 번호순
				return s1.getNo() - s2.getNo();
			}
		};

		list.sort(com);
	}

	/**
	 * 리스트 출력
	 * @param list
	 */
	public static void printList(ArrayList<Student> list) {

		System.out.println("번호\t이름\t성적\t반");
		list.stream().forEach(student -> System.out.println(student) );
	}
}
