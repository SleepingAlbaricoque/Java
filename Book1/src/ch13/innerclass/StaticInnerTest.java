package ch13.innerclass;

/* 날짜 : 2022.09.21
 * 이름 : 조수빈
 * 내용 : 정적 내부 클래스 예제
 */
class OutClassTwo {
	private int num = 10;
	private static int sNum = 20;
	
	static class InStaticClass {
		int inNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			// num += 10; num은 외부 클래스의 인스턴스 변수라 참조 불가
			System.out.println("InStaticClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수 사용)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 정적 변수 사용)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수 사용)");
		}
		
		static void sTest() {
			// num += 10; 외부 클래스의 인스턴스 변수 참조 불가
			// inNum += 10; 내부 클래스의 인스턴스 변수 참조 불가
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수 사용)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 정적 변수 사용)");
		}
	}
}

public class StaticInnerTest {
	public static void main(String[] args) {
		
		OutClassTwo.InStaticClass sInClass = new OutClassTwo.InStaticClass(); // 외부 클래스 생성 없이 정적 내부 클래스 생성
		System.out.println("정적 내부 클래스 일반 메서드 호출");
		sInClass.inTest();
		System.out.println();
		System.out.println("정적 내부 클래스의 정적 메서드 호출");
		OutClassTwo.InStaticClass.sTest();
	}
}
