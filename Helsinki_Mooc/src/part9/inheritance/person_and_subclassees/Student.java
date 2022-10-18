package part9.inheritance.person_and_subclassees;

public class Student extends Person {
	private int studyCredits;
	
	public Student(String name, String addr) {
		super(name, addr);
		this.studyCredits =0;
	}
	
	public void study() {
		this.studyCredits++;
	}
	
	public int credits() {
		return this.studyCredits;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n  Study credits " + this.studyCredits;
	}
}
