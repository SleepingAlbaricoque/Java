package sub7;

/* 날짜 : 2022.08.31
 * 이름 : 조수빈
 * 내용 : 다형성 실습하기
 * 
 * 다형성(Polymorphism)
 * - 상속 관계에서 부모 클래스의 기능이 자식 클래스에서 여러 기능으로 변하는 특성
 * - 객체의 타입 선언을 부모 클래스 타입으로 선언하는 것
 * - 다형성을 이용해서 프로그래밍의 중복을 줄이고 유연성을 높인다
 */
public class PolymorphismTest {

	public static void main(String[] args) {
		
		// 다형성을 적용한 객체 생성(Upcasting)
		Animal a1 = new Tiger(); // 참조 타입을 부모 타입으로 선언
		Animal a2 = new Eagle();
		Animal a3 = new Shark();
		
		a1.move();
		a2.move();
		a3.move();
		
		a1.hunt();
		a2.hunt();
		a3.hunt();
		
		// 객체 타입 다운캐스팅
		Tiger tiger = (Tiger) a1;
		Eagle eagle = (Eagle) a2;
		Shark shark = (Shark) a3;
		
		tiger.move();
		eagle.move();
		shark.move();
		
		// 객체 타입 연산
		if(a1 instanceof Tiger) { // a1이 Tiger의 인스턴스인지 확인
			System.out.println("a1은 Tiger입니다");
		}
		
		if(a2 instanceof Eagle) {
			System.out.println("a2는 Eagle입니다");
		}
		
		if(a3 instanceof Shark) {
			System.out.println("a3은 Shark입니다");
		}
	}
}
