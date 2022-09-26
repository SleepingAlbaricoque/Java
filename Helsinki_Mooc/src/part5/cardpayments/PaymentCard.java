package part5.cardpayments;

/* 날짜 : 2022.09.26
 * 이름 : 조수빈
 * 내용 : 참조변수 실습하기
 */
public class PaymentCard {
	private double balance;
	
	public PaymentCard(double balance) {
		this.balance = balance;
	}
	
	public double balance() {
		return this.balance;
	}
	
	public void addMoney(double increase) {
		this.balance += increase;
	}
	
	public boolean takeMoney(double amount) {
		if(balance >= amount) {
			this.balance -= amount;
			return true;
		}else 
			return false;
	}
}
