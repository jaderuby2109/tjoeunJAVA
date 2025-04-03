package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
	// 화면 A, B 객체 선언
	// SceneA와 SceneB를 나타내는 Scene 객체
	private Scene sceneA, sceneB; //

	@Override
	public void start(Stage stage) {

		// Scene(화면) A 생성
		// StackPane 레이아웃 생성
		StackPane layoutA = new StackPane();
		// 레이아웃 지정하여 Scene(화면) 생성
		sceneA = new Scene(layoutA, 300, 200);
		// 버튼 생성
		Button switchButton = new Button("B 화면으로 이동");
		// 레이아웃에 버튼 추가
		layoutA.getChildren().add(switchButton);
		// 버튼 클릭 이벤트 정의
		switchButton.setOnAction(e -> stage.setScene(sceneB));

		// Scene(화면) B 생성
		// 버튼 만들기
		Button backButton = new Button("A 화면으로 이동");
		// 버튼 클릭 이벤트 정의
		backButton.setOnAction(e -> stage.setScene(sceneA));
		// 버튼 지정하여 StackPane 레이아웃 생성
		StackPane layoutB = new StackPane(backButton);
		// 레이아웃 지정하여 Scene(화면) 생성
		sceneB = new Scene(layoutB, 300, 200);

		// 초기 Scene 설정 (애플리케이션이 시작될 때는 SceneA를 보여줌)
		stage.setScene(sceneA);
		// 윈도우 타이틀 설정
		stage.setTitle("Java FX - Scene 화면 이동");
		stage.show(); // 주 창을 화면에 표시
	}

	public static void main(String[] args) {
		launch(args);
	}
}
