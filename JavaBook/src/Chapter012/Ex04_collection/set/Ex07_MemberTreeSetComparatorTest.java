package Chapter012.Ex04_collection.set;

import Chapter012.Ex04_collection.MemberComparator;

public class Ex07_MemberTreeSetComparatorTest {

	public static void main(String[] args) {

		Ex07_MemberTreeSetComparator memberTreeSet = new Ex07_MemberTreeSetComparator();

		MemberComparator memberPark = new MemberComparator(1003, "박서훤");
		MemberComparator memberLee  = new MemberComparator(1001, "이지원");
		MemberComparator memberSon  = new MemberComparator(1002, "손민국");

		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberSon);
		memberTreeSet.addMember(memberPark);
		memberTreeSet.showAllMember();

		MemberComparator memberHong = new MemberComparator(1003, "김찬규");
		memberTreeSet.addMember(memberHong);
		memberTreeSet.showAllMember();
	}
}
