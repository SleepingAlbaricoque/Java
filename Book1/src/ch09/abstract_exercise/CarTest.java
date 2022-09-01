package ch09.abstract_exercise;

/* 날짜 : 2022.09.01
 * 이름 : 조수빈
 * 내용 : 추상 클래스 구현 실습
 */
public class CarTest {
	public static void main(String[] args) {
		Bus bus = new Bus();
		AutoCar autoCar = new AutoCar();
		
		bus.run();
		autoCar.run();
		
		bus.refuel();
		autoCar.refuel();
		
		bus.takePassenger();
		autoCar.load();
		
		bus.stop();
		autoCar.stop();
	}
}
