package follow_up_practice;

import java.util.Scanner;

public class Method_Return {

	public static void main(String[] args) {
		
		divide(4,2);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		int i = sc.nextInt();
		
		f(i);
	}
	
	public static void divide(int n1, int n2) {
		
		if (n2 == 0)
		{
			System.out.println("0으로는 나눌 수 없습니다.");
			return; // 메소드를 강제 종료 시킴.
		}
		System.out.println("나눗셈 결과 : " + (n1 / n2));
	}
	
	public static void f(int x) {

		int y = 2 * x + 3;
		System.out.println(y);
	
	
	}// f end
	
}
