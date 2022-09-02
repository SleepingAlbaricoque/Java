package test1;

import java.util.Scanner;

/*
 * 날짜 : 2022.08.19
 * 이름 : 조수빈
 * 내용 : 자바 삼항연산자 연습문제
 * 
 */
public class Test06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x값 입력 : ");
		int x = sc.nextInt();
		
		System.out.println("y값 입력 :");
		int y = sc.nextInt();
		
		
		if (x == y) {
			
			System.out.println("x와 y의 값은 동일합니다.");
			
		}else {String result = x > y ? "x가 더 큽니다." : "y가 더 큽니다.";
		
		System.out.println(result);
	}

}
}
