package application;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import application.DTO.Board;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	private static Scene scene;
	public static int    MAX_COUNT;

	/**
	 * 프로젝트 시작
	 * @param args
	 */
	public static void main(String[] args) {
		// Application에서 start(Stage stage) 호출
		launch(args);
	}

	/**
	 * 메인 화면 열기
	 */
	@Override
	public void start(Stage stage) throws IOException {
		// Main.fxml 파일 열기
		Parent layout = loadFXML("list");

		// Main.fxml 화면 레이아웃을 지정하여 Scene 생성
		scene = new Scene(layout);

		// Scene을 Stage에 올리기
		stage.setScene(scene);

		// 화면 보이기
		stage.show();
	}

	/**
	 * FXML 파일 지정하여 Parent객체를 읽어오는 메소드
	 */
	private static Parent loadFXML(String fxml) throws IOException {
		return getFXML(fxml).load();
	}

	/**
	 * FXML 파일 지정하여 FXMLLoader 객체 반환
	 */
	private static FXMLLoader getFXML(String fxml) throws IOException {
		// Main클래스의 위치에서 fxml.fxml파일을 가져온다.
		URL        resource   = Main.class.getResource(fxml + ".fxml");
		FXMLLoader fxmlLoader = new FXMLLoader(resource);
		return fxmlLoader;
	}

	/**
	 * Parent root 를 가져와서 화면 이동
	 */
	private static void setRoot(Parent root) throws IOException {
		scene.setRoot(root);
	}

	/**
	 * FXML 파일을 지정하여 화면 이동
	 */
	private static void setRoot(String fxml) throws IOException {
		scene.setRoot(loadFXML(fxml));
	}

	/**
	 * 쓰기 화면으로 이동
	 * @param update true : 수정 모드, false : 쓰기모드
	 * @param no : 수정 모드일때 수정할 글 번호
	 * @throws IOException
	 */
	public static void changeWrite(boolean update, int no) throws IOException {
		FXMLLoader loader = getFXML("write");
		loader.setControllerFactory(param -> new WriteController(update, no));

		Parent root = loader.load();
		Main.setRoot(root);
	}

	/**
	 * 읽기 화면으로 이동
	 * @param no : 글 번호
	 * @throws IOException
	 */
	public static void changeRead(int no) throws IOException {
		FXMLLoader loader = getFXML("read");
		loader.setControllerFactory(param -> new ReadController(no));

		Parent root = loader.load();
		Main.setRoot(root);
	}

	/**
	 * 리스트 화면으로 이동
	 * @throws IOException
	 */
	public static void changeList() throws IOException {
		Main.setRoot("list");
	}
}