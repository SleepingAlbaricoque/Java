package follow_up_practice;

import java.util.Scanner;

/*
 * 날짜 : 2022.08.23
 * 이름 : 조수빈
 * 내용 : Write a Java method to display the middle character of a string
 *		a) If the length of the string is odd there will be two middle characters
 *		b) If the length of the string is even there will be one middle character
 */
public class MethodPractice1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a string: ");
		String str = sc.nextLine();
		System.out.println("The middle character in the string is " + strMiddleCharacter(str));
		
	}
	
	public static String strMiddleCharacter (String str) {
		
		int position;
		int length;
		
		if (str.length() % 2 == 0 ) {
			
			position = str.length() / 2 -1;
			length = 2;
			
		}else {
			
			position = str.length() / 2;
			length = 1;
		}
		
		return str.substring(position, position + length);
		
	}
}
