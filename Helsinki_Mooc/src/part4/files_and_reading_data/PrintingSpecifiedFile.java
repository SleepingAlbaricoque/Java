package part4.files_and_reading_data;

import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingSpecifiedFile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Which file should have its contents printed?: ");
		String answer = sc.nextLine();
		
		try(Scanner scTwo = new Scanner(Paths.get(answer))){
			while(scTwo.hasNextLine()) {
				String row = scTwo.nextLine();
				System.out.println(row);
			}
		}
		
		catch(Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
