package part9.inheritance.person_and_subclassees;

public class Person {
	protected String name;
	protected String addr;
	
	public Person(String name, String addr) {
		this.name = name;
		this.addr = addr;
	}
	
	public String toString() {
		return this.name + "\n  " + this.addr;
	}
}
