package Step01;

import java.util.Scanner;

/*
 * 날짜 : 2022.08.19
 * 이름 : 조수빈
 * 문제 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오
 * 
 */

public class _03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println(num1 + num2);
	}
}

//run하면 콘솔에 커서 깜빡거리는데 그냥 키보드로 입력하면 됨(sc.nextInt();)