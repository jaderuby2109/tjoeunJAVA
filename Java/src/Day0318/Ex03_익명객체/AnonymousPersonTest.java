package Day0318.Ex03_익명객체;

public class AnonymousPersonTest {
	public static void main(String[] args) {

		AnonymousPerson ap = new AnonymousPerson();
		ap.method();

		// 익명 자식 객체 생성
		Person person = new Person() {
			String name1 = "장원영";
			int    age1  = 20;
			
			void work() {
				System.out.println(name + "(" + age + ")");
				System.out.println(name1 + "(" + age1 + ")");
				System.out.println("노래를 부릅니다.");
			}
		};
		
		person.work();
	}
}
