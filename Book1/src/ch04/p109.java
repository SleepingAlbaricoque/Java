package ch04;

/* 
 * 날짜 : 2022.08.20
 * 내용 : while문 활용해 1에서 10까지 합 구하기
 */
public class p109 {

	
	public static void main(String[] args) {
		
		int num = 1;
		int sum = 0;
		
		while(num <= 10 ) {
			
			sum += num;
			num++;
					
		}
		
		System.out.println("1에서 10까지의 합은 " + sum + "입니다");
	}
}
