package part10.collections_as_streams;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReadingFilesPerLine {
	public static List<String> read(String file){
		List<String> rows = new ArrayList<>();
		
		try {
			Files.lines(Paths.get(file)).forEach(row -> rows.add(row));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return rows;
	}
}
