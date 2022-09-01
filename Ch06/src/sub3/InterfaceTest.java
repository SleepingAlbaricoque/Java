package sub3;

/* 날짜 : 2022.09.01
 * 이름 : 조수빈
 * 내용 : 인터페이스 실습하기
 * 
 * 인터페이스(Interface)
 * - 클래스 간의 공통의 통일된 표준 규격을 통해 클래스 구조를 설계하는 문법
 * - 인터페이스를 활용해서 객체간 결합도를 완화하는 효과를 얻음(다형성)
 */
public class InterfaceTest {
	public static void main(String[] args) {
		
		// 인터페이스를 활용한 결합도 완화
		Bulb bulb = new Bulb();
		Socket socket = new Cable(bulb);
		
		socket.switchOn();
		socket.switchOff();
		
	}
}
