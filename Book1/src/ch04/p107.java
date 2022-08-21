package ch04;

/* 
 * 날짜 : 2022.08.20
 * 내용 : 1부터 10까지 합
 * 
 */
public class p107 {

	
	public static void main(String[] args) {
		
		int k = 0;
		
		for(int i=0; i<10; i++) {
			
			k += i + 1;
			
		}
		
		System.out.println("1부터 10까지 숫자의 합은 " + k + "입니다");
	}
}
