package cardName;

import java.util.ArrayList;
import java.util.List;

public class Deck {

	private List<Card> cards = new ArrayList<Card>();

	private static String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

	private static String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };

	public Deck() {
		for (int ranki = 0; ranki < ranks.length; ranki++) {
			String rank = ranks[ranki];
			for (int suiti = 0; suiti < suits.length; suiti++) {
				String suit = suits[suiti];

				String cardName = rank + "of" + suit;
				System.out.println(cardName);
			}

		}

	}
}