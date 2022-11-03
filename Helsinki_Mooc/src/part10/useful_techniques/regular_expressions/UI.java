package part10.useful_techniques.regular_expressions;

import java.util.Scanner;

public class UI {
	private Scanner sc;
	private Checker ch;
	
	public UI() {
		sc = new Scanner(System.in);
		ch = Checker.getInstance();
	}
	
	public void start() {	
		checker: while(true) {
			System.out.println("Choose the function: ");
			System.out.println("1: Day of Week");
			System.out.println("2: Vowel Check");
			System.out.println("3: Time of Day");
			System.out.println("4: exit");
			int opt = Integer.valueOf(sc.nextLine());
			
			switch(opt) {
				case 1:
					while(true) {
						System.out.print("Enter a string: ");
						String answer = sc.nextLine();
						if(answer.equals(""))
							break;
						if(ch.isDayofWeek(answer))
							System.out.println("The form is correct.");
						else
							System.out.println("The form is incorrect.");
					}
					break;
				case 2:
					while(true) {
						System.out.print("Enter a string: ");
						String answer = sc.nextLine();
						if(ch.allVowels(answer))
							System.out.println("The form is correct.");
						else
							System.out.println("The form is incorrect.");
						
						if(answer.equals(""))
							break;	
					}
					break;
				case 3:
					while(true) {
						System.out.print("Enter a string: ");
						String answer = sc.nextLine();
						if(ch.timeOfDay(answer))
							System.out.println("The form is correct.");
						else
							System.out.println("The form is incorrect.");
						
						if(answer.equals(""))
							break;
					}
					break;
				case 4: 
					System.out.println("Powering off...");
					break checker;
				default:
					System.out.println("Invalid Command");
			}
		}	
	}
}
