package step02;

import java.util.Scanner;

/* 날짜 : 2022.08.26
 * 이름 : 조수빈
 * 내용 : 1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다. 
 * 			1. 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다. 
 *			2. 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. 
 * 			3. 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.  
 * 		 3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.
 */
public class _07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int temp = a>b? a: b;
		int largest = c>temp? c: temp; // int max = Math.max(a, Math.max(b, c));
		
		int prize; 
		
		if(a==b && b==c) {
			prize = 10000 + a*1000;
			
		}else if (a==b || b==c || a==c) {
			if (a==b||a==c) {
				prize = 1000 + a*100;
			}else {
				prize = 1000 + b*100;
			}
					
		}else {
			prize = largest*100;
		}
		
		System.out.println(prize);
	}
}
