package part7.larger_programming_exercises.grade_statistics;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		GradeBook gb = new GradeBook();
		UserInterface ui = new UserInterface(gb);
		ui.start();
	}
}

