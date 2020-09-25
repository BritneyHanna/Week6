package cardName;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {

	private List<Card> cards;

	public Deck() {

		cards = new ArrayList<Card>();

		String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
		for (int ranki = 0; ranki < ranks.length; ranki++) {
			String rank = ranks[ranki];
			for (int suiti = 0; suiti < suits.length; suiti++) {
				String suit = suits[suiti];

				String cardName = rank + " of " + suit;

				int value = ranki + 2;

				cards.add(new Card(cardName, value));

			}

		}

	}

	public List<Card> getCards() {
		return cards;

	}

	public void setCards(List<Card> cards) {
		this.cards = cards;

	}

	public Card draw() {
		return cards.remove(0);
	}

	public void shuffle() {
		Random random = new Random();
		for (int i = cards.size() - 1; i > 0; i--) {
			int j = random.nextInt(i + 1);
			Card cardIndexI = cards.get(i);
			Card cardIndexJ = cards.get(j);
			cards.set(i, cardIndexJ);
			cards.set(j, cardIndexI);
		}

	}
}
