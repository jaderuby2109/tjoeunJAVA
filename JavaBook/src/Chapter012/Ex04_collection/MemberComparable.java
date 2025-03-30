package Chapter012.Ex04_collection;

public class MemberComparable implements Comparable<MemberComparable> {

	private int    memberId;
	private String memberName;

	public MemberComparable(int memberId, String memberName) {
		this.memberId   = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {   // toString 메서드 재정의
		return memberName + " 회원님의 아이디는 " + memberId + "입니다";
	}

	@Override
	public int hashCode() {
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof MemberComparable) {
			MemberComparable member = (MemberComparable) obj;
			if (this.memberId == member.memberId) return true;
			else return false;
		}
		return false;
	}

	@Override
	public int compareTo(MemberComparable o) {
		// memberId 새로 추가 한 값
		// o 매개변수
		// 오름차순
		return memberId - o.getMemberId() ;
		// 내림차순
		// return o.getMemberId() - memberId;
	}
}
