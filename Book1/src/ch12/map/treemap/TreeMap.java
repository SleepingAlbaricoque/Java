package ch12.map.treemap;

import ch12.collection.Member;

public class TreeMap {
	public static void main(String[] args) {
		MemberTreeMap memberTreeMap = new MemberTreeMap();
		
		memberTreeMap.addMember(new Member(1003, "박서훤"));
		memberTreeMap.addMember(new Member(1001, "이지원"));
		memberTreeMap.addMember(new Member(1004, "홍길동"));
		memberTreeMap.addMember(new Member(1002, "손민국"));
		
		memberTreeMap.removeMember(1004);
		memberTreeMap.showAllMember();
	}
}
