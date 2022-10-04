package part6.averages;

import java.util.ArrayList;

/* 날짜 : 2022.10.04
 * 이름 : 조수빈
 * 내용 : User Interface와 Program logic 분리하기
 */
public class GradeRegister {
	 private ArrayList<Integer> grades;
	 private ArrayList<Integer> points;

	    public GradeRegister() {
	        this.grades = new ArrayList<>();
	        this.points = new ArrayList<>();
	    }

	    public void addGradeBasedOnPoints(int points) {
	        this.grades.add(pointsToGrades(points));
	        this.points.add(points);
	    }

	    public int numberOfGrades(int grade) {
	        int count = 0;
	        for (int received: this.grades) {
	            if (received == grade) {
	                count++;
	            }
	        }

	        return count;
	    }
	    
	    public ArrayList<Integer> getGrades() {
			return grades;
		}
	    
	    public ArrayList<Integer> getPoints() {
			return points;
		}
	    
	    public static int pointsToGrades(int points) {

	        int grade = 0;
	        if (points < 50) {
	            grade = 0;
	        } else if (points < 60) {
	            grade = 1;
	        } else if (points < 70) {
	            grade = 2;
	        } else if (points < 80) {
	            grade = 3;
	        } else if (points < 90) {
	            grade = 4;
	        } else {
	            grade = 5;
	        }

	        return grade;
	    }
	   
}
