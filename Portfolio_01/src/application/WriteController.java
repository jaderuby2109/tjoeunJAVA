package application;

import java.io.IOException;

import application.DTO.Board;
import application.Service.BoardService;
import application.Service.BoardServiceImpl;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class WriteController {

	@FXML
	private Label     colNo;		// 글번호
	@FXML
	private TextField colTitle;		// 제목
	@FXML
	private TextField colWriter;	// 글쓴이
	@FXML
	private TextArea  colContent;	// 내용
	@FXML
	private Label     lblTitle;		// 글쓰기, 글수정
	@FXML
	private Button    btnSave;		// 수정, 저장

	private int     no;				// 글번호
	private boolean isUpdate;		// true : 수정, false : 글쓰기

	public WriteController(boolean isUpdate, int no) {
		this.no       = no;
		this.isUpdate = isUpdate;
	}

	@FXML
	public void initialize() throws IOException {
		// 쓰기 모드인지 수정 모드인지 확인
		if (isUpdate) {
			// TODO 데이터 조회
			BoardService service = new BoardServiceImpl();
			Board        board   = service.select(no);

			// 화면에 데이터 표시
			colTitle.setText(board.getTitle());
			colContent.setText(board.getContent());
			colWriter.setText(board.getWriter());

			lblTitle.setText("글수정");
			btnSave.setText("저장");
			colNo.setDisable(true);
			colWriter.setDisable(true);
		} else {
			no = Main.MAX_COUNT + 1;
		}
		colNo.setText(String.valueOf(no));
	}

	/**
	 * 취소 버튼
	 * @param event
	 * @throws IOException
	 */
	@FXML
	void actCancel(ActionEvent event) throws IOException {
		if (isUpdate) {
			// 수정 모드 일때 - 읽기 화면으로 이동
			Main.changeRead(no);
		} else {
			// 쓰기 모드 일때 - 리스트 화면으로 이동
			Main.changeList();
		}
	}

	/**
	 * 저장 버튼
	 * @param event
	 * @throws IOException
	 */
	@FXML
	void actSave(ActionEvent event) throws IOException {
		// 글 번호
		int no = Integer.parseInt(colNo.getText());

		// 화면 정보 가져오기
		Board board = new Board();
		board.setNo(no);
		board.setTitle(colTitle.getText());
		board.setWriter(colWriter.getText());
		board.setContent(colContent.getText());

		if (isUpdate) {
			// TODO 데이터 수정
			BoardService service = new BoardServiceImpl();
			service.update(board);
		} else {
			// TODO 데이터 등록
			BoardService service = new BoardServiceImpl();
			service.insert(board);
		}

		// 읽기 화면으로 이동
		Main.changeRead(no);
	}
}
