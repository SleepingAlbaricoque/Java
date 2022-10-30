package part10.collections_as_streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintingUserInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> inputs = new ArrayList<>();
		
		while(true) {
			String input = sc.nextLine();
			
			if(input.isEmpty()) {
				String result = inputs.stream()
								.reduce("", (prevString, word) -> prevString + word + "\n");
				System.out.println(result);
				break;
			}
			inputs.add(input);
		}
		
	}
}
