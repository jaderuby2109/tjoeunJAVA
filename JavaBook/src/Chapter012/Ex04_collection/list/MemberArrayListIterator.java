package Chapter012.Ex04_collection.list;

import java.util.ArrayList;
import java.util.Iterator;

import Chapter012.Ex04_collection.Member;

public class MemberArrayListIterator {

	private ArrayList<Member> arrayList;

	public MemberArrayListIterator() {
		arrayList = new ArrayList<Member>();
	}

	// 회원 추가
	public void addMember(Member member) {
		arrayList.add(member);
	}

	// 회원 삭제
	public boolean removeMember(int memberId) {
		// set에서 get() 사용 불가
		// Iterator : 순회한다.
		Iterator<Member> ir = arrayList.iterator();	// 순서가 없는 클래스도 요소를 순회할 수 있다
		
		while (ir.hasNext()) {						// 다음 요소가 있는가?
			Member member = ir.next();				// 다음 요소를 가져옴
			int    tempId = member.getMemberId();
			if (tempId == memberId) {				// 회원 아이디와 매개변수가 일치 하나?
				arrayList.remove(member);			// 해당 회원 삭제
				return true;
			}
		}

		System.out.println(memberId + "가 존재하지 않습니다");
		return false;
	}

	// 전체 회원 출력
	public void showAllMember() {
		for (Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
}
