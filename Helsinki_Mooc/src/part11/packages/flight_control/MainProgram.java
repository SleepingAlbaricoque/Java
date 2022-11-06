package part11.packages.flight_control;

import part11.packages.flight_control.logic.FlightControl;
import part11.packages.flight_control.ui.TextUI;

public class MainProgram {
	public static void main(String[] args) {
		FlightControl fc = new FlightControl();
		
		TextUI test = new TextUI(fc);
		test.start();
	}
}
