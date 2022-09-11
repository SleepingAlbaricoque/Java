package ch12.map.hashmap;

import ch12.collection.Member;

public class MemberHashMapTest {
	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();
		
		memberHashMap.addMember(new Member(1001, "이지원"));
		memberHashMap.addMember(new Member(1002, "손민국"));
		memberHashMap.addMember(new Member(1003, "박서훤"));
		memberHashMap.addMember(new Member(1004, "홍길동"));
		
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(1004);
		memberHashMap.showAllMember();
	}
}
