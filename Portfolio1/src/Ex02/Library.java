package Ex02;

import java.util.ArrayList;

//[문제2번] 조은스터디는 모든 수강생에게 다양한 교재를 제공하기 위해 작은 도서관을 운영하려고 한다. 
//이 도서관의 교재를 관리하기 위한 프로그램을 아래의 조건에 따라 구현하시오.
//<조건> - 객체는 별도로 입력받지 않고, 출력결과와 동일한 정보를 갖도록 생성한다.
//- 생성된 Book 객체들은 컬렉션에 추가하고 반복문을 이용하여 출력한다.
public class Library {
	public static void main(String[] args) {

		ArrayList<Book> bookList = new ArrayList<Book>();

		bookList.add(new Book("123123", "이게 자바냐", "감자바", "자바 감자바", 33000));
		bookList.add(new Book("112112", "정보처리기사", "김조은", "국가기술자격", 45000));
		bookList.add(new Book("001001", "실무 DB", "박디비", "디비디비딥 ", 60000));

		System.out.println("########## 조은 스터디 도서관 ##########");
		for (Book book : bookList) {
			System.out.println(book);
		}

	}
}
