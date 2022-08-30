package part4.files_and_reading_data;

import java.nio.file.Paths;
import java.util.Scanner;

public class ReadingFromFile {

	public static void main(String[] args) {
		
	try(Scanner sc = new Scanner(Paths.get("file.txt"))) {
		
		while(sc.hasNextLine()) {
			String row = sc.nextLine();
			System.out.println(row);
		}
	}
	
	catch(Exception e) {
		System.out.println("Error: " + e.getMessage());
	}
}
}