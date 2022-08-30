package part4.objects_in_a_list.television_programs;

public class TelevisionProgram {

	private String name;
	private int duration;
	
	public TelevisionProgram(String name, int duration) {
		this.name = name;
		this.duration = duration;
	}
	
	public int getDuration() {
		return duration;
	}
	
	public void showInfo() {
		System.out.println(name + ", " + duration + " minutes");
	}
}
