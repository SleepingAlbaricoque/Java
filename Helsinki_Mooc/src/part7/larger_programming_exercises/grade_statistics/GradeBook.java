package part7.larger_programming_exercises.grade_statistics;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeBook {
	private ArrayList<Integer> scoreList;
	
	public GradeBook() {
		this.scoreList = new ArrayList<>();
	}
	
	public void addToList(int point) {
		if(point >=0 && point <=100)
			this.scoreList.add(point);
	}
	
	public int listAvg() {
		int total =0;
		for(Integer i : scoreList)
			total += i;
		return total / scoreList.size();
	}
	
	public String passingGradeAvg() {
		int total =0;
		int count =0;
		for(Integer i : this.scoreList) {
			if(i >= 50) {
				total += i;
				count++;
			}
		}
		if(total == 0)
			return "-";
		else {
			double result = 1.0 * total / count;
			return result + "";
		}
	}
	
	public double passingPercentage() {
		int count =0;
		for(Integer i : scoreList) {
			if(i >= 50)
				count++;
		}
		return 100 * count / scoreList.size();
	}
	
	public void gradeDistribution() {
		int[] distArr = new int[6];
		
		for(int i : this.scoreList) {
			if(i < 50)
				distArr[0]++;
			else if(i < 60)
				distArr[1]++;
			else if(i < 70)
				distArr[2]++;
			else if(i < 80)
				distArr[3]++;
			else if(i < 90)
				distArr[4]++;
			else
				distArr[5]++;
		}
		
		int index = 5;
		for(int i =5; i >=0; i--) {
			System.out.print(index + ": ");
			
			while(distArr[i] >0) {
				System.out.print("*");
				distArr[i]--;
			}
			System.out.println();
			index--;
		}
	}
	
	public void gradeDistribution2() { // my original answer
		int count0 =0, count1 =0, count2 =0, count3 = 0, count4 = 0, count5 =0; // any modification to these variables do NOT get updated in the array
		
		for(int i : this.scoreList) {
			if(i < 50)
				count0++;
			else if(i < 60)
				count1++;
			else if(i < 70)
				count2++;
			else if(i < 80)
				count3++;
			else if(i < 90)
				count4++;
			else
				count5++;
		}
		
		int[] array = {count0, count1, count2, count3, count4, count5}; // if this array is initialized before the for loop above, modifications to the variables do not get updated
		int index = 5;
		
		for(int i =5; i >=0; i--) {
			System.out.print(index + ": ");
			
			while(array[i] >0) {
				System.out.print("*");
				array[i]--;
			}
			System.out.println();
			index--;
		}
	}
}
