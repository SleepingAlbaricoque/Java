package step02;

import java.util.Scanner;

/* 날짜 : 2022.08.26
 * 이름 : 조수빈
 * 내용 : 첫째 줄에 다음 세 가지 중 하나를 출력한다.
 *	
 *	- A가 B보다 큰 경우에는 '>'를 출력한다.
 *	- A가 B보다 작은 경우에는 '<'를 출력한다.
 *	- A와 B가 같은 경우에는 '=='를 출력한다.
 */
public class _01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 A와 B를 'A,B' 형식으로 입력하세요: ");
		String details = sc.nextLine();
		
		String[] integers = details.split(",");
		int A = Integer.valueOf(integers[0]);
		int B = Integer.valueOf(integers[1]);
		
		System.out.println(A + " " + B);
		
		if(A > B) {
			System.out.println(">");
			
		}else if (A < B) {
			System.out.println("<");
			
		}else {
			System.out.println("==");
		}
	}
}
