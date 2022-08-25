package sub3;

/* 날짜 : 2022.08.25
 * 이름 : 조수빈
 * 내용 : Java 클래스 변수, 클래스 메서드 실습하기
 * 
 * 클래스 변수, 클래스 메서드(정적 변수, 정적 메서드)
 * - static을 선언한 변수, 메서드로 Java Class Area(Method Area)에 생성
 * - 객체를 생성하지 않고 해당 클래스 타입으로 직접 참조
 * - 프로그램 실행시 가장 먼저 메모리에 로드
 * 
 * 싱글톤 객체(Singleton)
 * - 싱글톤 패턴이 적용된 객체는 하나의 인스턴스로 존재하는 객체
 * - 싱글톤 객체를 사용해서 메모리 절약과 성능 향상
 */

public class StaticTest {

	public static void main(String[] args) {
		
		Car car1 = new Car("소나타", "흰색", 0);
		car1.show();
		
		Car car2 = new Car("쏘렌토", "남색", 0);
		car2.show();
		
		Car car3 = new Car("아반떼", "은색", 0);
		car3.show();
		
			//car1.show(); Car car3 밑에 쓰면 3이라는 값을 출력 <- 인스턴스가 세 번 만들어지면서 클래스 메모리의 count 세 번 참조되었기 때문
		
		
		System.out.println("현재 전체 차량 수 : " + Car.count);
		
		
		//singleton 실습
		Calc cal = Calc.getInstance();
		
		int r1 = cal.plus(1, 2);
		int r2 = cal.minus(2, 3);
		
		System.out.println("r1 : " +r1);
		System.out.println("r2 : " +r2);
		
	}
}
