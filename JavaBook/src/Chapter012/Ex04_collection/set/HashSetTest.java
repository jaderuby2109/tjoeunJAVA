package Chapter012.Ex04_collection.set;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {

		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add(new String("임정순"));
		hashSet.add(new String("박현정"));
		hashSet.add(new String("홍연의"));
		hashSet.add(new String("강감찬"));
		hashSet.add(new String("강감찬"));

		// 중복 값 불가
		// 추가한 순서와 상관 없이 출력된다.
		System.out.println(hashSet);
	}
}
