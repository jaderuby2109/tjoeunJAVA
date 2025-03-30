package Chapter012.Ex05_map.hashmap;

import Chapter012.Ex04_collection.MemberHashCode;

public class MemberHashMapTest {

	public static void main(String[] args) {

		MemberHashMap memberHashMap = new MemberHashMap();

		MemberHashCode memberLee   = new MemberHashCode(1001, "이지원");
		MemberHashCode memberSon   = new MemberHashCode(1002, "손민국");
		MemberHashCode memberPark  = new MemberHashCode(1003, "박서훤");
		MemberHashCode memberHong  = new MemberHashCode(1004, "홍길동");
		MemberHashCode memberHong2 = new MemberHashCode(1004, "홍길동>");

		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberSon);
		memberHashMap.addMember(memberPark);
		memberHashMap.addMember(memberHong);
		memberHashMap.addMember(memberHong2);

		memberHashMap.showAllMember();

		memberHashMap.removeMember(1004);
		memberHashMap.showAllMember();
	}
}
