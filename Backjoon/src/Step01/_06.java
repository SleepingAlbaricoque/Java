package Step01;

import java.util.Scanner;

/*
 * 날짜 : 2022.08.19
 * 이름 : 조수빈
 * 문제 : 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오
 */
public class _06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		
		System.out.println(A/B);
		
	}
}
