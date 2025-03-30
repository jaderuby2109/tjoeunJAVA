package Chapter012.Ex04_collection.set;

import Chapter012.Ex04_collection.MemberComparable;

public class Ex06_MemberTreeSetComparableTest {

	public static void main(String[] args) {

		Ex06_MemberTreeSetComparable memberTreeSet = new Ex06_MemberTreeSetComparable();

		MemberComparable memberPark = new MemberComparable(1003, "박서훤");
		MemberComparable memberLee  = new MemberComparable(1001, "이지원");
		MemberComparable memberSon  = new MemberComparable(1002, "손민국");

		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberSon);
		memberTreeSet.addMember(memberPark);
		memberTreeSet.showAllMember();

		MemberComparable memberHong = new MemberComparable(1003, "김찬규");
		memberTreeSet.addMember(memberHong);
		memberTreeSet.showAllMember();
	}
}
