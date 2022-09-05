package sub1;

/* 날짜 : 2022.09.05
 * 이름 : 조수빈
 * 내용 : 예외처리 실습하기
 * 
 * 예외처리(Exception)
 * - 예외는 프로그램 실행 중에 발생하는 모든 오류(Error)
 * - 실행 중에 발생하는 오류를 대처하고 안정적인 프로그램 개발을 위해 예외처리 수행
 */
public class TryTest {
	public static void main(String[] args) {
		
		// 예외상황1 : 어떤 수를 0으로 나눌 때
		int num1 = 1;
		int num2 = 0;
		int r1 = 0, r2 =0, r3= 0, r4 =0;
		
		try {
			// 예외가 발생할 수 있는 코드로직
			r1 = num1 + num2;
			r2 = num1 - num2;
			r3 = num1 * num2;
			r4 = num1 / num2;
			
		}catch(ArithmeticException e) { //exception 종류 이렇게 구체적으로 명시할 수도 있지만 보통은 그냥 exception으로 기재
			// 예외가 발생했을 때 처리할 코드로직
			e.printStackTrace();
		}
		
		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);
		System.out.println("r3 : " + r3);
		System.out.println("r4 : " + r4);
		
		// 예외상황2 : 배열의 인덱스 범위를 벗어났을 때
		int[] arr = {1, 2, 3, 4, 5};
		
		try {
			for(int i =0; i <= 5; i++) {
				System.out.println("arr[i] : " + arr[i]);
				
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		// 예외상황3 : NULL 포인트 참조
		Animal animal = null; //객체 선언만 한 상태라 아직 heap에 인스턴스 생성되지 않은 상태, stack에 null값으로 있음
		
		try {
			animal.move();
			animal.hunt();
			
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
		
		// 예외상황4 : Casting 에러
		Animal a1 = new Tiger(); // 둘 다 upcasting
		Animal a2 = new Eagle();
		
		try {
			Eagle eagle = (Eagle) a1; // downcasting
				
			eagle.move();
			eagle.hunt();
		}catch(ClassCastException e) {
			
			Tiger tiger = (Tiger) a1;
			
			tiger.move();
			tiger.hunt();
			
		}finally {
			// 정리 코드
			System.out.println("캐스팅 완료");
		}
	
		
		System.out.println("프로그램 종료");
	}

}
