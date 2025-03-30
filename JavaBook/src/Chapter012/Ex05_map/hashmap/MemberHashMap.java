package Chapter012.Ex05_map.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import Chapter012.Ex04_collection.MemberHashCode;

public class MemberHashMap {

	// 변수 선언
	private HashMap<Integer, MemberHashCode> hashMap;

	// 생성자
	public MemberHashMap() {
		hashMap = new HashMap<Integer, MemberHashCode>();
	}

	// 회원 추가
	public void addMember(MemberHashCode member) {
		hashMap.put(member.getMemberId(), member);
	}

	// 회원 삭제
	public boolean removeMember(int memberId) {
		
		// 매개변수로 받은 key 값인 회원 아이디가 있다면
		if (hashMap.containsKey(memberId)) {
			// 해당 회원 삭제
			hashMap.remove(memberId);
			return true;
		}

		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}

	// 전체 회원 삭제
	public void showAllMember() {
		// 전체 key 값을 가져옴
		// Set<Integer> keySet = hashMap.keySet();
		// 전체 value 값을 가져옴
		// Collection<MemberHashCode> values = hashMap.values();
		Iterator<Integer> ir = hashMap.keySet().iterator();
		// 다음 키가 있다면
		while (ir.hasNext()) {
			int            key    = ir.next();			// key값을 가져와서
			MemberHashCode member = hashMap.get(key);	// key로 부터 value 가져오기
			System.out.println(member);
		}
		System.out.println();
	}
}
