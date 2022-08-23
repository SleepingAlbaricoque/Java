package ch05;

import java.util.Scanner;

/*
 * 날짜 : 2022.08.23
 * 이름 : 조수빈
 * 내용 : 사칙 연산 함수 만들기
 */

public class p138 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 정수를 입력하세요 : ");
		int [] intergers = new int[2];  //https://stackoverflow.com/questions/23506429/how-to-read-multiple-integer-values-from-a-single-line-of-input-in-java
		
		for(int t = 0; t < intergers.length; t++ ) {
			
			intergers[t] = sc.nextInt();
		}
		
		int a = intergers[0];
		int b = intergers[1];
		
		add(a,b);
		subtract(a,b);
		multiply(a,b);
		divide(a,b);
		
		
		
	}
	
	
	public static void add(int i, int j) {
		
		int k = i + j;
		System.out.println("+i+와 +j+의 합 : " + k);
	}
	
	public static void subtract(int i, int j) {
		
		int k = i - j;
		System.out.println("+i+와 +j+의 차 : " + k);
	}
	
	
	public static void multiply(int i, int j) {
	
		int k = i * j;
		System.out.println("+i+와 +j+의 곱 : " + k);
}
	
	public static void divide(double i, double j) {
	
		double k = i / j;
	
		if (j == 0) {
		System.out.println("0으로 나눌 수 없습니다");
		
		}else {
		System.out.println("+i+와 +j+의 나눗셈 : " + k);}
}



	
}
