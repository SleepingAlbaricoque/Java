package part4.files_and_reading_data;

import java.util.Scanner;

/*
 * 날짜 : 2022.08.30
 * 이름 : 조수빈
 * 내용 : 입력된 String 개수 출력하기 
 */
public class Cubes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String line = sc.nextLine();
			
			if(line.equals("end")) {
				break;
			}
			
			int x = Integer.valueOf(line);
			System.out.println(x * x * x);
		}
	}
}
