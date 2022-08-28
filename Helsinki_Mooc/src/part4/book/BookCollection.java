package part4.book;

import java.util.ArrayList;
import java.util.Scanner;

/* 날짜 : 2022.08.28
 * 이름 : 조수빈
 * 내용 : ArrayList 조건 따른 입출력 연습
 */
public class BookCollection {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Book> library = new ArrayList<>();
		
		while(true) {
			System.out.print("Enter a title: ");
			String title = sc.nextLine();
			if(title.isEmpty()) {
				break;
			}
			
			System.out.print("Enter the pages: ");
			int pages = Integer.valueOf(sc.nextLine());
			System.out.print("Enter the year of publication: ");
			int pubYear = Integer.valueOf(sc.nextLine());
			
			library.add(new Book(title, pages, pubYear));
		}
		
		System.out.println("What information will be printed? ");
		String answer = sc.nextLine();
		if(answer.equals("everything")) {
			for(Book book: library) {
				book.showEverything();
		}
		}else if(answer.equals("name")) {
				for(Book book: library) {
					book.showName();
				}
			}
		}
	}

