package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class MainController {

	@FXML
	private Button button;

	@FXML
	private ImageView img;

	@FXML
	private Label menu;

	// 메뉴 리스트
	private static List<Menu> menuList;

	// 0.05초마다 동작하는 타임라인 객체
	private Timeline timeLine;
	// 3초 뒤에 중지 시키는 타임라인 객체
	private Timeline stopLine;

	/**
	 * FXML이 로딩될 때 초기화 하는 메소드
	 * : 데이터 초기화
	 * : 이벤트 등록
	 */
	@FXML
	public void initialize() {
		setData();
		setTimer();

	}

	private void setData() {
		menuList = new ArrayList<Menu>();
		List<String> nameList = Arrays.asList("갈비찜", "감자탕", "김밥", "김치찌개", "냉국수", "닭갈비", "떡볶이", "만두", "불고기", "비빔밥", "소바",
				"순대국", "순두부찌개", "잡채", "짜장면", "치킨", "피자", "감자탕", "불고기", "감자탕");
		List<String> imgList  = Arrays.asList("갈비찜.png", "감자탕.png", "김밥.png", "김치찌개.png", "냉국수.png", "닭갈비.jpg",
				"떡볶이.png", "만두.png", "불고기.png", "비빔밥.jpg", "소바.jpg", "순대국.png", "순두부찌개.png", "잡채.png", "짜장면.png",
				"치킨.png", "피자.jpg", "감자탕.png", "불고기.png", "감자탕.png");

		for (int i = 0; i < nameList.size(); i++) {
			menuList.add(new Menu(nameList.get(i), imgList.get(i)));
		}
	}

	private void setTimer() {
		// 애니메이션 적용
		// Timeline - 주기적으로 처리할 수 있도록 하는 애니메이션 클래스
		this.timeLine = new Timeline(
				// KeyFrame (시간, 이벤트)
				// : 지정한 시간마다 익명함수 호출
				// : Duration.millis(밀리초) - 0.05초
				new KeyFrame(Duration.millis(50),
						// 랜덤 메뉴 세팅
						e -> setMenu()));
		// 3초 뒤에 애니메이션 멈춤
		this.stopLine = new Timeline(
				// 3초 마다 동작하는 애니메이션 지정
				new KeyFrame(Duration.millis(3000), e -> timeLine.stop()));

		// 애니메에이션 반복 횟수 설정 - Timeline.INDEFINITE (무한 반복)
		this.timeLine.setCycleCount(Timeline.INDEFINITE);
		// 애니메에이션 반복 횟수 설정 - 1번 반복
		this.stopLine.setCycleCount(1);
	}

	@FXML
	void random(ActionEvent event) {
		// 기존에 동작하던 애니메이션 멈춤
		timeLine.stop();
		stopLine.stop();
		// 애니메이션 시작
		timeLine.play();
		stopLine.play();
	}

	private void setMenu() {
		// 메뉴 요소들 중, 랜덤으로 하나 선택
		Random random   = new Random();
		int    index    = random.nextInt(20);
		Menu   menu     = menuList.get(index);
		String menuName = menu.getName();
		String menuImg  = menu.getImg();

		// 랜덤으로 뽑힌 메뉴명 라벨에 지정
		this.menu.setText(menuName);
		// 랜덤 메뉴 이미지 지정
		System.out.println(menuName);
		System.out.println(menuImg);
		String filePath = getClass().getResource("/img/" + menuImg).toExternalForm();
		this.img.setImage(new Image(filePath));
	}
}
