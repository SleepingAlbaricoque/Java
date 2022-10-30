package part9.interface_practice.interface_in_a_box;

public class CD implements Packable{
	private String artist;
	private String title;
	private int pubYear;
	
	public CD(String artist, String title, int pubYear) {
		this.artist = artist;
		this.title = title;
		this.pubYear = pubYear;
	}
	
	@Override
	public double weight() {
		return 0.1;
	}
	
	@Override
	public String toString() {
		return artist + ": " + title + "(" + pubYear + ")";
	}
}
