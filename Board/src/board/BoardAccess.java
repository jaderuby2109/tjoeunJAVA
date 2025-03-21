package board;

// 게시글 기능 구현 클래스
public class BoardAccess implements BoardInterface {

	// 게시글 개수
	int count = 10;
	// 게시글 목록
	Board[] boardList = new Board[BoardInterface.MAX_COUNT];

	public BoardAccess() {
		boardList[0] = new Board(1, "제목01", "작성자01", "내용01", "2025/03/19 - 18:00:00", "2025/03/19 - 18:00:00");
		boardList[1] = new Board(2, "제목02", "작성자02", "내용02", "2025/03/19 - 18:00:00", "2025/03/19 - 18:00:00");
		boardList[2] = new Board(3, "제목03", "작성자03", "내용03", "2025/03/19 - 18:00:00", "2025/03/19 - 18:00:00");
		boardList[3] = new Board(4, "제목04", "작성자04", "내용04", "2025/03/19 - 18:00:00", "2025/03/19 - 18:00:00");
		boardList[4] = new Board(5, "제목05", "작성자05", "내용05", "2025/03/19 - 18:00:00", "2025/03/19 - 18:00:00");
		boardList[5] = new Board(6, "제목06", "작성자06", "내용06", "2025/03/19 - 18:00:00", "2025/03/19 - 18:00:00");
		boardList[6] = new Board(7, "제목07", "작성자07", "내용07", "2025/03/19 - 18:00:00", "2025/03/19 - 18:00:00");
		boardList[7] = new Board(8, "제목08", "작성자08", "내용08", "2025/03/19 - 18:00:00", "2025/03/19 - 18:00:00");
		boardList[8] = new Board(9, "제목09", "작성자09", "내용09", "2025/03/19 - 18:00:00", "2025/03/19 - 18:00:00");
		boardList[9] = new Board(10, "제목10", "작성자10", "내용10", "2025/03/19 - 18:00:00", "2025/03/19 - 18:00:00");
	}

	/**
	 * 게시글 등록
	 * 1. 매개변수로 넘겨받은 board 객체에 게시글 번호를 부여한다.
	 * 2. 등록일자와 수정일자를 현재 날짜/시간으로 지정한다.
	 * 3. board 객체를 현재까지 등록된 배열 요소 다음 index에 저장한다.
	 * 4. 등록된 board 객체를 반환한다.
	 * * 게시글 목록이 가득 찼는지 확인한다.
	 */
	@Override
	public Board create(Board board) {
		if (this.count == BoardInterface.MAX_COUNT) {
			System.out.println("게시글 목록이 꽉 찼습니다.");
			return null;
		}

		int no = ++count;

		String createdAt = "2025/03/19 - 18:00";
		String updatedAt = "2025/03/19 - 18:00";

		board.setNo(no);
		board.setCreateAt(createdAt);
		board.setUpdateAt(updatedAt);

		boardList[no - 1] = board;
		System.out.println(board);
		System.out.println("게시글이 등록되었습니다.");

		return board;

	}

	/**
	 * 게시글 목록
	 * 1. 게시글이 존재하는지 확인하고 1개의 게시글도 없으면 null 반환
	 * 2. 게시글이 존재하면, 전체 게시글 배열인 boardList를 반환
	 */
	@Override
	public Board[] list() {

		if (this.count == 0) {
			System.out.println("조회된 게시글이 없습니다.");
			return null;
		}

		System.out.println("게시글 목록을 조회합니다.");
		return boardList;
	}

	/**
	 * 데이터 조회
	 * 1. 게시글 번호가 유효하지 않으면, null 반환
	 * 2. 게시글 번호를 넘겨받아, 해당 글번호의 게시글 객체를 반환
	 */
	@Override
	public Board read(int no) {
		if (checkNo(no)) {
			return null;
		}
		return this.boardList[no - 1];
	}

	/**
	 * 데이터 수정
	 * 1. 수정할 게시글 번호 no 가 유효하면 않으면 false
	 * 2. 수정할 게시글 번호 no 가 유효하면,
	 *  - 번호에 해당하는 boardList[]의 요소 변경
	 *  - 수정일자(setUpdateAt)를 현재 날짜/시간으로 변경
	 *  - 수정 완료 후 true 를 반환
	 */
	@Override
	public boolean update(Board board) {
		if (checkNo(board.getNo())) {
			return false;
		}

		Board result = read(board.getNo());
		if (null == result)
			return false;

		String date = "2025/03/20 - 11:00:00";

		Board updateBoard = this.boardList[board.getNo() - 1];
		updateBoard.setTitle(board.getTitle());
		updateBoard.setWriter(board.getWriter());
		updateBoard.setContent(board.getContent());
		updateBoard.setUpdateAt(date);

		return true;
	}

	/**
	 * 데이터 삭제
	 * 1. 삭제 할 게시글 번호 no 가 유효하지 않으면, false 반환
	 * 2. 게시글이 하나도 존재하지 않으면, false 반환
	 * 3. 삭제할 게시글 번호 no 가 유효하지 하면,
	 *  - 번호에 해당하는 boardList[] 요소를 null로 변경 (삭제)
	 *  - 해당 index 다음의 요소들을 앞으로 한칸 씩 당겨준다.
	 *  - 게시글 개수 count를 1개 감소시킨다.
	 * 4. 글번호 재셋팅
	 */
	@Override
	public boolean delete(int no) {
		if (checkNo(no)) {
			return false;
		}

		if (count == 0) {
			System.out.println("삭제 할 게시글이 없습니다.");
		}

		Board result = read(no);
		if (null == result)
			return false;

		// 게시글 삭제
		// this.boardList[no] = null ;

		// 앞으로 한 칸씩 당기기
		for (int i = no; i < this.boardList.length; i++) {
			// 바로 앞의 위치 = 현재 접근 위치
			this.boardList[i - 1] = this.boardList[i];
		}
		// 마지막 글 지우기
		this.boardList[this.boardList.length - 1] = null;

		this.count--;

		// 글 번호 재 셋팅
		for (int i = 0; i < this.boardList.length; i++) {
			if (null != this.boardList[i])
				this.boardList[i].setNo(i + 1);

		}

		// 게시글 삭제 성공
		System.out.println(no + "번 게시글을 삭제하였습니다.");
		return true;
	}

	private boolean checkNo(int no) {
		if (no > BoardInterface.MAX_COUNT || no < 0) {
			System.out.print("게시글 번호는 1 ~ ");
			System.out.println(BoardInterface.MAX_COUNT + "번 까지만 존재합니다.");
			return true;
		}
		return false;
	}

}
