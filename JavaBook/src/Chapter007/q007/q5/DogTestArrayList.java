package Chapter007.q007.q5;

import java.util.ArrayList;

public class DogTestArrayList {

	public static void main(String[] args) {

		ArrayList<Dog> list = new ArrayList<Dog>();
		list.add(new Dog("�۸���", "ġ�ƿ�"));
		list.add(new Dog("�ǻ�", "������"));
		list.add(new Dog("������", "��찳"));
		list.add(new Dog("ö��", "����Ƽ��"));
		list.add(new Dog("����", "Ǫ��"));	
		
		
		for(int i =0; i<list.size(); i++) {
			System.out.println(list.get(i).showDogInfo());
		}
		
		for(Dog dog : list) {
			System.out.println(dog.showDogInfo());
		}
	}

}
