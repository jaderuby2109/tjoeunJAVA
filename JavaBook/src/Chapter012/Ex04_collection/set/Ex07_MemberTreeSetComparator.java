package Chapter012.Ex04_collection.set;

import java.util.Iterator;
import java.util.TreeSet;

import Chapter012.Ex04_collection.MemberComparator;

public class Ex07_MemberTreeSetComparator {

	private TreeSet<MemberComparator> treeSet;

	public Ex07_MemberTreeSetComparator() {
		treeSet = new TreeSet<MemberComparator>();
		// treeSet = new TreeSet<MemberComparator>(new MemberComparator());
	}

	public void addMember(MemberComparator member) {
		treeSet.add(member);
	}

	public boolean removeMember(int memberId) {

		Iterator<MemberComparator> ir = treeSet.iterator();

		while (ir.hasNext()) {
			MemberComparator member = ir.next();
			int              tempId = member.getMemberId();
			if (tempId == memberId) {
				treeSet.remove(member);
				return true;
			}
		}

		System.out.println(memberId + "가 존재하지 않습니다");
		return false;
	}

	public void showAllMember() {
		for (MemberComparator member : treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
