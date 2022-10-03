package part6.simple_dictionary;

import java.util.Scanner;

public class TextUI {
	private Scanner sc;
	private SimpleDictionary dictionary;
	
	public TextUI(Scanner sc, SimpleDictionary dictionary) {
		this.sc = sc;
		this.dictionary = dictionary;
	}
	
	public void start() {
		boolean loop = true;
		while(loop) {
			System.out.print("Command: ");
			String command = sc.nextLine();
		
			switch (command) {
				case "end":
					System.out.println("Bye bye!");
					loop = false;
					break;
				case "add":
					System.out.print("Word: ");
					String word = sc.nextLine();
					System.out.print("Translation: ");
					String translation = sc.nextLine();
					dictionary.add(word, translation);
					break;
				case "search":
					System.out.print("To be translated: ");
					String translated = sc.nextLine();
					if(dictionary.translate(translated) == null) {
						System.out.println("Word(" + translated + ") was not found");
					}else
						System.out.println("Translation: " + dictionary.translate(translated));
					break;
				default: System.out.println("Unknown command");
			}
		
		}
	}
}
