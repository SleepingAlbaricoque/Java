package part10.useful_techniques.enum_and_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
	private List<Person> persons;
	
	public Employees() {
		persons = new ArrayList<>();
	}
	
	public void add(Person personToAdd) {
		persons.add(personToAdd);
	}
	
	public void add(List<Person> peopleToAdd) {
		peopleToAdd.stream().forEach(person -> persons.add(person));
	}
	
	public void print() {
		Iterator<Person> iterator = persons.iterator();
		
		while(iterator.hasNext())
			System.out.println(iterator.next());
	}
	
	public void print(Education education) {
		Iterator<Person> iterator = persons.iterator();
		
		while(iterator.hasNext()) {
			if(iterator.next().getEducation() == education)
				System.out.println(iterator.next());
		}
	}
	
	public void fire(Education education) {
		Iterator<Person> iterator = persons.iterator();
		
		while(iterator.hasNext()) {
			if(iterator.next().getEducation() == education)
				iterator.remove();
		}
	}
	
	public static void main(String[] args) {
		Employees university = new Employees();
		university.add(new Person("Petrus", Education.PHD));
		university.add(new Person("Arto", Education.HS));
		university.add(new Person("Elina", Education.PHD));

		university.print();

		university.fire(Education.HS);

		System.out.println("==");

		university.print();
	}
}
