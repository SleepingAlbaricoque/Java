package part10.useful_techniques.sort_them_cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand implements Comparable<Hand>{
	private List<Card> hand = new ArrayList<>();
	
	public void add(Card card) {
		hand.add(card);
	}
	
	public void print() {
		hand.stream().forEach(card -> System.out.println(card));
	}
	
	public void sort() {
		Collections.sort(hand);
	}
	
	@Override
	public int compareTo(Hand otherHand) {
		int thisSum = hand.stream().mapToInt(card -> card.getValue()).reduce(0, (a, b) -> a + b);
		int otherSum = otherHand.hand.stream().mapToInt(card -> card.getValue()).reduce(0, (a,b) -> a+b);
		return thisSum - otherSum;
	}
	
	public void sortBySuit() {
		Collections.sort(hand, (c1, c2) -> {
			if(c1.getSuit() == c2.getSuit())
				return c1.getValue() - c2.getValue();
			else
				return c1.getSuit().ordinal() - c2.getSuit().ordinal();
		});
	}
	
	public static void main(String[] args) {
		Hand hand = new Hand();

		hand.add(new Card(12, Suit.HEART));
		hand.add(new Card(4, Suit.SPADE));
		hand.add(new Card(2, Suit.DIAMOND));
		hand.add(new Card(14, Suit.SPADE));
		hand.add(new Card(7, Suit.HEART));
		hand.add(new Card(2, Suit.SPADE));

		hand.sortBySuit();

		hand.print();
	}
}
