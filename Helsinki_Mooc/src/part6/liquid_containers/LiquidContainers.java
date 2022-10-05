package part6.liquid_containers;

import java.util.Scanner;

/* 날짜 : 2022.10.05
 * 이름 : 조수빈
 * 내용: procedural programming 실습하기
 */
public class LiquidContainers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int first = 0;
		int second = 0;
		
		boolean shouldLoop = true;
		while(shouldLoop) {
			System.out.print("First: " + first + "/100\n"
							+"Second: " + second + "/100\n");
			
			String input = sc.nextLine();
			String[] parts = input.split(" ");
			
			if(input.equals("quit")) {
				shouldLoop = false;
				break;
			}
			
			String command = parts[0];
			int amount = Integer.valueOf(parts[1]);
			
			switch(command) {
				case "add":
					if(amount <=0)
						return;
					
					if(!(first + amount > 100))
						first += amount;
					else
						first =100;
					break;
				case "move":
					if(amount <0)
						return;
					
					if(amount < first) {
						if(amount + second > 100) {
							first -=amount;
							second = 100;
						}else {
							first -=amount;
							second += amount;
						}
					}else {
						if(first + second > 100) {
							first =0;
							second = 100;
						}else {
							first =0;
							second += first;
						}
					}
					break;
				case "remove":
					if(amount <0)
						return;
					
					if(amount > second)
						second =0;
					else
						second -= amount;
					break;
				default: System.out.println("Unknown command");
			}
		}
	}
}
