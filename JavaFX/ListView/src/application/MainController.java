package application;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class MainController {

	@FXML
	private Button           add;
	@FXML
	private Button           delete;
	@FXML
	private TextField        input;
	@FXML
	private Label            item;
	@FXML
	private ListView<String> listView;

	private List<String> todoList = Arrays.asList("밥먹기", "잠자기", "양치하기");

	// 현재 선택한 아이템
	private String selectedItem;

	/**
	 * 데이터 초기화
	 * 이벤트 등록
	 * @throws IOException
	 */
	@FXML
	public void initialize() throws IOException {
		// todoList 데이터를 추가
		listView.getItems().addAll(todoList);
		// 리스트뷰의 항목 선택 이벤트
		listView.getSelectionModel().selectedItemProperty()
				.addListener(new ChangeListener<String>() {
					// 선택한 항목이 변경됐을 때 실행되는 메소드
					@Override
					public void changed(ObservableValue<? extends String> arg0, String arg1,
							String arg2) {
						// 선택한 항목을 지정
						selectedItem = listView.getSelectionModel().getSelectedItem();
						// 라벨에 지정
						item.setText(selectedItem);
					}

				});
		// 리스트뷰의 더블 클릭 이벤트
		listView.setOnMouseClicked(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent event) {
				// 더블 클릭
				if (event.getClickCount() == 2) {
					System.out.println("더블 클릭");
					selectedItem = listView.getSelectionModel().getSelectedItem();
					item.setText(selectedItem);
					System.out.println("선택된 아이템 : " + selectedItem);
					// TODO 상세 화면으로 이동
				}
			};
		});
	}

	/**
	 * 추가 버튼 클릭
	 * @param event
	 */
	@FXML
	void add(ActionEvent event) {
		System.out.println("추가 버튼 클릭!");
		String text = input.getText();

		if (null != input && text.trim().length() != 0) {
			// 리스트뷰에 입력 값 추가
			listView.getItems().add(text);
			// 입력 후 텍스트 필드 지우기
			input.clear();
			System.out.println(text + "(을/를) 추가하였습니다.");
		}
	}

	@FXML
	void delete(ActionEvent event) {
		System.out.println("삭제 버튼 클릭!");
		if (null == selectedItem || "".equals(selectedItem)) {
			System.out.println("선택한 항목이 없습니다.");
			return;
		}
		System.out.println(selectedItem + "(을/를) 삭제하였습니다.");
		listView.getItems().remove(selectedItem);
		selectedItem = null;
		item.setText("");
		// 선택 해제
		listView.getSelectionModel().clearSelection();

	}
}
