package part6.longest_in_collection;

import java.util.ArrayList;

/* 날짜 : 2022.10.03
 * 이름 : 조수빈
 * 내용 : 멤버 변수 list 요소 중 가장 큰 값 리턴하기
 */
public class SimpleCollection {

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
	
	public String longest() {
		if(this.list.isEmpty()) {
			return null;
		}
		
		String returnStr = this.list.get(0);
		
		for(String s : list) {
			if(s.length() > returnStr.length())
				returnStr = s;
		}
		return returnStr;
	}
	
	public static void main(String[] args) {
		SimpleCollection j = new SimpleCollection("characters");
		System.out.println("Longest: " + j.longest());

		j.add("magneto");
		j.add("mystique");
		j.add("phoenix");

		System.out.println("Longest: " + j.longest());
	}
}
