package part6.stack;

import java.util.ArrayList;

/* 날짜 : 2022.09.28
 * 이름 : 조수빈
 * 내용 : list를 멤버 변수로 갖는 클래스 생성 실습
 */
public class Stack {
	
	private ArrayList<String> list;
	
	public Stack() {
		this.list = new ArrayList<>();
	}
	
	public boolean isEmpty() {
		if(this.list.size() == 0)
			return true;
		
		return false;
	}
	
	public void add(String value) {
		this.list.add(value);
	}
	
	public ArrayList<String> values() {
		return this.list;
	}
	
	public String take() {
		return this.list.remove(this.list.size() -1);
	}
	
	public static void main(String[] args) {
		Stack s = new Stack();
		
		s.add("1");
		s.add("2");
		s.add("3");
		s.add("4");
		s.add("5");

		while (!s.isEmpty()) {
		    System.out.println(s.take());
		}
	}
}
