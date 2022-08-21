package ch04;

/*
 * 날짜 : 2022.08.21
 * 이름 : 조수빈
 * 내용 : for문 내 break문 사용
 * 
 */
public class p120 {

	public static void main(String[] args) {
		
		int sum =0;
		int i;
		
		for(i =1; ; i++) {
			
			sum += i;
			if (sum > 100)
				break;
		}
		
		System.out.println(i);
	}
}
