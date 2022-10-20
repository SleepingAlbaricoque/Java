package part9.inheritance.different_kinds_of_boxes;

import java.util.ArrayList;

/* 날짜 : 2022.10.20
 * 이름 : 조수빈
 * 내용 : 추상 클래스 실습하기 
 */
public abstract class Box {
	public abstract void add(Item item);
	
	public void add(ArrayList<Item> items) {
		for(Item item : items)
			Box.this.add(item);
	}
	
	public abstract boolean isInBox(Item item);
}
