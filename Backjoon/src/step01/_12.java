package step01;

import java.util.Scanner;

/* 
 * 날짜 : 2022.08.19
 * 이름 : 조수빈
 * 문제 : 곱셈 과정 풀어서 써보기
 * 
 */
public class _12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		System.out.println(A*(B%10));
		System.out.println(A*((B/10)%10));
		System.out.println(A*(B/100));
		System.out.println(A*B);
		
	}
}
