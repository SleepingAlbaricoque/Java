package ch04;

/* 날짜 : 2022.08.20
 * 내용 : for문을 사용하여 1부터 10까지 합 구하기
 */
public class p114 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i = 1; i<=10; i++) {
			
			sum += i;
		}
		
		System.out.println("1부터 10까지 숫자의 합은 " + sum + "입니다");
		
	}
}
