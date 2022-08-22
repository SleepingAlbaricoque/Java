package follow_up_practice;

/* 날짜 : 2022.08.20
 * 이름 : 조수빈
 * 내용 : do-while문 활용하여 올바르게 입력할 때까지 경고창 띄우기
 */

import java.util.Scanner;

public class Do_While {

public static void main(String[] args) {
		
		char opt; //예제에서는 char opt = '\0';로 초기화
		
		Scanner sc = new Scanner(System.in);
		
		
		do {

			System.out.print("Do you agree? : ");
			opt = sc.next().charAt(0);
			
			switch (opt) {
			
				case 'y':
				System.out.println("You chose 'yes'.");
				break;
				
				default: 
				System.out.println("Invalid option");
			}
			
		} while (opt != 'y');
		
		System.out.println("Thank you for your cooperation.");
}
}
