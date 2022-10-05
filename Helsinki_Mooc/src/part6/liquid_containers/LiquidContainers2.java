package part6.liquid_containers;

import java.util.Scanner;

public class LiquidContainers2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Container first = new Container();
		Container second = new Container();
		
		boolean shouldLoop = true;
		while(shouldLoop) {
			System.out.println("First: " + first + "\n"
							+"Second: " + second);
			
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
					first.add(amount);
					break;
				case "move":
					first.remove(amount);
					second.add(amount);
					break;
				case "remove":
					second.remove(amount);
					break;
				default: System.out.println("Unknown command");
			}
		}	
	}
}
