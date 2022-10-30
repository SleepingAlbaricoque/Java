package part9.interface_practice.interface_in_a_box;

import java.util.ArrayList;

public class Box implements Packable{
	private double capacity;
	private ArrayList<Packable> container;
	
	public Box(double capacity) {
		this.capacity = capacity;
		this.container = new ArrayList<>();
	}
	
	public void add(Packable packable) {
		if(this.weight() + packable.weight() <= capacity)
			container.add(packable);
	}
	
	@Override
	public double weight() {
		double weight = 0;
		
		for(Packable p : container)
			weight += p.weight();
		
		return weight;
	}
	
	@Override
	public String toString() {
		return "Box: " + container.size() + " items, total weight " + this.weight() + " kg";
	}
}
