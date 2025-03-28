package Chapter013.Ex09_optional;

public class UserInfo {
	private int    id;		// 아이디
	private String name;	// 이름

	public UserInfo(int id, String name) {
		this.id   = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
