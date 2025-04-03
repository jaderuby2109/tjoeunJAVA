package application;

import java.io.IOException;
import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	private static Scene scene;

	@Override
	public void start(Stage stage) throws Exception {

		// Main.fxml 화면 파일을 로드
		Parent layout = loadFXML("Main");
		// Main.fxml 화면 레이아웃을 지정하여 Scene 생성
		scene = new Scene(layout);

		stage.setScene(scene);
		stage.show();
	}

	/**
	 * Scene의 컨테이너를 불러온 FXML로 지정하는 메소드
	 */
	static void setRoot(String fxml) throws IOException {
		scene.setRoot(loadFXML(fxml));
	}

	/**
	 * FXML 파일을 읽어오는 메소드
	 * @param fxml
	 * @return
	 * @throws IOException
	 */
	static Parent loadFXML(String fxml) throws IOException {
		// Main 클래스의 위치에서 fxml.fxml파일을 가져온다.
		URL        fxmlFile   = Main.class.getResource(fxml + ".fxml");
		FXMLLoader fxmlLoader = new FXMLLoader(fxmlFile);
		return fxmlLoader.load();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
