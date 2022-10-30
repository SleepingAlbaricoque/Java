package part9.interface_practice.online_shop;

public class Item {
	private String product;
	private int qty;
	private int unitPrice;
	
	public Item(String product, int qty, int unitPrice) {
		this.product = product;
		this.qty = qty;
		this.unitPrice = unitPrice;
	}
	
	public int price() {
		return qty * unitPrice;
	}
	
	public void increaseQuantity() {
		qty++;
	}
	
	public String toString() {
		return product + ": " + qty;
	}
	
	public static void main(String[] args) {
		Item item = new Item("milk", 4, 2);
		System.out.println("an item that contains 4 milks has the total price of " + item.price());
		System.out.println(item);
		item.increaseQuantity();
		System.out.println(item);
	}
}
