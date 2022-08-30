package part4.files_and_reading_data;

import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingFile {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(Paths.get("data.txt"))) {
			
			while(sc.hasNextLine()) {
				String line = sc.nextLine();
				System.out.println(line);
			}
		}
		
		catch(Exception e) {
			System.out.println("Error : " +e.getMessage());
		}
	}
}
