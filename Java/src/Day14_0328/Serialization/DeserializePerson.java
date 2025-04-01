package Day14_0328.Serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializePerson {
	public static void main(String[] args) {
		String filePath = "./src/Day14_0328/Serialization/Person.dat";
		
		try (// Person.dat 파일을 읽기 위한 파일 입력 스트림을 생성
				FileInputStream fis = new FileInputStream(filePath);

				// 파일에서 객체를 읽어오기 위한 객체 스트림 생성
				ObjectInputStream ois = new ObjectInputStream(fis);

		) {
			// person 객체를 직렬화하여 파일에 저장
			
			Person person = (Person) ois.readObject();
			
			// person 객체를 출력
			System.out.println(person);

			// 직렬화 완료 메세지 출력
			System.out.println("Person.dat 파일 데이터를 역직렬화 하여 Person 객체로 가져옴");
			

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
