package sub6;

/* 날짜 : 2022.08.31
 * 이름 : 조수빈
 * 내용 : Override 실습하기
 * 
 * 오버라이드(Override)
 * - 부모클래스의 메서드를 자식클래스에 맞게 재정의 하는 행위
 * - 오버라이드를 통해 객체 지향 프로그래밍의 다형성 실현
 */

class AAA {
	public void method1() {
		System.out.println("AAA::method1...");
	}
	
	public void method2() {
		System.out.println("AAA::method2...");
	}
	
	public void method3() {
		System.out.println("AAA::method3...");
	}
}

class BBB extends AAA { // final 붙이면 BBB 클래스로부터 상속 불가; final class BBB
	
	@Override
	public void method2() { // final 붙이면 BBB의 자식 클래스에서는 method2에 대한 Override 불가; public final void method2()
		System.out.println("BBB::method2...");
	}
	
	//overloading
	public void method3(int a) {
		System.out.println("BBB::method3...");
	}
}

class CCC extends BBB {
	
	@Override
	public void method1() {
		System.out.println("CCC::method1...");
	}
	
	@Override //BBB의 method2 Override
	public void method2() {
		System.out.println("CCC::method2...");
	}
	
	//overloading
	public void method3(int a, int b) {
		System.out.println("CCC::method3...");
	}
}

public class OverrideTest {

	public static void main(String[] args) {
		
		CCC c = new CCC();
		
		c.method1();
		c.method2();
		c.method3();
		c.method3(1);
		c.method3(1, 2);
		
		BBB b = new BBB ();
		b.method2();
		
		Sedan sonata = new Sedan("소나타", "흰색", 0, 2000);
		Truck bongo = new Truck("봉고", "파란색", 0 ,0);
		
		sonata.speedUp(100);	
		sonata.speedTurbo();
		sonata.show();
				
		bongo.speedUp(100);
		bongo.show();
	}
}
