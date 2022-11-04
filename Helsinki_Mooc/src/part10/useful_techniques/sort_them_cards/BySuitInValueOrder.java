package part10.useful_techniques.sort_them_cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card>{

	@Override
	public int compare(Card c1, Card c2) {
		if(c1.getSuit() == c2.getSuit())
			return c1.getValue() - c2.getValue();
		else
			return c1.getSuit().ordinal() - c2.getSuit().ordinal();
	}
	
	// Comparator<Card> comparator = Comparator.comparing(Card::getSuit).thenComparing(Card::getValue);

	public static void main(String[] args) {
		ArrayList<Card> cards = new ArrayList<>();

		cards.add(new Card(3, Suit.SPADE));
		cards.add(new Card(2, Suit.DIAMOND));
		cards.add(new Card(14, Suit.SPADE));
		cards.add(new Card(12, Suit.HEART));
		cards.add(new Card(2, Suit.SPADE));

		Collections.sort(cards, new BySuitInValueOrder());

		cards.stream().forEach(c -> System.out.println(c));
	}
}
