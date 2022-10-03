package part6.santas_workshop;

/* 날짜 : 2022.10.03
 * 이름 : 조수빈
 * 내용 : 멤버 변수 List의 객체 요소값의 합 구하기
 */
public class Gift {
	private String name;
	private int weight;
	
	public Gift(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public String toString() {
		return name + "(" + weight + " kg)";
	}
}
