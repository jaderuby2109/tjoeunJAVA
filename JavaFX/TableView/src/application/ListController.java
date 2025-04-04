package application;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

public class ListController {

	@FXML private Button btnInsert;
	@FXML private TableColumn<Board, Integer>	colNo;
 	@FXML private TableColumn<Board, String>	colTitle;
	@FXML private TableColumn<Board, String>	colWriter;
	@FXML private TableColumn<Board, Date>		colCreateAt;
	@FXML private TableColumn<Board, Integer>	colView;
	@FXML private TableView<Board> tableView;

	List<Board> boardList     = null;
	Board       selectedBoard = null;


	@FXML
	public void initialize() throws IOException {

		// 초기화
		setTableView();

		// onMousePressed="#click" 로 해결 가능?
//		// 테이블뷰 선택 이벤트 - 선택한 Board 객체 저장
//		tableView.getSelectionModel().selectedItemProperty()
//				.addListener(new ChangeListener<Board>() {
//					@Override
//					public void changed(ObservableValue<? extends Board> observable, Board oldValue,
//							Board newValue) {
//						if (newValue != null) {
//							selectedBoard = newValue;
//							// 콘솔 로그 추가 (선택한 객체 확인)
//							System.out.println("선택된 게시글:");
//							System.out.println("번호: " + selectedBoard.getNo());
//						}
//					}
//				});

//		// 더블 클릭: 상세 정보 출력
//		tableView.setOnMouseClicked((MouseEvent event) -> {
//			if (event.getClickCount() == 2) { // 더블 클릭 감지
//				Board selected = tableView.getSelectionModel().getSelectedItem();
//				if (selected != null) {
//					System.out.println("📝 더블 클릭된 게시글 상세 정보:");
//					System.out.println("번호: " + selected.getNo());
//					System.out.println("제목: " + selected.getTitle());
//					System.out.println("작성자: " + selected.getWriter());
//					System.out.println("작성일: " + selected.getCreateAt());
//					System.out.println("조회수: " + selected.getView());
//					System.out.println("내용: " + selected.getContent());
//
//					// TODO: 상세 화면으로 이동하는 기능 추가 가능
//				}
//			}
//		});
	}

	private void setTableView() {
		boardList = new ArrayList<Board>();
		boardList.add(new Board(1, "제목 1", "작성자 1", "내용 1", new Date(), new Date(), 10));
		boardList.add(new Board(2, "제목 2", "작성자 2", "내용 2", new Date(), new Date(), 20));
		boardList.add(new Board(3, "제목 3", "작성자 3", "내용 3", new Date(), new Date(), 30));

		// TableColum에 Board 객체의 속성 매핑하기
		colNo.setCellValueFactory(new PropertyValueFactory<>("No"));
		colTitle.setCellValueFactory(new PropertyValueFactory<>("Title"));
		colWriter.setCellValueFactory(new PropertyValueFactory<>("Writer"));
		colCreateAt.setCellValueFactory(new PropertyValueFactory<>("CreateAt"));
		colView.setCellValueFactory(new PropertyValueFactory<>("View"));
		// (코드 설명)
		// * new PropertyValueFactory("게터이름") : 값으로 들어갈 객체의 게터 이름을 지정
		// ex) new PropertyValueFactory("Title") --> getTitle() 게터 메소드의 get을 제외한 "Title"과 일치
		// * setCellValueFactory() : 셀의 값을 지정하는 메소드
		// ** module-info.java 에 javafx.base 모듈 추가해야 사용 가능

		// 테이블 뷰에 데이터 추가하기
		ObservableList<Board> list = FXCollections.observableArrayList(boardList);
		tableView.setItems(list);
	}
	
//	@FXML
//	public void click(MouseEvent event) {
//		Board selectedItem = tableView.getSelectionModel().getSelectedItem();
//		System.out.println(selectedItem.getTitle());
//	}

	@FXML
	public void click(MouseEvent event) {
		if (event.getClickCount() == 2) { // 더블 클릭 감지
			Board selected = tableView.getSelectionModel().getSelectedItem();
			if (selected != null) {
				System.out.print("📝 더블 클릭된 게시글 상세 정보:");
				System.out.println("번호: " + selected.getNo());
				System.out.println("제목: " + selected.getTitle());
				System.out.println("작성자: " + selected.getWriter());
				System.out.println("작성일: " + selected.getCreateAt());
				System.out.println("조회수: " + selected.getView());
				System.out.println("내용: " + selected.getContent());

				// TODO: 상세 화면으로 이동하는 기능 추가 가능
			}
		} else {
			Board selectedItem = tableView.getSelectionModel().getSelectedItem();
			System.out.print("📝 클릭된 게시글 제목:");
			System.out.println(selectedItem.getTitle());
		}
	}

	
	@FXML
	void otInsert(ActionEvent event) {

	}

}
