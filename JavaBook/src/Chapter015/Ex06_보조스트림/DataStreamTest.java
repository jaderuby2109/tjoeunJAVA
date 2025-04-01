package Chapter015.Ex06_보조스트림;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {

	public static void main(String[] args) {

		try (FileOutputStream fos = new FileOutputStream("Chapter15\\data.txt");
				DataOutputStream dos = new DataOutputStream(fos)) {

			dos.writeByte(100);
			dos.writeChar('A');
			dos.writeInt(10);
			dos.writeFloat(3.14f);
			dos.writeUTF("Test");
		} catch (IOException e) {
			e.printStackTrace();
		}

		try (FileInputStream fis = new FileInputStream("Chapter15\\data.txt"); 
				DataInputStream dis = new DataInputStream(fis)) {

			// readXXX가 다르면 서로 사용한 메모리 크기가 달라서 같은 값을 가져올 수 없다.
//			System.out.println(dis.readInt());
			System.out.println(dis.readByte());
			System.out.println(dis.readChar());
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readUTF());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
