package Chapter012.Ex04_collection.set;

import java.util.HashSet;
import java.util.Iterator;

import Chapter012.Ex04_collection.MemberHashCode;

public class Ex03_MemberHashSetHashCode {
	private HashSet<MemberHashCode> hashSet;

	public Ex03_MemberHashSetHashCode() {
		hashSet = new HashSet<MemberHashCode>();
	}

	public void addMember(MemberHashCode member) {
		hashSet.add(member);
	}

	public boolean removeMember(int memberId) {

		Iterator<MemberHashCode> ir = hashSet.iterator();

		while (ir.hasNext()) {
			MemberHashCode member = ir.next();
			int            tempId = member.getMemberId();
			if (tempId == memberId) {
				hashSet.remove(member);
				return true;
			}
		}

		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}

	public void printCount() {
		int                      result = 0;
		Iterator<MemberHashCode> ir     = hashSet.iterator();

		while (ir.hasNext()) {
			ir.next();
			result++;
		}
		System.out.println(result + "명의 회원이 있습니다.");
		System.out.println();
	}

	public void showAllMember() {
		for (MemberHashCode member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
