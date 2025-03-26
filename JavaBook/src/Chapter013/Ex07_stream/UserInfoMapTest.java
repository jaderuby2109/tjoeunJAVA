package Chapter013.Ex07_stream;

import java.util.ArrayList;
import java.util.List;

class UserInfo {
	private String name;
	private int    age;

	public UserInfo(String name, int age) {
		this.name = name;
		this.age  = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}

public class UserInfoMapTest {

	public static void main(String[] args) {
		UserInfo userKim  = new UserInfo("김영희", 30);
		UserInfo userLee  = new UserInfo("이철수", 40);
		UserInfo userSong = new UserInfo("송영수", 55);

		List<UserInfo> userInfoList = new ArrayList<>();
		userInfoList.add(userKim);
		userInfoList.add(userLee);
		userInfoList.add(userSong);

		// 스트림을 사용하여 40세 이상인 사용자들의 이름 추출
		userInfoList.stream()
				// 40세 이상 사용자 필터링
				.filter(user -> user.getAge() >= 40)
				// 이름을 추출
				.map(UserInfo::getName)
				// 각 요소를 반복해서 출력
				.forEach(s -> System.out.println(s));

	}
}
