package ch12.collection.hashset;

import java.util.HashSet;

/* 날짜 : 2022.09.10
 * 이름 : 조수빈
 * 내용 : HashSet 실습하기
 */
public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("임정순");
		hashSet.add("박현정");
		hashSet.add("홍연의");
		hashSet.add("강감찬");
		hashSet.add("강감찬");
		
		System.out.println(hashSet);
	}
}
