package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

	@FXML
	private TextField     usernameField;
	@FXML
	private PasswordField passwordField;
	@FXML
	private Label         messageLabel;

	@FXML
	private void handleLogin() {
		String username = usernameField.getText();
		String password = passwordField.getText();

		if ("admin".equals(username) && "1234".equals(password)) {
			messageLabel.setText("로그인 성공!");
			messageLabel.setStyle("-fx-text-fill: green;");
		} else {
			messageLabel.setText("아이디 또는 비밀번호가 틀렸습니다.");
			messageLabel.setStyle("-fx-text-fill: red;");
		}
	}
}
