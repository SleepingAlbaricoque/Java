package part6.to_do_list;

import java.util.Scanner;

public class UserInterface {
	private TodoList list;
	private Scanner sc;
	
	public UserInterface(TodoList list, Scanner sc) {
		this.list = list;
		this.sc = sc;
	}
	
	public void start() {
		while(true) {
			System.out.print("Command: ");
			String command = sc.nextLine();
			
			switch(command) {
				case "stop":
					return;
				case "add":
					System.out.print("To add: ");
					String task = sc.nextLine();
					list.add(task);
					break;
				case "list":
					list.print();
					break;
				case "remove":
					System.out.println("Which one is removed?");
					int index = Integer.valueOf(sc.nextLine());
					list.remove(index);
					break;
			}
		}
	}
}	
	
