package part9.inheritance.different_kinds_of_boxes;

import java.util.ArrayList;

public class BoxWithMaxWeight extends Box{
	private int capacity;
	private ArrayList<Item> items;
	
	public BoxWithMaxWeight(int capacity) {
		this.capacity = capacity;
		this.items = new ArrayList<>();
	}
	
	
	@Override
	public void add(Item item) {
		int sum = 0;
		for(Item thing : items)
			sum += thing.getWeight();
		if(sum + item.getWeight() <= capacity) {
			items.add(item);
		}
	}

	@Override
	public boolean isInBox(Item item) {
		if(items.contains(item))
			return true;
		
		return false;
	}
	
	public static void main(String[] args) {
		BoxWithMaxWeight coffeeBox = new BoxWithMaxWeight(10);
		coffeeBox.add(new Item("Saludo", 5));
		coffeeBox.add(new Item("Pirkka", 5));
		coffeeBox.add(new Item("Kopi Luwak", 5));

		System.out.println(coffeeBox.isInBox(new Item("Saludo")));
		System.out.println(coffeeBox.isInBox(new Item("Pirkka")));
		System.out.println(coffeeBox.isInBox(new Item("Kopi Luwak")));
	}
	
}
