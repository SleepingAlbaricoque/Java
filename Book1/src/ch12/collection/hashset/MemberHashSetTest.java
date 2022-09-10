package ch12.collection.hashset;

import ch12.collection.Member;

public class MemberHashSetTest {
	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();
		
		memberHashSet.addMember(new Member(1001, "이지원"));
		memberHashSet.addMember(new Member(1002, "손민국"));
		memberHashSet.addMember(new Member(1003, "박서훤"));
		memberHashSet.addMember(new Member(1003, "홍길동"));
		memberHashSet.showAllMember();
	}
}
