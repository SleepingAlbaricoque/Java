package step02;

import java.util.Scanner;

/* 날짜 : 2022.08.26
 * 이름 : 조수빈
 * 내용 : 입력 시각에서 45분 앞으로 돌린 값을 출력하기
 * 		 첫째 줄에 두 정수 H와 M이 주어진다. (0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 그리고 이것은 현재 상근이가 설정한 놓은 알람 시간 H시 M분을 의미한다.
 * 		 입력 시간은 24시간 표현을 사용한다. 24시간 표현에서 하루의 시작은 0:0(자정)이고, 끝은 23:59(다음날 자정 1분 전)이다. 시간을 나타낼 때, 불필요한 0은 사용하지 않는다.
 */
public class _05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		if (M >= 45) {
				System.out.println(H + " " + (M-45));
			
			
		}else {
			M = M + 60 -45;
			
			if (H ==0) {
				H = 23; 
				
			}else {
				H--;
			}
				System.out.println(H + " " + M);
			
		}
	}
}
