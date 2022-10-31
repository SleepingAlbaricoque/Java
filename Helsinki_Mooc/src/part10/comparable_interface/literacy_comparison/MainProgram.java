package part10.comparable_interface.literacy_comparison;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class MainProgram {
	public static void main(String[] args) {
		List<String> rows = new ArrayList<>();
		
		try {
			Files.lines(Paths.get("literacy.csv"))
				 .map(row -> row.split(","))
				 .sorted((x,y) -> x[5].compareTo(y[5]))
				 .forEach(parts -> System.out.println(parts[3] + " (" + parts[4] + "), " + parts[3].trim() + ", " + parts[5]));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
