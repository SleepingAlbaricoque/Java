package part1;

import java.util.Scanner;

public class Reading_Input {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Write a message : ");
		
		String input = sc.nextLine(); //next()로 하면 첫 번째 단어만 출력됨
		
		System.out.println(input);
	}
	
	}

