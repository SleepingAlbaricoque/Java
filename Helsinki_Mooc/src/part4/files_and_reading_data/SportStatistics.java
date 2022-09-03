package part4.files_and_reading_data;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("File:");
		String file = sc.nextLine();
		System.out.println("Team:");
		String team = sc.nextLine();
		
	
		ArrayList<Match> matches = new ArrayList<>();
		
		try(Scanner scanner = new Scanner(Paths.get(file))){
			while(scanner.hasNextLine()) {
				String line = scanner.nextLine();
				
				String[] parts = line.split(",");
				String home = parts[0];
				String visiting = parts[1];
				int hScore = Integer.valueOf(parts[2]);
				int vScore = Integer.valueOf(parts[3]);
				matches.add(new Match(home, visiting, hScore, vScore));
			}
		}
		catch(Exception e) {
			System.out.println("Error : " + e.getMessage());
		}
		
		int i = 0;
		for(Match match : matches) {
			if(match.getName().equals(team) || match.getVName().equals(team)) {
				i++;
			}
		}
		
		int j = 0;
		for(Match match : matches) {
			if(match.getName().equals(team)) {
				if(match.getHScore() > match.getVScore()) {
					j++;
				}
			}
			if(match.getVName().equals(team)) {
				if(match.getHScore() < match.getVScore()) {
					j++;
				}
			}
		}
		System.out.println("Games: " + i);
		System.out.println("Wins: "+ j);
		System.out.println("Losses: " + (i-j));
		
		
	}
}
