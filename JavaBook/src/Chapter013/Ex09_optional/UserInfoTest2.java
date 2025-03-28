package Chapter013.Ex09_optional;

import java.util.ArrayList;

public class UserInfoTest2 {

	public static void main(String[] args) {
		ArrayList<UserInfo> userInfoList = new ArrayList<>();

		userInfoList.add(new UserInfo(12345, "James"));
		userInfoList.add(new UserInfo(12346, "Tomas"));
		userInfoList.add(new UserInfo(12347, "Edward"));

//		UserInfo userInfo = getUserInfoById(12345, userInfoList);
		UserInfo userInfo = getUserInfoById(1234855, userInfoList);
		if (userInfo != null) {
			System.out.println(userInfo.getName());
		} else {
			System.out.println("종료");
		}
	}

	public static UserInfo getUserInfoById(int id, ArrayList<UserInfo> list) {
		for (UserInfo userInfo : list) {
			if (id == userInfo.getId()) return userInfo;
		}
		return null;
	}
}
