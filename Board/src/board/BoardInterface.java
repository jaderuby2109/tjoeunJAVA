package board;

// 게시판 프로그램 기능 정의
// 게시글 등록, 목록, 조회, 수정, 삭제
/**
 * 게시판 인터페이스 - 데이터 등록 - 데이터 목록 - 데이터 조회 - 데이터 수정 - 데이터 삭제
 */
public interface BoardInterface {
	// 게시글 최대 갯수
	int MAX_COUNT = 10;

	/**
	 * 데이터 등록
	 * - 제목, 작성자, 내용이 포함된 객체를 전달받아, 
	 *   글번호, 등록일자, 수정일자를 세팅하고 게시글 저장 한 뒤
	 *   생성된 게시글 객체를 반환한다.
	 * @param board
	 * @return 생성된 게시글 객체
	 */
	Board create(Board board);

	/**
	 * 데이터 목록
	 * - 게시글이 존재하는지 확인하고 1개의 게시글도 없으면 null 반환
	 * - 게시글이 존재하면, 전체 게시글 목록인 Board[]을 반환
	 * @return
	 */
	Board[] list();

	/**
	 * 데이터 조회
	 * - 게시글 번호가 유효하지 않으면, null 반환
	 * - 게시글 번호를 넘겨받아, 해당 글번호의 게시글 객체를 반환
	 * @param no
	 * @return
	 */
	Board read(int no);

	/**
	 * 데이터 수정
	 * - 수정 할 글 번호와 수정 글 정보를 전달받고
	 * - 수정 할 글 번호가 유효하면, 번호에 해당하는 글 정보를 수정한다.
	 * - 게시글 정보를 수정하고, 수정 일자를 현재 날짜/시간으로 변경한다.
	 * - 수정에 성공하면 treu, 실패하면 false 를 반환한다.
	 * @param board
	 * @return
	 */
	boolean update(Board board);

	/**
	 * 데이터 삭제
	 * - 삭제 할 글 번호를 전달받아,
	 * - 삭제 할 글 번호가 유효하면, 번호에 해당하는 게시글 객체를 null로 변경
	 * - 삭제 성공 시 true, 실패 시 false를 반환한다.
	 * @param no
	 * @return
	 */
	boolean delete(int no);

}
