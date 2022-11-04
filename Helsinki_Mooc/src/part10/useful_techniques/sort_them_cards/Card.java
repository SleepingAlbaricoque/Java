package part10.useful_techniques.sort_them_cards;

public class Card implements Comparable<Card>{
	private int value;
	private Suit suit;
	
	public Card(int value, Suit suit) {
		this.value = value;
		this.suit = suit;
	}
	
	public String toString() {
		String cardValue = "" + value;
        
        if (value == 11) {
            cardValue = "J";
        } else if (value == 12) {
            cardValue = "Q";
        } else if (value == 13) {
            cardValue = "K";
        } else if (value == 14) {
            cardValue = "A";
        }
        
        return suit + " " + cardValue;
	}

	public int getValue() {
		return value;
	}

	public Suit getSuit() {
		return suit;
	}

	@Override
	public int compareTo(Card card) {
	if(this.value != card.getValue())
		return this.value - card.getValue(); 
	else
		return this.suit.ordinal() - card.getSuit().ordinal();
	}
}
