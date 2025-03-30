package Chapter012.Ex04_collection.set;

import Chapter012.Ex04_collection.Member;

public class Ex02_MemberHashSetTest {

	public static void main(String[] args) {

		Ex02_MemberHashSet memberHashSet = new Ex02_MemberHashSet();

		Member memberLee  = new Member(1001, "이지원");
		Member memberSon  = new Member(1002, "손민국");
		Member memberPark = new Member(1003, "박서훤");
		Member member1    = new Member(1004, "박서훤");
		Member member2    = new Member(1005, "박서훤");
		Member member3    = new Member(1006, "박서훤");
		Member member4    = new Member(1003, "서훤");
		Member member5    = new Member(1003, "박훤");
		Member member6    = new Member(1003, "박서");

		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberSon);
		memberHashSet.addMember(memberPark);
		memberHashSet.addMember(member1);
		memberHashSet.addMember(member2);
		memberHashSet.addMember(member3);
		memberHashSet.addMember(member4);
		memberHashSet.addMember(member5);
		memberHashSet.addMember(member6);
		memberHashSet.showAllMember();
		memberHashSet.printCount();

		System.out.println("========== 추가 ==========");
		System.out.println("일치 - 일치 안함");
		Member addMember1 = new Member(1003, "홍길동");
		memberHashSet.addMember(addMember1);
		memberHashSet.printCount();

		System.out.println("일치 안함 - 일치");
		Member addMember2 = new Member(1007, "박서훤");
		memberHashSet.addMember(addMember2);
		memberHashSet.printCount();

		System.out.println("일치 안함 - 일치 안함");
		Member addMember3 = new Member(1008, "홍길동");
		memberHashSet.addMember(addMember3);
		memberHashSet.printCount();

		System.out.println("========== 삭제 ==========");
		memberHashSet.printCount();

		memberHashSet.removeMember(1002);
		memberHashSet.printCount();

		memberHashSet.removeMember(1009);
		memberHashSet.printCount();
	}
}
