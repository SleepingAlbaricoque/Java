package part5.reference_variable.money;

/* 날짜 : 2022.09.28
 * 이름 : 조수빈
 * 내용 : 참조 변수와 메서드 생성 실습하기
 */
public class Money {
	
	private final int euros;
	private final int cents;
	
	public Money(int euros, int cents) {
		this.euros = euros;
		this.cents = cents;
	}
	
	public int euros() {
		return euros;
	}
	
	public int cents() {
		return cents;
	}
	
	public String toString() {
		String zero = "";
		if (cents <= 10) {
			zero = "0";
		}
		
		return euros + "." + zero + cents + "e";
	}
	
	public Money plus(Money addition) {
		int newEuros = this.euros + addition.euros;
		int newCents = this.cents + addition.cents;
		if(newCents >= 100) {
			newEuros += 1;
			newCents -= 100;
		}
		
		Money newMoney = new Money(newEuros, newCents);
		
		return newMoney;
	}
	
	public boolean lessThan(Money compared) {
		if(this.euros < compared.euros) 
			return true;
		
		if(this.euros == compared.euros && this.cents < compared.cents)
			return true;
		
		return false;
	}
	
	public Money minus(Money decreaser) {
		int newEuros = this.euros - decreaser.euros;
		int newCents = this.cents - decreaser.cents;
		Money newMoney = new Money(0, 0);
		Money newMoney2 = new Money(newEuros -1, newCents + 100);
		Money newMoney3 = new Money(newEuros, newCents);
		
		if(newEuros <= 0)
			return newMoney;
		
		else {
			if(newCents <= 0)
				return newMoney2;
			
			return newMoney3;
		}
	}
}
