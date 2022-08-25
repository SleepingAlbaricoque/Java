package ch06.singleton_practice;

/* 날짜 : 2022.08.25
 * 이름 : 조수빈
 * 내용 : singleton 패턴으로 클래스 구현 연습
 */
public class CarFactoryTest {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();
		Car mySonata = factory.createCar();
		Car yourSonata = factory.createCar();
		System.out.println(mySonata.getCarNum());
		System.out.println(yourSonata.getCarNum());
	}
}
