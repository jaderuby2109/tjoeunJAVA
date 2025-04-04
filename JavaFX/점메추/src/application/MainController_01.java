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

public class MainController_01 {

	@FXML
	private Button button;

	@FXML
	private ImageView img;

	@FXML
	private Label menu;

	// 메뉴 리스트
	private static List<Menu> menuList;

	/**
	 * FXML이 로딩될 때 초기화 하는 메소드
	 * : 데이터 초기화
	 * : 이벤트 등록
	 */
	@FXML
	public void initialize() {
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

	@FXML
	void random(ActionEvent event) {
		// 애니메이션 적용
		Timeline timeline = new Timeline(
				// KeyFrame (시간, 이벤트)
				// 메뉴 가져오기
				new KeyFrame(Duration.millis(50), e -> setMenu()));
		// 사이클이 돌아가는 횟수50번
		// timeline.setCycleCount(50);
		// 무제한 돌리기
		timeline.setCycleCount(timeline.INDEFINITE);

		Timeline stopTimeline = new Timeline(
				// KeyFrame (시간, 이벤트)
				// 3초 후에 애니메이션 멈춤
				new KeyFrame(Duration.millis(3000), e -> timeline.stop()));
		stopTimeline.setCycleCount(1);

		timeline.play();
		stopTimeline.play();
	}

	void setMenu() {
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
