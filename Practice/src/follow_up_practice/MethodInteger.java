package follow_up_practice;

import java.util.Scanner;

/* 날짜 : 2022.08.23
 * 이름 : 조수빈
 * 내용 : Write a Java method to check whether every digit of a given integer is even. 
 * 		 Return true if every digit is even otherwise false
 */
public class MethodInteger {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Input an integer :");
		int integer = sc.nextInt();
		System.out.println(checkDigit(integer));
	}
	
	public static boolean checkDigit (int i) {
		
		final int f = 10;
		
		if (i ==0 ) {
			return false;
		}
		
		while (i !=0 ) {
			if ((i % f) % 2 != 0) {
				return false;
			}
			
			i /= 10;
		}
			return true;
		}
	}
