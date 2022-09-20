package ch13.stream;

/* 날짜 : 2022.09.20
 * 이름 : 조수빈
 * 내용 : 스트림 활용하여 여행 비용 계산기 만들기 
 */
public class TravelCustomer {
	private String name;
	private int age;
	private int price;
	
	public TravelCustomer(String name, int age, int price) {
		this.name = name;
		this.age = age;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String toString() {
		return "name:" + name + " age:" + age + " price:" + price;
	}
	
}
