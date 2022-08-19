package sub01;

import java.util.Scanner;

/*
 * 날짜 : 2022.08.19
 * 이름 : 조수빈
 * 내용: 자바 기본 입출력 연습문제
 * 
 */
public class Test02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int year;
		int birth;
		String name;
		
		System.out.print("올해 년도 입력 : ");
		year = sc.nextInt();
				
		System.out.print("태어난 년도 입력 : ");
		birth = sc.nextInt();
		
		System.out.print("이름 입력 : ");
		name = sc.next();
		
		int age = year - birth;
		
		
		System.out.printf("%s님 안녕하세요. \n당신은 올해 만 %d세 입니다.", name, age);
		// 포맷 문자가 포함된 내용 프린트하려면 printf 사용
		
		sc.close();
		
	}

}
