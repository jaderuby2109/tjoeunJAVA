package Chapter012.Ex04_collection.set;

import java.util.Iterator;
import java.util.TreeSet;

import Chapter012.Ex04_collection.MemberHashCode;

public class Ex05_MemberTreeSet {

	private TreeSet<MemberHashCode> treeSet;

	public Ex05_MemberTreeSet() {
		treeSet = new TreeSet<MemberHashCode>();
	}

	public void addMember(MemberHashCode member) {
		treeSet.add(member);
	}

	public boolean removeMember(int memberId) {

		Iterator<MemberHashCode> ir = treeSet.iterator();

		while (ir.hasNext()) {
			MemberHashCode member = ir.next();
			int    tempId = member.getMemberId();
			if (tempId == memberId) {
				treeSet.remove(member);
				return true;
			}
		}

		System.out.println(memberId + "가 존재하지 않습니다");
		return false;
	}

	public void showAllMember() {
		for (MemberHashCode member : treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
