package step02;

import java.util.Scanner;

/* 날짜 : 2022.08.26
 * 이름 : 조수빈
 * 내용 : 훈제오리구이를 시작하는 시각과 오븐구이를 하는 데 필요한 시간이 분단위로 주어졌을 때, 오븐구이가 끝나는 시각을 계산하는 프로그램을 작성하시오
 */
public class _06 {

	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	int A = sc.nextInt();
	int B = sc.nextInt();
	
	int C = sc.nextInt();
	
	int cQuotient = C / 60;
	int cRemainder = C % 60;
	
	A += cQuotient;
	B += cRemainder;
	

		if (B>=60) {
			A += 1;
			B -= 60;
			
			if (A>23) {
				A -= 24;
			}
		}else {
			if (A>23) {
				A -= 24;
			}
		}
		
		System.out.println(A + " " + B);
	
	}
}
