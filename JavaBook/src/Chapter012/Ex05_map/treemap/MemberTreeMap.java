package Chapter012.Ex05_map.treemap;

import java.util.Iterator;
import java.util.TreeMap;

import Chapter012.Ex04_collection.MemberComparable;

public class MemberTreeMap {

	private TreeMap<Integer, MemberComparable> treeMap;

	public MemberTreeMap() {
		treeMap = new TreeMap<Integer, MemberComparable>();
	}

	public void addMember(MemberComparable member) {
		treeMap.put(member.getMemberId(), member);
	}

	public boolean removeMember(int memberId) {

		if (treeMap.containsKey(memberId)) {
			treeMap.remove(memberId);
			return true;
		}

		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}

	public void showAllMember() {
		Iterator<Integer> ir = treeMap.keySet().iterator();
		while (ir.hasNext()) {
			int              key    = ir.next();
			MemberComparable member = treeMap.get(key);
			System.out.println(member);
		}
		System.out.println();
	}
}
