package part6.liquid_containers;

/* 날짜 : 2022.10.05
 * 이름 : 조수빈
 * 내용 : OOP 실습하기
 */
public class Container {
	private int basket;
	
	public int contains() {
		return basket;
	}
	
	public void add(int amount) {
		if(amount <0)
			return;
		
		if(amount + basket <=100)
			basket += amount;
		else
			basket = 100;
	}
	
	public void remove(int amount) {
		if(amount <0)
			return;
		
		if(amount <= basket)
			basket -= amount;
		else
			basket =0;
	}
	
	public String toString() {
		return this.contains() + "/100";
	}
}
