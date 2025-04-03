package application;

import java.util.Map;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class AController {

	@FXML
	private Button button;

	@FXML
	private TextField input;

	@FXML
	void toB(ActionEvent event) throws Exception {

		Map<String, Object> map = Main.get("B");

		// B화면으로 데이터 전달
		BController bController = (BController) map.get("controller");
		String data = input.getText();	// 입력 데이터
		bController.passData(data);		// B화면으로 데이터 전달

		// 화면으로 이동
		Parent root = (Parent) map.get("root");
		Main.setRoot(root);
	}
}
