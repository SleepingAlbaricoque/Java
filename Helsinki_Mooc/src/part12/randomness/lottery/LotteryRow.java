package part12.randomness.lottery;

import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {
	private ArrayList<Integer> numbers;
	
	public LotteryRow() {
		this.randomizeNumbers();
	}
	
	public ArrayList<Integer> numbers(){
		return numbers;
	}
	
	public boolean containsNumber(int number) {
		if(numbers.contains(number)) {
			return true;
		}
		return false;
	}
	
	public void randomizeNumbers() {
		this.numbers = new ArrayList<>();
		
		Random random = new Random();
		
		while(numbers.size() <8) {
			int randomNo = random.nextInt(40);
			if(!containsNumber(randomNo)) {
				numbers.add(randomNo);
			}
		}
	}
	
	public boolean equals(Object other) {
		return false;
	}
	
	public static void main(String[] args) {
		 LotteryRow row = new LotteryRow();
	        ArrayList<Integer> lotteryNumbers = row.numbers();

	        System.out.println("Lottery numbers:");
	        for (int number: lotteryNumbers) {
	            System.out.print(number + " ");
	        }

	        System.out.println("");
	}
}
