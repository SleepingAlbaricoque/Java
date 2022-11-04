package part11.packages.first_packages;

import part11.packages.first_packages.logic.ApplicationLogic;
import part11.packages.first_packages.ui.TextInterface;
import part11.packages.first_packages.ui.UserInterface;

public class MainProgram {
	public static void main(String[] args) {
        UserInterface ui = new TextInterface();
        new ApplicationLogic(ui).execute(3);
	}
}
