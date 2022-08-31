package sub6;

// 클래스 정의
public class Car {

	// 자동차의 속성(멤버 변수)
	protected String name;
	protected String color;
	protected int speed; //전역변수
	
	// 생성자
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
	}
	
	
	// 자동차의 기능(멤버 메서드)
	public void speedUp (int speed) {
		this.speed += speed; //this를 붙이면 전역변수 가리킴 => 전역변수에 전역변수 + 지역변수 speed를 더해서 대입
	}
	public void speedDown (int speed) {
		this.speed -= speed;
		
	}
	public void show () {
		System.out.println("차량명 : " + name);
		System.out.println("차량색 : " + color);
		System.out.println("속도 : " + speed);
		
	}
	
	
}
