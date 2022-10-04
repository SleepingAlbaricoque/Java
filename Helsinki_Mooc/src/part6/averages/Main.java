package part6.averages;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GradeRegister register = new GradeRegister();
		
		UserInterface userInterface = new UserInterface(register, sc);
		userInterface.start();
	}
}
