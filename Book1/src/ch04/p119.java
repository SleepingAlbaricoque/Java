package ch04;

/* 
 * 날짜 : 2022.08.20
 * 이름 : 조수빈
 * 내용 : for문 내 continue 사용
 * 
 */
public class p119 {

	public static void main(String[] args) {
		
		int total = 0;
		int total2 = 0;
		int num, num2;
		
		//continue 미사용
		for(num =1; num <= 100; num++) {
			
			if (num % 2 == 0) 
			total += num;
		}
		
		System.out.println("1부터 10까지 짝수합은 " + total + "입니다.");
		
		//continue 사용
		for(num2 =1; num2 <= 100; num2++) {
					
			if (num2 % 2 == 0)
				continue;
			total2 += num2;
				}
				
				System.out.println("1부터 10까지 홀수합은 " + total2 + "입니다.");
	}
}
