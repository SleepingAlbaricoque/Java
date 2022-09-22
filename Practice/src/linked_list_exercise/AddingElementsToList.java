package linked_list_exercise;

import java.util.ArrayList;
import java.util.List;

/* 날짜 : 2022.09.22
 * 이름 : 조수빈
 * 내용 : linked list 만드는 예제 중에 list를 새로운 list 변수에 대입해서 새로운 변수에 새로운 element를 추가하였는데 기존 list에도 그 element가
 * 		 추가되는 것을 확인하였다. 
 * 		 In Java you pass variables by their reference. This means that whenever you do an assignment like list2 = list 
 * 		 the variable mWorkList will point to the same place in memory where list is currently pointing. 
 */
public class AddingElementsToList {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(3);
		list.add(5);
		
		System.out.println("list: " + list);
		
		List<Integer> list2 = new ArrayList<>();
		
		list2 = list;
		
		list2.add(7);
		
		System.out.println("list: " + list);
		
		int x =5;
		
		int y = x;
		
		y += 5;
		
		System.out.println(x);
		System.out.println(y);
	}
}
