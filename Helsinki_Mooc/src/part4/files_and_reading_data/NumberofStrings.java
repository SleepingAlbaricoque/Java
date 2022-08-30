package part4.files_and_reading_data;

/*
 * 날짜 : 2022.08.30
 * 이름 : 조수빈
 * 내용 : 입력된 String 개수 출력하기 
 */
import java.util.Scanner;

import javax.sound.sampled.Line;

public class NumberofStrings {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	int ct = 0;
	
	System.out.println("Enter a string : ");
	
	while(true) {
		String line = sc.nextLine();
		if(line.equals("end")) {
			break;
		}
		
		ct +=1;
	}
	
	System.out.println(ct);
	
	}
}
