package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class LoginController {

	// 버튼 객체
	@FXML
	private Button button;
	// Main.fxml <Button fx:id="button">
	// button 변수명과 fx:id가

	// 버튼 클릭 이벤트 메소드
	@FXML
	public void clickButton(ActionEvent event) throws IOException {
		System.out.println("메인 화면 이동!\t냥냥");
		// 로그인 화면으로 이동
		Main.setRoot("Main");
	}

}
