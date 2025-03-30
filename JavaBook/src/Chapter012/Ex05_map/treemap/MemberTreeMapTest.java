package Chapter012.Ex05_map.treemap;

import Chapter012.Ex04_collection.MemberComparable;

public class MemberTreeMapTest {

	public static void main(String[] args) {

		MemberTreeMap memberHashMap = new MemberTreeMap();

		MemberComparable memberPark = new MemberComparable(1003, "박서훤");
		MemberComparable memberLee  = new MemberComparable(1001, "이지원");
		MemberComparable memberHong = new MemberComparable(1004, "홍길동>");
		MemberComparable memberSon  = new MemberComparable(1002, "손민국");

		memberHashMap.addMember(memberPark);
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberHong);
		memberHashMap.addMember(memberSon);

		memberHashMap.showAllMember();

		memberHashMap.removeMember(1004);
		memberHashMap.showAllMember();
	}
}
