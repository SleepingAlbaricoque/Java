package part12.randomness;

import java.util.Random;
import java.util.Scanner;

public class Numbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many random numbers should be printed? ");
		int answer = Integer.valueOf(sc.nextLine());
		
		Random random = new Random();
		for(int i =0; i <answer; i++) {
			int randomNum = random.nextInt(10);
			System.out.println(randomNum);
		}	
	}
}
