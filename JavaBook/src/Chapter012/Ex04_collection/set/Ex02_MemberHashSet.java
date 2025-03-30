package Chapter012.Ex04_collection.set;

import java.util.HashSet;
import java.util.Iterator;

import Chapter012.Ex04_collection.Member;

public class Ex02_MemberHashSet {
	private HashSet<Member> hashSet;

	public Ex02_MemberHashSet() {
		hashSet = new HashSet<Member>();
	}

	public void addMember(Member Member) {
		hashSet.add(Member);
	}

	public boolean removeMember(int MemberId) {

		// HashSet의 요소를 순회 할 수 있다.
		Iterator<Member> ir = hashSet.iterator();

		while (ir.hasNext()) {
			Member Member = ir.next();		// 회원을 하나씩 가져와서

			int tempId = Member.getMemberId();		// 아이디 비교
			if (tempId == MemberId) {				// 같은 아이디인 경우
				hashSet.remove(Member);				// 회원 삭제
				return true;
			}
		}

		System.out.println(MemberId + "가 존재하지 않습니다.");
		return false;
	}

	public void printCount() {
		int                      result = 0;
		Iterator<Member> ir     = hashSet.iterator();

		while (ir.hasNext()) {
			ir.next();
			result++;
		}
		System.out.println(result + "명의 회원이 있습니다.");
		System.out.println();
	}

	// 모든 멤버 출력
	public void showAllMember() {
		for (Member Member : hashSet) {
			System.out.println(Member);
		}
		System.out.println();
	}
}
