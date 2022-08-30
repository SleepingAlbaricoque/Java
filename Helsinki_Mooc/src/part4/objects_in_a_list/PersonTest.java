package part4.objects_in_a_list;

/*
 * 날짜 : 2022.08.28
 * 이름 : 조수빈
 * 내용 : ArrayList 입출력 연습
 */
import java.util.ArrayList;
import java.util.Scanner;

public class PersonTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Person> persons = new ArrayList<>();
		
		System.out.println("Enter the person details separated by a comma, e.g.: Randall,2");
		while(true) {
			System.out.println("Enter the details, empty will stop: ");
			String details = sc.nextLine();
			if (details.isEmpty()) {
				break;
		}
			
			String[] parts = details.split(",");
			String name = parts[0];
			int age = Integer.valueOf(parts[1]);
		
			persons.add(new Person(name, age));
		}
	
	System.out.println("What is the age limit? ");
	int ageLimit = sc.nextInt();
		
	for(Person person: persons) {
		if(person.getAge() >= ageLimit) {
		System.out.println(person);
		}
	}
	}
}

