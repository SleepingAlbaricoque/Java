package part10.collections_as_streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LimitedNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> inputs = new ArrayList<>();
		
		while(true) {
			String input = sc.nextLine();
			
			if(Integer.valueOf(input) < 0) {
				inputs.stream().mapToInt(s -> Integer.valueOf(s)).filter(i -> 1 <= i && i <= 5).forEach(i -> System.out.println(i));
				break;
			}
			
			inputs.add(input);
		}
	}
}
