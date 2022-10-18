package part9.inheritance.warehousing;

public class ProductWarehouseWithHistory extends ProductWarehouse{
	private ChangeHistory houseLog;
	
	public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
		super(productName, capacity);
		super.addToWarehouse(initialBalance);
		houseLog = new ChangeHistory();
		houseLog.add(initialBalance);
	}
	
	public String history() {
		return houseLog.toString();
	}
	
	@Override
	public void addToWarehouse(double amount) {
		if(this.getBalance() + amount <= this.capacity)
			houseLog.add((double) this.getBalance() + amount);
		else
			houseLog.add(this.capacity);
		
		super.addToWarehouse(amount);
	}
	
	@Override
	public double takeFromWarehouse(double amount) {

		if(amount <= this.getBalance())
			houseLog.add((double) this.getBalance() - amount);
		else
			houseLog.add(0.0);
		
		return super.takeFromWarehouse(amount);
	}
	
	public void printAnalysis() {
		System.out.println(
			"Product: " + this.getName() + "\n" +
			"History: " + this.houseLog + "\n" +
			"Largest amount of product: " + houseLog.maxValue() + "\n" +
			"Smallest amount of product: " + houseLog.minValue() + "\n" +
			"Average: " + houseLog.average()
		);
	}
	
	public static void main(String[] args) {
		ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
		juice.takeFromWarehouse(11.3);
		juice.addToWarehouse(1.0);
		//System.out.println(juice.history()); // [1000.0, 988.7, 989.7]

		juice.printAnalysis();
	}
}
