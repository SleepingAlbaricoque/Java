package ch12.collection.arraylist;

import ch12.collection.Member;

public class MemberArrayListTest {
	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		
		memberArrayList.addMember(new Member(1001, "이지원"));
		memberArrayList.addMember(new Member(1002, "손민국"));
		memberArrayList.addMember(new Member(1003, "박서훤"));
		memberArrayList.addMember(new Member(1004, "홍길동"));
		
		memberArrayList.showAllMember();
		
		memberArrayList.removeMember(memberArrayList.get(3).getMemberId());
		memberArrayList.showAllMember();
		
		memberArrayList.insertMember(1000, "미하일", 2);
		memberArrayList.showAllMember();
	}
}
