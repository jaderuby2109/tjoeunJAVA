package Chapter012.Ex04_collection.list;

import java.util.ArrayList;

import Chapter012.Ex04_collection.Member;

public class MemberArrayList {

	private ArrayList<Member> arrayList;

	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}

	// 회원 추가
	public void addMember(Member member) {
		arrayList.add(member);
	}

	// 회원 삭제
	public boolean removeMember(int memberId) {

		// add, get, remove는 Collection 클래스에서 선언, ArrayList에서 구현
		for (int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);
			int    tempId = member.getMemberId();
			if (tempId == memberId) {				// 회원 아이디가 매개변수와 일치하면
				arrayList.remove(i);				// 해당 회원을 삭제
				// 회원 아이디가 일치하는 회원이 있었으므로 삭제하고 회원 삭제 메서드 종료
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
