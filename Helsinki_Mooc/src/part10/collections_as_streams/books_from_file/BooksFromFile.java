package part10.collections_as_streams.books_from_file;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class BooksFromFile {
	public static List<Book> readBooks(String file){
		List<Book> books = new ArrayList<>();
		
		try {
			Files.lines(Paths.get(file)).map(row -> row.split(","))
				.filter(parts -> parts.length >=4)
				.map(parts -> new Book(parts[0], Integer.valueOf(parts[1]), Integer.valueOf(parts[2]), parts[3]))
				.forEach(book -> books.add(book));
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return books;
	}
}
