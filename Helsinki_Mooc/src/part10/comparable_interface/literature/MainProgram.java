package part10.comparable_interface.literature;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Book> books = new ArrayList<>();
		
		while(true) {
			System.out.print("Input the name of the book, empty stops: ");
			String name = sc.nextLine();
			if(name.equals(""))
				break;
			System.out.print("Inpute the age recommendation: ");
			int ageRec = Integer.valueOf(sc.nextLine());
			books.add(new Book(name, ageRec));
		}
		
		System.out.println("");
		System.out.println(books.size() + " books in total.");
		System.out.println("");
		System.out.println("Books: ");
		
		Comparator<Book> comparator = Comparator.comparing(Book::getAgeRec).thenComparing(Book::getName);
		Collections.sort(books, comparator);
		
		for(Book book : books)
			System.out.println(book);
	}
}
