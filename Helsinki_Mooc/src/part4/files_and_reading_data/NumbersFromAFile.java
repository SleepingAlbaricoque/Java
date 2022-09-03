package part4.files_and_reading_data;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("File? ");
		String file = sc.nextLine();
		System.out.print("Lower bound? ");
		int lowerBound = sc.nextInt();
		System.out.print("Upper bound? ");
		int upperBound = sc.nextInt();
		
		try(Scanner scanner = new Scanner(Paths.get(file))){
			while(scanner.hasNextLine()) {
				list.add(Integer.valueOf(scanner.nextLine()));
			}
		}	
			
		catch(Exception e) {
			System.out.println("Error : " + e.getMessage());
		}	
			
			int j = 0;
			
			for(int i : list) {
				if(i >= lowerBound && i <= upperBound) {
					j++;
				}
			}
			
			System.out.println("Numbers: " + j);
		}
	}

