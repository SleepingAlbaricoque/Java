package part9.inheritance.different_kinds_of_boxes;

import java.util.Objects;

public class Item {
	private String name;
	private int weight;
	
	public Item(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	
	public Item(String name) {
		this(name, 0);
	}
	
	public String getName() {
		return name;
	}

	public int getWeight() {
		return weight;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, weight);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return Objects.equals(name, other.name);
	}
}
