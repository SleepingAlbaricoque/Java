package sub1;

/*
 * 날짜 : 2022.08.24
 * 이름 : 조수빈
 * 내용 : Java 클래스 객체 실습하기
 */
public class ClassTest {

	public static void main(String[] args) {
		
		// 객체 생성
		 Car sonata = new Car(); // 좌변의 sonata는 참조 변수 = 객체; <heap에 저장된 클래스>의 주소가 stack에 저장되어 주소를 참조 => 참조 변수
		 						 // stack, heap 메모리; heap = 객체가 생성되는 공간
		 						 // main 메서드 끝나면 스택의 변수들도 pop되고, 힙의 객체들도 garbage collector가 pop시킴
		 
		// 객체 속성 초기화 
		 sonata.name = "소나타";
		 sonata.color = "흰색";
		 sonata.speed = 0;
		
		// 객체 기능 실행
		 sonata.speedUp(100);
		 sonata.speedDown(40);
		 sonata.show();
		 
		 
		// 객체 생성
		 Car bmw = new Car();
		 bmw.name = "bmw 520";
		 bmw.color = "남색";
		 bmw.speed = 0;
		 
		 bmw.speedUp(80);
		 bmw.speedDown(40);
		 bmw.show();
	}
}
