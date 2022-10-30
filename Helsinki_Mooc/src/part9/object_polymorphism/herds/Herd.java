package part9.object_polymorphism.herds;

import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {
	private List<Movable> herd = new ArrayList<>();
	
	public void addToHerd(Movable movable) {
		herd.add(movable);
	}
	
	@Override
	public void move(int dx, int dy) {
		for(Movable movable : herd)
			movable.move(dx, dy);
	}
	
	public String toString() {
		String result = "";
		
		for(Movable movable : herd)
			result += movable.toString()+"\n";
		
		return result;
	}
}
