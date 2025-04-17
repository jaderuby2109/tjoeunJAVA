package application.DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import application.DTO.Board;

/**
 * 게시글 관련
 */
public class BoardDAO extends JDBConnection {

	/**
	 * 게시글 목록 조회
	 */
	public List<Board> selectList() {

		List<Board> boardList = new ArrayList<Board>();

		// SQL
		String sql = " SELECT * FROM board ";

		try {
			stmt = con.createStatement();		// 쿼리 실행 객체 생성
			rs   = stmt.executeQuery(sql);		// 쿼리 실행 - 결과 --> rs (ResultSet)

			// 조회 결과를 리스트에 추가
			while (rs.next()) {					// next() : 실행 결과의 다음 데이터로 이동
				Board board = new Board();

				// 결과 데이터 가져오기
				// rs.getXXX("컬럼명") --> 해당 컬럼의 데이터를 가져온다
				// - 실행 결과에서, "컬럼명"의 값을 특정 타입으로 반환
				board.setNo(rs.getInt("no"));
				board.setTitle(rs.getString("title"));
				board.setWriter(rs.getString("writer"));
				board.setContent(rs.getString("content"));
				board.setCreatedAt(rs.getTimestamp("created_at"));
				board.setUpdatedAt(rs.getTimestamp("updated_at"));

				boardList.add(board);
			}

		} catch (SQLException e) {
			System.err.println("게시글 목록 조회 시, 에러 발생");
			// e.printStackTrace();
			boardList = null;
		}
		return boardList;
	}

	/**
	 * 데이터 조회
	 * param : 글 번호
	 */
	public Board select(int no) {
		Board  board = new Board();
		String sql   = " SELECT * FROM board WHERE no = " + no;

		try {
			stmt = con.createStatement();		// 쿼리 실행 객체 생성
			rs   = stmt.executeQuery(sql);		// 쿼리 실행 - 결과 --> rs (ResultSet)

			// 조회 결과 가져오기
			if (rs.next()) {
				board.setNo(rs.getInt("no"));
				board.setTitle(rs.getString("title"));
				board.setWriter(rs.getString("writer"));
				board.setContent(rs.getString("content"));
				board.setCreatedAt(rs.getTimestamp("created_at"));
				board.setUpdatedAt(rs.getTimestamp("updated_at"));
			}

		} catch (SQLException e) {
			System.err.println("게시글 조회 시, 에러 발생");
			// e.printStackTrace();
			board = null;
		}
		return board;
	}

	/**
	 * 데이터 등록
	 * param : Board객체
	 */
	public int insert(Board board) {
		int result = 0;

		StringBuffer sql = new StringBuffer();
		sql.append(" INSERT INTO board( no, title, writer, content, created_at, updated_at ) ");
		sql.append(" VALUES( ?, ?, ?, ?, now(), now() ) ");

		try {
			psmt = con.prepareStatement(sql.toString());	// 쿼리 실행 객체 생성
			psmt.setInt(1, board.getNo());					// 1번 ? 에 번호을 매핑
			psmt.setString(2, board.getTitle());			// 2번 ? 에 제목을 매핑
			psmt.setString(3, board.getWriter());			// 3번 ? 에 작성자을 매핑
			psmt.setString(4, board.getContent());			// 4번 ? 에 내용을 매핑

			result = psmt.executeUpdate();					// SQL 실행 요청, 적용된 데이터 개수를 받아옴
																// 게시글 1개 쓰기 성공 시 : [result : 1]
																// 실패 시 : [result : 0]
		} catch (SQLException e) {
			System.err.println("게시글 등록 시, 에러 발생");
			// e.printStackTrace();
			result = -1;
		}
		return result;
	}

	/**
	 * 데이터 수정
	 * param : Board객체
	 */
	public int update(Board board) {

		int          result = 0;
		StringBuffer sql    = new StringBuffer();
		sql.append(" UPDATE board ");
		sql.append(" SET title = ? , content = ? , updated_at = now() ");
		sql.append(" WHERE no = ? ");
		// - now() : 현재 날짜/시간을 반환하는 MySQL 함수

		try {
			psmt = con.prepareStatement(sql.toString());
			psmt.setString(1, board.getTitle());			// 1번 ? 에 제목을 매핑
			psmt.setString(2, board.getContent());		// 2번 ? 에 내용을 매핑
			psmt.setInt(3, board.getNo());				// 3번 ? 에 게시글 번호를 매핑

			result = psmt.executeUpdate();

		} catch (SQLException e) {
			System.err.println("게시글 수정 시, 에러 발생");
			// e.printStackTrace();
			result = -1;
		}
		return result;
	}

	/**
	 * 데이터 삭제
	 * param : 글 번호
	 */
	public int delete(int no) {
		int result = 0;

		String sql = " DELETE FROM board WHERE no = " + no;

		try {
			stmt   = con.createStatement();
			result = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			System.err.println("게시글 삭제 시, 에러 발생");
			// e.printStackTrace();
			result = -1;
		}
		return result;
	}
}
