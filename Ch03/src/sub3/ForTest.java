package sub3;

/*
 * 날짜 : 2022.08.17
 * 이름 : 조수빈
 * 내용 : Java 반복문 For 실습하기
 * 
 */

public class ForTest {

	public static void main(String[] args) {
		
		//for
		//for(초기식; 조건식; 증가식) {}
		//초기식에서 반복변수 선언
		
		for(int i=1; i<=5; i++) {
	
		
			System.out.println("i :" +i);
	}
		
		// 1부터 10까지 합
		int sum = 0;
		
		for(int k=1; k<=10; k++) {
			
			sum += k;
		}
		System.out.println("1부터 10까지의 합 : "+sum);
		
		// 1부터 10까지 짝수합
		int tot = 0;
		
		for(int k=1; k<=10; k++) {
		
			if(k % 2 == 0) {
				tot += k;
			
			}	
		}
		// 중첩 for
		
		for(int a=1; a<=3; a++) {
			
			System.out.println("a : " +a);
			
			for(int b=1; b<=5; b++) {
				//a가 1일 때 b가 1에서 5까지 => 총 3*5 = 15번 루프		
				
				System.out.println("b : " +b);
			}
		
		}
		
		// 구구단
		
		for (int x=2; x<=9; x++) {
			
			System.out.println(x + "단");
			for(int y=1; y<=9; y++) {
				
				
				int z = x * y;
						
				System.out.println(x + " x " + y + " = " + z);
			}
		}
		// 별삼각형
		
		for(int start=1; start<=10; start++) {
			
			for(int end = 10; end >= start; end--) {
				
				//반대로 처음 for문을 for(int start = 10; start>=1; start--) {}도 가능
				System.out.print("☆");
				
			}
			
			System.out.print("\n"); //개행(줄바꿈)
		}
}
}
