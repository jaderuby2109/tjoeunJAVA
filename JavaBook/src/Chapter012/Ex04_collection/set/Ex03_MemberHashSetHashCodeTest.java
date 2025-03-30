package Chapter012.Ex04_collection.set;

import Chapter012.Ex04_collection.MemberHashCode;

public class Ex03_MemberHashSetHashCodeTest {

	public static void main(String[] args) {

		Ex03_MemberHashSetHashCode memberHashSet = new Ex03_MemberHashSetHashCode();

		MemberHashCode memberLee  = new MemberHashCode(1001, "이지원");
		MemberHashCode memberSon  = new MemberHashCode(1002, "손민국");
		MemberHashCode memberPark = new MemberHashCode(1003, "박서훤");
		MemberHashCode member1    = new MemberHashCode(1004, "박서훤");
		MemberHashCode member2    = new MemberHashCode(1005, "박서훤");
		MemberHashCode member3    = new MemberHashCode(1006, "박서훤");
		MemberHashCode member4    = new MemberHashCode(1003, "서훤");
		MemberHashCode member5    = new MemberHashCode(1003, "박훤");
		MemberHashCode member6    = new MemberHashCode(1003, "박서");

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
		MemberHashCode addMember1 = new MemberHashCode(1003, "홍길동");
		memberHashSet.addMember(addMember1);
		memberHashSet.printCount();

		System.out.println("일치 안함 - 일치");
		MemberHashCode addMember2 = new MemberHashCode(1007, "박서훤");
		memberHashSet.addMember(addMember2);
		memberHashSet.printCount();

		System.out.println("일치 안함 - 일치 안함");
		MemberHashCode addMember3 = new MemberHashCode(1008, "홍길동");
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
