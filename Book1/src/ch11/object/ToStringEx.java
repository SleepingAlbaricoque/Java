package ch11.object;

/* 날짜 : 2022.09.07
 * 이름 : 조수빈
 * 내용 : toString() 메서드 연습
 */
class Book {
	int bookNumber;
	String bookTitle;
	
	Book(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	public String toString() {
		return bookTitle + "," + bookNumber;
	}
}

public class ToStringEx {
	public static void main(String[] args) {
		Book book1 = new Book(200, "개미");
		
		System.out.println(book1);
		System.out.println(book1.toString());
	}
}
