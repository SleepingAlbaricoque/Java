package part9.inheritance.warehousing;

/* 날짜 : 2022.10.18
 * 이름 : 조수빈
 * 내용 : 상속과 다형성 실습하기
 */
public class Warehouse {
	protected double capacity;
	protected double balance;
	
	public Warehouse(double capacity) {
		if(capacity <=0.0) this.capacity = 0.0;
		else this.capacity = capacity;
		
		this.balance = 0.0;
	}
	
	public double getCapacity() {
		return this.capacity;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public double howMuchSpaceLeft() {
		return this.capacity - this.balance;
	}
	
	public void addToWarehouse(double amount) {
		if(amount < 0.0) 
			return;
		
		if(balance + amount > capacity)
			balance = capacity;
		else
			balance += amount;
	}
	
	public double takeFromWarehouse(double amount) {
		if(amount < 0.0) 
			return 0.0;
		
		if(amount > balance) {
			double takenAmount = balance;
			balance = 0.0;
			return takenAmount;
		}else
			return balance -= amount;
			
	}
	
	public String toString() {
		return "balance = " + this.balance + ", space left " + (capacity - balance);
	}
}
