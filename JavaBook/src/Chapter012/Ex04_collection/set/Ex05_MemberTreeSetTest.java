package Chapter012.Ex04_collection.set;

import Chapter012.Ex04_collection.MemberHashCode;

public class Ex05_MemberTreeSetTest {

	public static void main(String[] args) {

		Ex05_MemberTreeSet memberTreeSet = new Ex05_MemberTreeSet();

		MemberHashCode memberPark = new MemberHashCode(1003, "박서훤");
		MemberHashCode memberLee  = new MemberHashCode(1001, "이지원");
		MemberHashCode memberSon  = new MemberHashCode(1002, "손민국");

		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberSon);
		memberTreeSet.addMember(memberPark);
		memberTreeSet.showAllMember();

		MemberHashCode memberHong = new MemberHashCode(1003, "김찬규");
		memberTreeSet.addMember(memberHong);
		memberTreeSet.showAllMember();
	}
}
