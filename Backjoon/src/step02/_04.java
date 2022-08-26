package step02;

import java.util.Scanner;

/* 날짜 : 2022.08.26
 * 이름 : 조수빈
 * 내용 : 점의 좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아내는 프로그램을 작성하시오. 단, x좌표와 y좌표는 모두 양수나 음수라고 가정한다
 */
public class _04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if (x >0) {
			int c = (y>0)? 1 : 4;
			System.out.println(c);
			
		}else {
			int d = (y>0)? 2 : 3;
			System.out.println(d);
		}
	}
}
