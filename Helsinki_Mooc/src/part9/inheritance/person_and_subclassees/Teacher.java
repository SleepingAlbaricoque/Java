package part9.inheritance.person_and_subclassees;

public class Teacher extends Person {
	private String name;
	private String addr;
	private int salary;
	
	public Teacher(String name, String addr, int salary) {
		super(name, addr);
		this.salary = salary;
	}
	
	public String toString() {
		return super.toString() + "\n  salary" + this.salary + " euro/month";
	}
}
