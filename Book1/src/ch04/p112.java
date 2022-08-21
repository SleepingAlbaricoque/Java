package ch04;

/*
 * 날짜 : 2022.08.20
 * 내용 : do-while문 사용해 1에서 10까지 합 구하기
 */
public class p112 {

	public static void main(String[] args) {
		
		int num = 1;
		int sum = 0;
		
		do {
			
			sum += num;
			num++;
			
		}while (num<=10);
		
			System.out.println("1에서 10까지의 합은 " + sum + "입니다");
	}
}
