package cardName;

public class App {

	public static void main(String[] args) {

		Deck deck = new Deck();
		Player Bob = new Player("Bob");
		Player Tony = new Player("Tony");

		deck.shuffle();

		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				Bob.draw(deck);
			} else
				Tony.draw(deck);
		}
		Bob.describe();
		Tony.describe();

		for (int i = 0; i < 26; i++) {

			int bobFlips = Bob.flip().getValue();
			int tonyFlips = Tony.flip().getValue();
			if (bobFlips > tonyFlips) {
				Bob.incrementScore();
			} else if (bobFlips < tonyFlips) {
				Tony.incrementScore();
			} else {
				Tony.incrementScore();
				Bob.incrementScore();
			}

		}
		if (Bob.getScore() > Tony.getScore()) {
			System.out.println("Bob is the victor!!!!!!!! his score is : " + Bob.getScore());
		} else if (Bob.getScore() < Tony.getScore()) {
			System.out.println("Tony is the victor!!!!!!! his score is " + Tony.getScore());
		} else
			System.out.println(" It's a draw.");
	}

}
