package cardName;

import java.util.List;

public class Player {

	private List<Card> hand;
	private int score;
	private String name;

	public Player(String name) {
		this.name = name;
	}

	public void describe() {

		System.out.println(name);

	}

	public Card flip() {
		return hand.remove(0);

	}

	public void draw(Deck deck) {
		hand.add(deck.draw());
	}

	public void incrementScore() {
		score++;
	}

	public String getName() {
		return name;
	}

}