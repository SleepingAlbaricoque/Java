package part9;

import java.util.ArrayList;

class Animal {
	public void move () {}
}

class Human extends Animal {
	public void move () {
		System.out.println("walk");
	}
	
	public void read() {}
}

class Tiger extends Animal {
	public void move () {
		System.out.println("crawl");
	}
}

class Eagle extends Animal {
	public void move () {
		System.out.println("fly");
	}
}

public class AnimalTest {
	public static void main(String[] args) {
		ArrayList<Animal> aniList = new ArrayList<>(); // The type of the arraylist is Animal
		aniList.add(new Human());
		aniList.add(new Tiger());
		aniList.add(new Eagle());
		// aniList.get(0).read(); cannot invoke the read() method even though it's an instance of the class Human since the instance has already been upcast to Animal

		for(Animal ani : aniList) { // Because every element is stored as Animal type, this for loop works
			ani.move();             // Each instance decides which overriding method to call
		}
	}
}
