package part6.cargo_hold;

/* 날짜 : 2022.10.03
 * 이름 : 조수빈
 * 내용 : 멤버 변수 list 요소값 선택 출력하기
 */
public class Item {
	private String name;
	private int weight;
	
	public Item(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}
	
	public int getWeight() {
		return weight;
	}
	
	@Override
	public String toString() {
		return name + " (" + weight + " kg)";
		}
}
