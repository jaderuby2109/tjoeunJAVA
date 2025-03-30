package Chapter012.Ex04_collection.set;

import java.util.Iterator;
import java.util.TreeSet;

import Chapter012.Ex04_collection.MemberComparable;

public class Ex06_MemberTreeSetComparable {

	private TreeSet<MemberComparable> treeSet;

	public Ex06_MemberTreeSetComparable() {
		treeSet = new TreeSet<MemberComparable>();
	}

	public void addMember(MemberComparable member) {
		treeSet.add(member);
	}

	public boolean removeMember(int memberId) {

		Iterator<MemberComparable> ir = treeSet.iterator();

		while (ir.hasNext()) {
			MemberComparable member = ir.next();
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
		for (MemberComparable member : treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
