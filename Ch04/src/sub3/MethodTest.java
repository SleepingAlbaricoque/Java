package sub3;

/* 날짜 : 2022.08.23
 * 이름 : 조수빈
 * 내용 : Java 메서드 실습하기
 * 
 * 메서드(Method)
 * - 자주 사용하는 코드로직을 모듈화한 구조체
 * - 메서드에 선언한 변수는 지역변수이고 해당 메서드가 끝나면 메모리에서 소멸 
 */
public class MethodTest { //클래스 블럭, 이름 무조건 대문자로 시작

	//전역변수 (<->지역변수)
	int num =1;
	
	public static void main(String[] args) { //메서드
		
		//f메서드 호출(실행)
		int r1 = f(1); //run하면 r1 선언(메모리 생성) -> f메서드 호출 -> r1에 대입
		int r2 = f(2); //디버그할 때 메서드로 진입하고 싶으면 RUN -> Step Into(F5)
		int r3 = f(3);
		
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
		
		//메서드 지역변수와 스택
		int t1 = sum(1, 10); //1, 10은 인자값(argument); 실행 시 start 변수는 1로, end 변수는 10으로 push, total 변수 선언 및 0으로 초기화, k에 start값 대입되는 식으로 메모리에 계속 stack됨; 지역변수는 블럭 실행이 끝나면 메모리에서 pop됨
		int t2 = sum(1, 100);
		
		System.out.println("t1 : " +t1);
		System.out.println("t2 : " +t2);
		
		
		
	}// main end; main이 종료되면 t1, t2 변수 pop됨
	
	//f메서드 정의
	public static int f(int x) {
	// public: 접근 권한, void: 반환 타입 = f()의 반환값은 없음(int면 반환 타입은 정수), f: 메서드의 이름; 무조건 소문자로 시작, (): 메서드의 매개변수 자리
	// main과 유형이 같아야 하므로 static도 일단 적어주기
		
		int y = 2 * x + 3;
	
		return y; //return 안적으면 어떻게 되는지?
	
	}// f end
	

	//메서드 정의
	public static int sum(int start, int end) { //start와 end는 매개변수(parameter)
		
		int total = 0;
		
		for(int k = start; k<=end; k++ ) { //지역변수: 메서드 내 선언된 변수 => 메서드에 종속; 여기서 지역변수는 start, end, total, k 총 4개
			total += k;	
		}//for문 끝나면 변수 k는 메모리에서 pop됨
		
		return total;
}

}