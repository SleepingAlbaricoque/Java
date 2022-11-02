package part10.comparable_interface.literature;

public class Book {
	private String name;
	private int ageRec;
	
	public Book(String name, int ageRec) {
		this.name = name;
		this.ageRec = ageRec;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAgeRec() {
		return ageRec;
	}

	public void setAgeRec(int ageRec) {
		this.ageRec = ageRec;
	}
	
	public String toString() {
		return name + " (recommended for " + ageRec + " year-olds or older)";
	}
}
