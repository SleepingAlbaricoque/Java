package part10.collections_as_streams.weighting;

import java.util.ArrayList;

public class Suitcase {
    private int maximumWeight;
    private ArrayList<Item> Items;

    public Suitcase(int maximumWeight) {
        this.Items = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }

    public void addItem(Item Item) {
        if (this.totalWeight() + Item.getWeight() > this.maximumWeight) {
            return;
        }

        this.Items.add(Item);
    }

    public int totalWeight() {
    	int sum = 0;
    	
    	sum = Items.stream().mapToInt(item -> item.getWeight()).sum();
    	
    	return sum;
    }

    public void printItems() {
    	Items.forEach(item -> System.out.println(item.toString()));
    }

    public Item heaviestItem() {
    	return Items.stream().max((i1, i2) -> i1.getWeight() - i2.getWeight()).get();
    }

    @Override
    public String toString() {
        if (this.Items.isEmpty()) {
            return "no items (0 kg)";
        }

        if (this.Items.size() == 1) {
            return "1 item (" + this.totalWeight() + " kg)";
        }

        return this.Items.size() + " items (" + this.totalWeight() + " kg)";
    }
}
