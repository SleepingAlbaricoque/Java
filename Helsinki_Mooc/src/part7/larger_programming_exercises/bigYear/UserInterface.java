package part7.larger_programming_exercises.bigYear;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
	private Scanner sc;
	private ArrayList<Bird> birdList;
	
	public UserInterface() {
		this.sc = new Scanner(System.in);
		this.birdList = new ArrayList<>();
	}
	
	public void start() {
		while(true) {
			System.out.print("? ");
			String command = sc.nextLine();
			switch(command) {
				case "Add":
					System.out.print("Name: ");
					String name = sc.nextLine();
					
					System.out.print("Name in Latin: ");
					String latin = sc.nextLine();
					
					birdList.add(new Bird(name, latin));
					break;
					
				case "Observation":
					System.out.print("Bird? ");
					String species = sc.nextLine();
					for(Bird element : birdList) {
						if(element.getName().equals(species))
							element.plusCount();
						else
							System.out.println("Not a bird!");
					}
					break;
		
				case "All":
					for(Bird element : birdList) {
						System.out.println(element);
					}
					break;
					
				case "One":
					System.out.println("Bird? ");
					String kind = sc.nextLine();
					for(Bird element : birdList) {
						if(element.getName().equals(kind))
							System.out.println(element);
					}
					break;
					
				case "Quit":
					return;
					
				default:
					System.out.println("Invalid command");
			}
		}
	}
}
