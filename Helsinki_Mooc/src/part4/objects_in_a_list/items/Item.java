package part4.objects_in_a_list.items;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Item {

	private String name;
	private LocalDateTime createdAt;
	
	public Item(String name) {
		this.name = name;
		this.createdAt = LocalDateTime.now();
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
		return this.name + " (created at: " + formatter.format(this.createdAt) + ")";
	}
}
