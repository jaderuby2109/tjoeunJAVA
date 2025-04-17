package application;

import java.io.IOException;
import java.util.Optional;

import application.DTO.Board;
import application.Service.BoardService;
import application.Service.BoardServiceImpl;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class ReadController {

	@FXML
	private Label    colNo;			// 글번호
	@FXML
	private Label    colTitle;		// 제목
	@FXML
	private Label    colWriter;		// 글쓴이
	@FXML
	private TextArea colContent;	// 내용

	private int no;

	public ReadController(int no) {
		this.no = no;
	}

	@FXML
	public void initialize() throws IOException {
		// TODO 데이터 조회
		BoardService service = new BoardServiceImpl();
		Board        board   = service.select(no);

		// 화면에 데이터 표시
		colNo.setText(String.valueOf(no));
		colTitle.setText(board.getTitle());
		colWriter.setText(board.getWriter());
		colContent.setText(board.getContent());
	}

	@FXML
	void actCancel(ActionEvent event) throws IOException {
		// 리스트 화면으로 이동
		Main.changeList();
	}

	/**
	 * 삭제 버튼
	 * @param event
	 * @throws IOException
	 */
	@FXML
	void actDelete(ActionEvent event) throws IOException {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("게시글 삭제");
		alert.setHeaderText("게시글 번호 [" + colNo.getText() + "]을/를 삭제하시겠습니까?");
		alert.setContentText("확인을 누르면 계속 진행됩니다.");

		// 사용자의 선택을 가져오기
		Optional<ButtonType> result = alert.showAndWait();

		if (result.isPresent() && result.get() == ButtonType.OK) {
			// TODO 데이터 삭제
			BoardService service = new BoardServiceImpl();
			service.delete(Integer.parseInt(colNo.getText()));

			// 리스트 화면으로 이동
			Main.changeList();
		}
	}

	/**
	 * 수정 버튼
	 * @param event
	 * @throws IOException
	 */
	@FXML
	void actUpdate(ActionEvent event) throws IOException {
		// 쓰기 화면으로 이동 : 수정모드, 글 번호
		Main.changeWrite(true, Integer.parseInt(colNo.getText()));
	}
}
