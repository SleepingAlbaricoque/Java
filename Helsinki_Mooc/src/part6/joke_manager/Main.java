package part6.joke_manager;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		JokeManager manager = new JokeManager();
		Scanner sc = new Scanner(System.in);
		
		UserInterface ui = new UserInterface(manager, sc);
		ui.start();
	}
}
