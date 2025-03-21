package board;

// 게시글 정보를 정의한 객체
// 글 번호, 제목, 작성자, 내용, 등록일자, 수정일자
/**
 * 게시글 정보 - 게시글 번호 - 제목 - 작성자 - 내용 - 등록일자 - 수정일자
 */
public class Board {
	// 멤버 변수 (필드)

	private int    no;
	private String title;
	private String writer;
	private String content;
	private String createAt;
	private String updateAt;

	// 기본 생성자
	public Board() {
		this("제목 없음", "작성자 없음", "내용 없음");

	}

	// 매개변수가 있는 생성자 - title, writer, content
	public Board(String title, String writer, String content) {
		this.title   = title;
		this.writer  = writer;
		this.content = content;
	}

	// 전체 매개변수 생성자
	public Board(int no, String title, String writer, String content, String createAt, String updateAt) {
		this.no       = no;
		this.title    = title;
		this.writer   = writer;
		this.content  = content;
		this.createAt = createAt;
		this.updateAt = updateAt;
	}

	// getter, setter
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCreateAt() {
		return createAt;
	}

	public void setCreateAt(String createAt) {
		this.createAt = createAt;
	}

	public String getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(String updateAt) {
		this.updateAt = updateAt;
	}

	// toString
	@Override
	public String toString() {
		return "Board [no=" + no + ", title=" + title + ", writer=" + writer + ", content=" + content + ", createAt=" + createAt + ", updateAt=" + updateAt + "]";
	}

}
