package Chapter012.Ex04_collection.set;

import java.util.HashSet;
import java.util.Iterator;

import Chapter012.Ex04_collection.Member;

public class MemberHashSet {
	private HashSet<Member> hashSet;

	public MemberHashSet() {
		hashSet = new HashSet<Member>();
	}

	public void addMember(Member member) {
		hashSet.add(member);
	}

	public void printCount() {
		int              result = 0;
		Iterator<Member> ir     = hashSet.iterator();

		while (ir.hasNext()) {
			ir.next();
			result++;
		}
		System.out.println(result + "명의 회원이 있습니다.");
		System.out.println();
	}

	public boolean removeMember(int memberId) {

		Iterator<Member> ir = hashSet.iterator();

		while (ir.hasNext()) {
			Member member = ir.next();
			int    tempId = member.getMemberId();
			if (tempId == memberId) {
				hashSet.remove(member);
				return true;
			}
		}

		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}

	public void showAllMember() {
		for (Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
