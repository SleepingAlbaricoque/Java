package sub2;

/* 날짜 : 2022.09.01
 * 이름 : 조수빈
 * 내용 : 인터페이스 실습하기
 * 
 * 인터페이스
 * - 멤버 변수를 갖지 못하고 오직 추상 메서드만 가질 수 있음
 * - 완성된 일반 메서드를 갖지 못하고, 추상 메서드 선언만 가능
 */
public class InterfaceTest {
	public static void main(String[] args) {
		
		// 인터페이스로 공통 클래스 구조 설계
		Car sonata = new Sedan("소나타", "흰색", 0);
		sonata.speedUp(100);
		sonata.speedDown(40);
		sonata.show();
		
		Car bongo = new Truck("봉고", "파란색", 0);
		bongo.speedUp(80);
		bongo.speedDown(20);
		bongo.show();
		
	}
}
