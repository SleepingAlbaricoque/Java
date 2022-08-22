package follow_up_practice;

/*
 * 날짜 : 2022.08.19
 * 이름 : 조수빈
 * 내용 : 1. scanner 함수 연습
 * 		 2. 스트링 변수에서 charAt() 사용해 특정 문자 추출 후 숫자로 변환
 */

import java.util.Scanner;

public class CharAt_Practice {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("코드를 입력하세요: ");
			//id는 알파벳 대문자 한 글자 + 여섯 자리 숫자
		String id = sc.nextLine();
		
		int complement = id.charAt(1) -'0';
		
		System.out.println("코드의 첫 번째 숫자의 10의 보수는 " + (10 - complement) +"입니다.");
		
		
	}
}
