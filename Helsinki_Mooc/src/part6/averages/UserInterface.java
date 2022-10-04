package part6.averages;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
	private GradeRegister register;
    private Scanner scanner;

    public UserInterface(GradeRegister register, Scanner scanner) {
        this.register = register;
        this.scanner = scanner;
    }

    public void start() {
        readPoints();
        System.out.println("");
        printGradeDistribution();
        System.out.println("The average of points: " + averageOfPoints());
        System.out.println("The average of grades: " + averageOfGrades());
    }

    public void readPoints() {
        while (true) {
            System.out.print("Points: ");
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            int points = Integer.valueOf(input);

            if (points < 0 || points > 100) {
                System.out.println("Impossible number.");
                continue;
            }

            this.register.addGradeBasedOnPoints(points);
        }
    }

    public void printGradeDistribution() {
        int grade = 5;
        while (grade >= 0) {
            int stars = register.numberOfGrades(grade);
            System.out.print(grade + ": ");
            printStars(stars);
            System.out.println("");

            grade = grade - 1;
        }
    }

    public static void printStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }
    
    
    public double averageOfGrades() {
    	if(register.getGrades() == null)
    		return -1;
    	
    	double totalScore = 0.0;
    	for(Integer i : register.getGrades()) {
    		totalScore += i;
    	}
    	return totalScore / register.getGrades().size();
    }
    
    public double averageOfPoints() {
    	if(register.getPoints() == null)
    		return -1;
    	
    	double totalScore = 0.0;
    	for(Integer i : register.getPoints())
    		totalScore += i;
    	return totalScore / register.getPoints().size();
    }
}
