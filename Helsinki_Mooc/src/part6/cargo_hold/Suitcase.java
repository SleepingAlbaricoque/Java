package part6.cargo_hold;

import java.util.ArrayList;

public class Suitcase {
	private int MaxWeight;
	private ArrayList<Item> items;
	
	public Suitcase(int MaxWeight) {
		this.MaxWeight = MaxWeight;
		this.items = new ArrayList<>();
	}
	
	public void addItem(Item Item) {
		int totalWeight =0;
		for(Item Stuff : items) {
			totalWeight += Stuff.getWeight();
		}
		
		if(!(Item.getWeight() + totalWeight > MaxWeight))
			this.items.add(Item);
	}
	
	public String toString() {
		int totalWeight =0;
		for(Item Stuff : items) {
			totalWeight += Stuff.getWeight();
		}
		
		if(items.isEmpty())
			return "no items (0 kg)";
		else if(items.size() == 1)
			return "1 item (" + totalWeight + " kg)";
					
		return items.size() + " items (" + totalWeight + " kg)";
	}
	
	public void printItems() {
		for(Item item : items)
			System.out.println(item);
	}
	
	public int totalWeight() {
		int totalWeight =0;
		for(Item item : items) {
			totalWeight += item.getWeight();
		}
		
		return totalWeight;
	}
	
	public Item heaviestItem() {
		if(items.isEmpty())
			return null;
		
		Item returnItm = items.get(0);
		for(Item Item : items) {
			if(Item.getWeight() > returnItm.getWeight())
				returnItm = Item;
		}
		return returnItm;
			
	}
	
	public static void main(String[] args) {
		Item book = new Item("Lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("Brick", 4);

        Suitcase suitcase = new Suitcase(10);
        suitcase.addItem(book);
        suitcase.addItem(phone);
        suitcase.addItem(brick);

        Item heaviest = suitcase.heaviestItem();
        System.out.println("Heaviest item: " + heaviest);
	}
	
}
