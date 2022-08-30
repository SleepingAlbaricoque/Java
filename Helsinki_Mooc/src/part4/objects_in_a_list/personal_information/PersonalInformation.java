package part4.objects_in_a_list.personal_information;

public class PersonalInformation {

	private String firstName;
	private String lastName;
	private String numID;
	
	public PersonalInformation(String firstName, String lastName, String numID) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.numID = numID;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void showInfo() {
		System.out.println(firstName + " " + lastName);
	}
}
