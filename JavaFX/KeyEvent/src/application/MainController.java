package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.shape.Circle;

public class MainController {

	@FXML private Circle circle;
	@FXML private Button up;
	@FXML private Button down;
	@FXML private Button left;
	@FXML private Button right;

	private double x; // Circle x좌표
	private double y; // Circle y좌표
	private double radius;

	@FXML
	public void initialize() throws Exception {
		if (circle != null) {
			x      = circle.getCenterX();	// 원 중심 x좌표
			y      = circle.getCenterY();	// 원 중심 y좌표
			radius = circle.getRadius();
		}

	}

	@FXML void up(ActionEvent event) {		upEvent();		}
	@FXML void down(ActionEvent event) {	downEvent();	}
	@FXML void left(ActionEvent event) {	leftEvent();	}
	@FXML void right(ActionEvent event) {	rightEvent();	}

	public void keyEvent() {
		Scene scene = Main.scene;
		if (scene != null) {
			// 키 입력 이벤트 등록
			scene.setOnKeyPressed(event -> {
				KeyCode keyCode = event.getCode();
				switch (keyCode) {
					case UP :	upEvent();  	break;
					case DOWN :	downEvent();	break;
					case LEFT :	leftEvent();	break;
					case RIGHT:	rightEvent();	break;
				}
			});
		}
	}

	private void upEvent() {
		System.out.println("UP");
		circle.setCenterY(y -= 10);
	}

	private void downEvent() {
		System.out.println("DOWN");
		circle.setCenterY(y += 10);
	}

	private void leftEvent() {
		System.out.println("LEFT");
		circle.setCenterX(x -= 10);
	}

	private void rightEvent() {
		System.out.println("RIGHT");
		circle.setCenterX(x += 10);
	}
}
