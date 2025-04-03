package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;

public class Main extends Application {
	/**
	 * start()
	 * : 화면 시작 메서드
	 */
	@Override
	public void start(Stage stage) throws Exception {
		// 단일 state 객체로부터 화면이 시작된다.

		// Scene을 지정하기 위한 Group 객체 <- 컨테이너
		Group root = new Group();

		// Scene 생성
		Scene scene = new Scene(root);

		/* Stage 설정 */
		setStage(stage);

		// Scene을 Stage에 지정
		stage.setScene(scene);
		// Stage 출력
		stage.show();
	}

	/**
	 * 화면 이름, 아이콘, 윈도우 크기, 윈도우 위치, 크기 조절
	 * @param stage
	 */
	public void setStage(Stage stage) {

		stage.setTitle("프로그램이름");

		// 프로그램 아이콘 지정
		Image icon = new Image("icon.png"); // src 폴더 아래 icon.png 저장
		stage.getIcons().add(icon);

		// 윈도우 크기 지정 - px 단위
		stage.setWidth(600);
		stage.setHeight(400);

		// 윈도우 출력 위치 지정
		// stage.setX(100);
		// stage.setY(200);
		// 화면 정 가운데 위치 지정
		stage.centerOnScreen();

		// 크기 조절 활정화 설정
		// stage.setResizable(false); // 크기 조절 비활성화

		// TODO : 전체 화면 모드
		// 전체 화면 모드
		stage.setFullScreen(true);
		stage.setFullScreenExitHint("전체화면 종료 (Q)");
		// Q 입력 시 전체화면 종료
		stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("Q"));
	}

	// 프로그램의 시작점이 되는 메서드
	public static void main(String[] args) {
		// 프로그램 시작 준비 작업 후 -> start() 호출
		launch(args);
	}
}
