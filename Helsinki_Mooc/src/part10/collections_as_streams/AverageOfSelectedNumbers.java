package part10.collections_as_streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> inputs = new ArrayList<>();
		
		System.out.println("Input numbers, type 'end' to stop");
		while(true) {
			String row = sc.nextLine();
			if(row.equals("end"))
				break;
			
			inputs.add(row);
		}
		
		System.out.println("Print the average of the negative numbers or the positive numbers?");
		System.out.println("(n/p)");
		
		String result = sc.nextLine();

		if(result.equals("n")) {
			double average = inputs.stream()
							.mapToInt(s -> Integer.valueOf(s))
							.filter(number -> number <0)
							.average()
							.getAsDouble();
			
			System.out.println("Average of the negative numbers: " + average);
		}else if(result.equals("p")) {
			double average = inputs.stream()
							.mapToInt(s -> Integer.valueOf(s))
							.filter(number -> number >0)
							.average()
							.getAsDouble();
			
			System.out.println("Average of the positive numbers: " + average);
		}else {
			System.out.println("Invalid Command");
		}
	}
}
