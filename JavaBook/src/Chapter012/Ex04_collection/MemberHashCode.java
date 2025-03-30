package Chapter012.Ex04_collection;

public class MemberHashCode {

	private int    memberId;
	private String memberName;

	public MemberHashCode(int memberId, String memberName) {
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
		if (obj instanceof MemberHashCode) {
			MemberHashCode member = (MemberHashCode) obj;
			if (this.memberId == member.memberId) return true;
			else return false;
		}
		return false;
	}
}
