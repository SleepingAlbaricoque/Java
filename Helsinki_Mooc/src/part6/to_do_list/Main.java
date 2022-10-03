package part6.to_do_list;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		TodoList list = new TodoList();
		Scanner scanner = new Scanner(System.in);

		UserInterface ui = new UserInterface(list, scanner);
		ui.start();
	}
}
