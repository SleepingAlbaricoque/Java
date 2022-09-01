package ch09.abstractex;

public class ComputerTest {
	public static void main(String[] args) {
		// Computer c1 = new Computer(); an abstract class that cannot be instantiated
		Computer c2 = new DeskTop();
		// Computer c3 = new NoteBook(); an abstract class that cannot be instantiated
		Computer c4 = new MyNoteBook();
	}
}
