package ch13.innerclass;

/* 날짜 : 2022.09.21
 * 이름 : 조수빈
 * 내용 : 인스턴스 내부 클래스 예제
 */
class OutClass {
	private int num = 10;
	private static int sNum = 20;
	
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass(); // 외부 클래스 생성 후 인스턴스 내부 클래스 생성 가능
	}
	
	class InClass {
		int inNum = 100;
		// static int sInNum = 200; 인스턴스 내부 클래스는 외부 클래스 생성 이후 생성되므로 정적 변수, 메서드 선언 불가
		
		void inTest() {
			System.out.println("OutClass num = " +num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수)");
		}
		
		 //static void sTest() {}
	}	
	
	public void usingClass() {
			inClass.inTest();
	}
	
}

public class InnerTest {
	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
		outClass.usingClass();
		System.out.println();
		
		OutClass.InClass innerClass = outClass.new InClass(); // 외부 클래스가 아닌 클래스에서 내부 클래스 생성하는 방법; 외부 클래스 생성이 선행되어야 함
		innerClass.inTest();
	}
}
