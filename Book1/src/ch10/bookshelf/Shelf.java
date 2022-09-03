package ch10.bookshelf;

import java.util.ArrayList;

/* 날짜 : 2022.09.03
 * 이름 : 조수빈
 * 내용 : 인터페이스 구현과 클래스 상속하는 클래스 만들기 예제
 */
public class Shelf {
	protected ArrayList<String> shelf;
	
	public Shelf() {
		shelf = new ArrayList<String>();
	}
	
	public ArrayList<String> getShelf(){
		return shelf;
	}
	
	public int getCount() {
		return shelf.size();
	}
}
