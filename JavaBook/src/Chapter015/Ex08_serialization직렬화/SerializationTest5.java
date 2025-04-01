package Chapter015.Ex08_serialization직렬화;

import java.io.*;

/*
class Person {
	
	String name;
	String job;
	
	public Person() {}

	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString()
	{
		return name + "," + job;
	}
*//*
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(name);
		out.writeUTF(job);
	}
	
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = in.readUTF();
		job = in.readUTF();
	}
	*//*
		}*/

class Person5 implements Serializable {

	@Serial
	private static final long serialVersionUID = 8307928265648849333L;

	String name;
	String job;
	int    i;
	int    j;

	public Person5() {
	}

	public Person5(String name, String job) {
		this.name = name;
		this.job  = job;
	}

	public String toString() {
		return name + "," + job;
	}
}

public class SerializationTest5 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Person personAhn = new Person("안재용", "대표이사");
		Person personKim = new Person("김철수", "상무이사");

		FileOutputStream   fos = new FileOutputStream("Chapter15\\serial.out");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(personKim);
		oos.writeObject(personAhn);
		oos.close();

		FileInputStream   fis = new FileInputStream("Chapter15\\serial2.out");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Person5 p1 = (Person5) ois.readObject();
		Person5 p2 = (Person5) ois.readObject();

		System.out.println(p1);
		System.out.println(p2);

		ois.close();
	}
}
