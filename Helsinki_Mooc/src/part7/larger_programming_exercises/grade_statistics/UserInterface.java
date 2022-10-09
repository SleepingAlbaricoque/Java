package part7.larger_programming_exercises.grade_statistics;

import java.util.Scanner;

public class UserInterface {
	private Scanner sc;
	private GradeBook gb;
	
	public UserInterface(GradeBook gb) {
		this.sc = new Scanner(System.in);
		this.gb = gb;
	}
	
	public void start() {
		System.out.println("Enter point totals, -1 stops: ");
		while(true) {
			int point = Integer.valueOf(sc.nextLine());
			if(point != -1)
				gb.addToList(point);
			else
				break;
		}
		System.out.println("Point average(all): " + gb.listAvg());
		System.out.println("Point average(passing): " + gb.passingGradeAvg());
		System.out.println("Pass percentage: " + gb.passingPercentage());
		gb.gradeDistribution2();
	}
}
