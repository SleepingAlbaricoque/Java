package part4.objects_in_a_list.book;

public class Book {

	private String title;
	private int pages;
	private int pubYear;
	
	public Book(String title, int pages, int pubYear) {
		this.title = title;
		this.pages = pages;
		this.pubYear = pubYear;
	}
	
	public void showEverything() {
		System.out.println(title + ", " + pages + " pages, " + pubYear);
	}
	
	public void showName() {
		System.out.println(title);
	}
}
