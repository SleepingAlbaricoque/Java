package one;

import java.util.Scanner;

/* 날짜 : 2022.08.30
 * 이름 : 조수빈
 * 내용 : 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
 */
public class QuestionOne {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.print("1 이상, 100 이하인 정수 N을 입력하세요 : ");
	int n = sc.nextInt();
	
	for(int i =1; i<=n; i++) {
		
		for(int j=0; j<i; j++) {
			
			System.out.print("*");
		}
		System.out.println("");
	}
	
	
	
	}
}
