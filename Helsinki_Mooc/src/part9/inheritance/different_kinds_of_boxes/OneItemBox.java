package part9.inheritance.different_kinds_of_boxes;

import java.util.ArrayList;

public class OneItemBox extends Box{
	private ArrayList<Item> singleItem;
	
	public OneItemBox() {
		this.singleItem = new ArrayList<>();
	}

	@Override
	public void add(Item item) {
		if(singleItem.isEmpty())
			singleItem.add(item);
	}

	@Override
	public boolean isInBox(Item item) {
		if(singleItem.contains(item))
			return true;
		
		return false;
	}
	
	public static void main(String[] args) {
		OneItemBox box = new OneItemBox();
		box.add(new Item("Saludo", 5));
		box.add(new Item("Pirkka", 5));

		System.out.println(box.isInBox(new Item("Saludo")));
		System.out.println(box.isInBox(new Item("Pirkka")));
	}
	
	
}
