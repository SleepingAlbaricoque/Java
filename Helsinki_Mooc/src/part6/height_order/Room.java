package part6.height_order;

import java.util.ArrayList;

/* 날짜 : 2022.10.03
 * 이름 : 조수빈
 * 내용 : 멤버 변수 list 요소 중 가장 큰 값 리턴하기
 */
public class Room {
	private ArrayList<Person> persons;
	
	public Room() {
		this.persons = new ArrayList<>();
	}
	
	public void add(Person person) {
		this.persons.add(person);
	}
	
	public boolean isEmpty() {
		if(persons.isEmpty())
			return true;
		
		return false;
	}
	
	public ArrayList<Person> getPersons() {
		return persons;
	}
	
	public Person shortest() {
		if(persons.isEmpty())
			return null;
		
		Person returnPrs = persons.get(0);
		for(Person person : persons) {
			if(person.getHeight() < returnPrs.getHeight())
				returnPrs = person;
		}
		return returnPrs;
	}
	
	public Person take() {
		if(persons.isEmpty())
			return null;
		
		Person returnPrs = persons.get(0);
		for(Person person : persons) {
			if(person.getHeight() < returnPrs.getHeight())
				returnPrs = person;
		}
		return persons.remove(persons.indexOf(returnPrs));
	}
	
	public static void main(String[] args) {
		Room room = new Room();
		room.add(new Person("Lea", 183));
		room.add(new Person("Kenya", 182));
		room.add(new Person("Auli", 186));
		room.add(new Person("Nina", 172));
		room.add(new Person("Terhi", 185));

		while (!room.isEmpty()) {
		    System.out.println(room.take());
		}
	}
}
