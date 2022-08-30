package one;

import java.util.Scanner;

/* 날짜 : 2022.08.30
 * 이름 : 조수빈
 * 내용 : 별 출력
 */
public class QuestionThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 N을 입력하세요 : ");
		int n = sc.nextInt();
		
		for(int i =1; i<=n; i++) {
			
			for(int j=0; j<n-i; j++) {
				System.out.print(" ");
			}	
				
			for(int k =0; k<i; k++) {
					System.out.print("★");	
			}
			
			System.out.println("");
		}
		
		System.out.println("");
		
		
		for(int i = 0; i<n ; i++) {
			
			for(int j=n-1; j>i  ; j--) {
				System.out.print("☆");
			}
			
			for(int j=0; j<2*i + 1 ; j++) {
				System.out.print("★");
			}
			
			for(int j=n-1; j>i  ; j--) {
				System.out.print("☆");
			}
			
			System.out.print("\n");
		}

		/* 
		 * int a = n/2;
		 * 
		 * if(n % 2 == 0) {
		for(int l = 1; l<=a+1; l++) {
			
			for(int m = 0; m<= a-l; m++) {
				System.out.print("☆");
			}
			
			for(int o = 1; o<n -2*a + 2*l; o++) {
				System.out.print("★");
			}
			
			for(int m = 0; m<= a-l; m++) {
				System.out.print("☆");
			}
			
			System.out.println("");
		}
		
	}else {
		
	for(int l = 1; l<=a+1; l++) {
			
			for(int m = 0; m<= a-l; m++) {
				System.out.print("☆");
			}
			
			for(int o = 1; o<n -2*a + 2*l-1; o++) {
				System.out.print("★");
			}
			
			for(int m = 0; m<= a-l; m++) {
				System.out.print("☆");
			}
			
			System.out.println("");
		*/
		
	}
	}


