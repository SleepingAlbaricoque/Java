package part5.learningOOP;

/* 날짜 : 2022.09.18
 * 이름 : 조수빈
 * 내용 : Book 클래스 만들기 실습
 */
public class Book {
	String author;
	String name;
	int pages;
	
	public Book(String author, String name, int pages) {
		this.author = author;
		this.name = name;
		this.pages = pages;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPages() {
		return pages;
	}
	
	public String toString() {
		return author + ", " + name + ", " + pages;
	}
}
