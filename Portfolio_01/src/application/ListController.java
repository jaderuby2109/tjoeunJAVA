package application;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.OptionalInt;

import application.DTO.Board;
import application.Service.BoardService;
import application.Service.BoardServiceImpl;
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

	@FXML
	private TableColumn<Board, Integer> colNo;			// 글번호
	@FXML
	private TableColumn<Board, String>  colTitle;		// 제목
	@FXML
	private TableColumn<Board, String>  colWriter;		// 글쓴이
	@FXML
	private TableColumn<Board, Date>    colCreateAt;	// 작성일
	@FXML
	private TableColumn<Board, Date>    colUpdateAt;	// 작성일
	@FXML
	private TableView<Board>            tableView;		// 테이블뷰
	@FXML
	private Button                      btnWrite;		// 글쓰기 버튼

	@FXML
	public void initialize() throws IOException {
		// TODO 전체 데이터 조회
		BoardService service   = new BoardServiceImpl();
		List<Board>  boardList = service.list();

		if (boardList == null) {
			// 데이터 조회 오류
			btnWrite.setDisable(true);
		} else {
			// 테이블 뷰에 맵핑
			setTableView(boardList);
			OptionalInt optional = boardList.stream().mapToInt(Board::getNo).max();
			Main.MAX_COUNT = optional.isPresent() ? optional.getAsInt() : 0;
		}
	}

	// 가져온 데이터 테이블 뷰에 맵핑하기
	private void setTableView(List<Board> boardList) {
		// TableColum에 Board 객체의 속성 매핑하기
		colNo.setCellValueFactory(new PropertyValueFactory<>("No"));
		colTitle.setCellValueFactory(new PropertyValueFactory<>("Title"));
		colWriter.setCellValueFactory(new PropertyValueFactory<>("Writer"));
		colCreateAt.setCellValueFactory(new PropertyValueFactory<>("CreatedAt"));
		colUpdateAt.setCellValueFactory(new PropertyValueFactory<>("UpdatedAt"));

		// (코드 설명)
		// * new PropertyValueFactory("게터이름") : 값으로 들어갈 객체의 게터 이름을 지정
		// ex) new PropertyValueFactory("Title") --> getTitle() 게터 메소드의 get을 제외한 "Title"과 일치
		// * setCellValueFactory() : 셀의 값을 지정하는 메소드
		// ** module-info.java 에 javafx.base 모듈 추가해야 사용 가능

		// 테이블 뷰에 데이터 추가하기
		ObservableList<Board> list = FXCollections.observableArrayList(boardList);
		tableView.setItems(list);
	}

	/**
	 * 리스트 클릭
	 * @param event
	 * @throws IOException
	 */
	@FXML
	Board click(MouseEvent event) throws IOException {
		Board selected = null;
		if (event.getClickCount() == 2) { // 더블 클릭 감지
			selected = (Board) tableView.getSelectionModel().getSelectedItem();
			if (selected != null) {
				// 리스트 화면으로 이동
				Main.changeRead(selected.getNo());
			}
		}
		return selected;
	}

	/**
	 * 글쓰기 버튼 클릭
	 * @param event
	 * @throws IOException
	 */
	@FXML
	void actInsert(ActionEvent event) throws IOException {
		// 글쓰기 화면으로 이동
		Main.changeWrite(false, Main.MAX_COUNT);
	}
}
