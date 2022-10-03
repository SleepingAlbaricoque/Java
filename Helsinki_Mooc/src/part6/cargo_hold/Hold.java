package part6.cargo_hold;

import java.util.ArrayList;

public class Hold {
	private int maxWeight;
	private ArrayList<Suitcase> luggage;
	
	public Hold(int maxWeight) {
		this.maxWeight = maxWeight;
		this.luggage = new ArrayList<>();
	}
	
	public void addSuitcase(Suitcase suitcase) {
		int totalWeight =0;
		for(Suitcase stuff : luggage) 
			totalWeight += stuff.totalWeight();
		
		if(!(totalWeight + suitcase.totalWeight() > maxWeight)) 
			this.luggage.add(suitcase);
	}
	
	public String toString() {
		int totalWeight = 0;
		for(Suitcase suitcase : luggage) {
			totalWeight += suitcase.totalWeight();
		}
		
		return luggage.size() + " suitcases (" + totalWeight + " kg)";
	}
	
	public void printItems() {
		for(Suitcase suitcase : luggage) 
			suitcase.printItems();
				
	}
	
	public static void main(String[] args) {
		Item book = new Item("Lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("brick", 4);

        Suitcase adasCase = new Suitcase(10);
        adasCase.addItem(book);
        adasCase.addItem(phone);

        Suitcase pekkasCase = new Suitcase(10);
        pekkasCase.addItem(brick);

        Hold hold = new Hold(1000);
        hold.addSuitcase(adasCase);
        hold.addSuitcase(pekkasCase);

        System.out.println("The suitcases in the hold contain the following items:");
        hold.printItems();
	}
}
