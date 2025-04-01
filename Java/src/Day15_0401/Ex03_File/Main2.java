package Day15_0401.Ex03_File;

public class Main2 {
	public static void main(String[] args) {
		FileManager m = new FileManager();

		String path = "./src/Day15_0401/FileSample/Sample/";

		m.deleteDirectory(path);
	}
}
