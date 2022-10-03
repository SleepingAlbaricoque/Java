package part6.to_do_list;

import java.util.ArrayList;

/* 날짜 : 2022.10.03
 * 이름 : 조수빈
 * 내용 : 깔끔한 유저 인터페이스 만들기
 */
public class TodoList {
	private String task;
	private ArrayList<String> list;
	
	public TodoList() {
		this.list = new ArrayList<>();
	}
	
	public void add(String task) {
		this.list.add(task);
	}
	
	public void print() {
		for(int i =0; i < list.size(); i++)
			System.out.println(i+1 + ": " + list.get(i));
	}
	
	public void remove(int number) {
		this.list.remove(number-1);
	}
}
