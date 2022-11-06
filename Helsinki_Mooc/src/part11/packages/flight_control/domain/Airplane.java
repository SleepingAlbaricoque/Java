package part11.packages.flight_control.domain;

public class Airplane {
	private String id;
	private int capacity;
	
	public Airplane(String id, int capacity) {
		this.id = id;
		this.capacity = capacity;
	}

	public String getId() {
		return id;
	}

	public int getCapacity() {
		return capacity;
	}
	
	public String toString() {
		return id + " (" + capacity + " capacity)";
	}
}
