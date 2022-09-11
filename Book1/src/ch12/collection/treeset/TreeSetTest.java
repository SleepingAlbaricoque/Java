package ch12.collection.treeset;

import java.util.TreeSet;

/* 날짜 : 2022.09.11
 * 이름 : 조수빈
 * 내용 : TreeSet 실습하기
 */
public class TreeSetTest {
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("홍길동");
		treeSet.add("강감찬");
		treeSet.add("이순신");
		
		for(String str : treeSet) {
			System.out.println(str);
		}
	}
}
