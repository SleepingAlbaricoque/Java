package ch12.collection;

import java.util.LinkedList;

/* 날짜 : 2022.09.10
 * 이름 : 조수빈
 * 내용 : LinkedList 실습하기
 */
public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<>();
		
		myList.add("A");
		myList.add("B");
		myList.add("C");
		
		System.out.println(myList);
		
		myList.add(1, "D");
		System.out.println(myList);
		
		myList.addFirst("0");
		System.out.println(myList);
		
		System.out.println(myList.removeLast());
		System.out.println(myList);
	}
}
