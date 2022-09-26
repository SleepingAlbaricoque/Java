package part5.cardpayments;

public class MainProgram {
	public static void main(String[] args) {
		
		PaymentTerminal unicafeExactum = new PaymentTerminal();
		System.out.println(unicafeExactum);
		
		PaymentCard annesCard = new PaymentCard(2);
		
		System.out.println("amount of money on the card is " + annesCard.balance());
		
		boolean wasSuccessful = unicafeExactum.eatHeartily(annesCard);
		System.out.println("there was enough money: " + wasSuccessful);
		
		unicafeExactum.addMoneyToCard(annesCard, 100);
		
		wasSuccessful = unicafeExactum.eatHeartily(annesCard);
		System.out.println("there was enough money: " + wasSuccessful);
		
		System.out.println("amount of money on the card is " + annesCard.balance());
		
		System.out.println(unicafeExactum);
	}
}
