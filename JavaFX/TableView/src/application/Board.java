package application;

import java.util.Date;

public class Board {

	private int    no;
	String         title;
	private String writer;
	private String content;
	private Date   createAt;
	private Date   updatedAt;
	private int    view;

	public Board() {

	}

	public Board(String title, String writer, String content) {
		this.title   = title;
		this.writer  = writer;
		this.content = content;
	}

	public Board(int no, String title, String writer, String content, Date createAt,
			Date updatedAt, int view) {
		this.no        = no;
		this.title     = title;
		this.writer    = writer;
		this.content   = content;
		this.createAt  = createAt;
		this.updatedAt = updatedAt;
		this.view      = view;
	}

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

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public int getView() {
		return view;
	}

	public void setView(int view) {
		this.view = view;
	}
}
