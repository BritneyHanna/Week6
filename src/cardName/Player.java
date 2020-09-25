package cardName;

import java.util.ArrayList;
import java.util.List;

public class Player {

	private List<Card> hand;

	private int score;
	private String name;

	public Player(String name) {
		this.name = name;
		this.hand = new ArrayList<Card>();
		this.score = 0;
	}

	public List<Card> gethand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void describe() {
		System.out.println("Playername " + name);

		for (Card i : hand) {
			i.describe();
		}

	}

	public void draw(Deck deck) {
		Card i = deck.draw();
		hand.add(i);
	}

//	public void draw(Deck deck) {
//		hand.add(deck.draw());
//	}

	public Card flip() {
		return hand.remove(0);
	}

	public void incrementScore() {
		score += 1;
	}

}
