package part6.printing_collections;

import java.util.ArrayList;

/* 날짜 : 2022.09.29
 * 이름 : 조수빈
 * 내용 : toString 메서드 오버라이드 실습하긴
 */
class SimpleCollection{
	
	private String s;
	private ArrayList<String> list;
	
	public SimpleCollection(String s) {
		this.s = s;
		list = new ArrayList<>();
	}
	
	public void add(String s) {
		this.list.add(s);
	}
	
	public String toString() {
		if(list.isEmpty())
			return "The collection " + this.s + " is empty.";
		
		if(list.size() == 1) {
			
			String collection = list.get(0);
			
			return "The collection " + this.s + " has 1 element: \n" + collection;
		}
		
		String collection ="";
		for(String s : list) {
			if(!s.equals(list.get(list.size() -1)))
				collection += (s + "\n");
			else
				collection += s;
		}
		return "The collection " + this.s + " has " + list.size() + " elements: \n" + collection;
		
	}
	
}

public class PrintingACollection {
	public static void main(String[] args) {
		
		SimpleCollection s = new SimpleCollection("characters");
		System.out.println(s);

		System.out.println();

		s.add("magneto");
		System.out.println(s);

		System.out.println();

		s.add("mystique");
		System.out.println(s);

		System.out.println();

		s.add("phoenix");
		System.out.println(s);
	}
}
