package ch12.collection.treeset;

import ch12.collection.Member;

public class MemberTreeSetTest {
	public static void main(String[] args) {
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		memberTreeSet.addMember(new Member(1003, "박서훤"));
		memberTreeSet.addMember(new Member(1001, "이지원"));
		memberTreeSet.addMember(new Member(1002, "손민국"));
		
		memberTreeSet.addMember(new Member(1003, "홍길동"));
		memberTreeSet.showAllMember();
	}
}
