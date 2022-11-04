package part11.packages.first_packages.logic;

import part11.packages.first_packages.ui.UserInterface;

public class ApplicationLogic {
	private UserInterface ui;
	
	public ApplicationLogic(UserInterface ui) {
		this.ui = ui;
	}
	
	public void execute(int times) {
		for(int i=times; i >0; i--) {
			System.out.println("Application logic is working");
			ui.update();
		}
	}
}
