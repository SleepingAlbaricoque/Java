package part10.collections_as_streams.unique_last_names;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UniqueLastNames {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Person> inputs = new ArrayList<>();
		
		while(true) {
			System.out.println("Continue personal information input? \"quit\" ends: ");
			String answer = sc.nextLine();
			
			if(answer.equals("quit")) {
				System.out.println("Unique last names in alphabeteical order: ");
				inputs.stream()
					  .map(person -> person.getLastName())
					  .distinct()
					  .sorted()
					  .forEach(lastName -> System.out.println(lastName));
				break;
			}
			
			System.out.print("Input first name: ");
			String firstName = sc.nextLine();
			System.out.print("Input last name: ");
			String lastName = sc.nextLine();
			System.out.print("Input the year of birth: ");
			String birthYear = sc.nextLine();
			System.out.println("");
			
			Person person = new Person(firstName, lastName, Integer.valueOf(birthYear));
			inputs.add(person);
		}
	}
}
