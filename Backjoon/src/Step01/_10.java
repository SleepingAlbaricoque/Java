package Step01;

import java.util.Scanner;

/*
 * 날짜 : 2022.08.19
 * 이름 : 조수빈
 * 문제 : 연산식 세워서 계산
 * 
 */
public class _10 {

	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	
	int comp[] = {1, 1, 2, 2, 2, 8};
	int input[] = new int[6];
	for (int i=0; i<input.length; i++) {
		input [i] = sc.nextInt();
		System.out.print(comp[i] - input[i] + " ");
	}
}
}

/*나의 처음 답안
 * 	Scanner sc = new Scanner(System.in);
		
		int King = sc.nextInt();
		int Queen = sc.nextInt();
		int Rook = sc.nextInt();
		int Bishop = sc.nextInt();
		int Knight = sc.nextInt();
		int Pawn = sc.nextInt();
		
		System.out.println(1-King, 1-Queen, 2-Rook, 2-Bishop, 2-Knight, 8-Pawn);
 * 
 */




