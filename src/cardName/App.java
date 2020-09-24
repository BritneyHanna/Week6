package cardName;

public class App {

	public static void main(String[] args) {

		Deck deck = new Deck();
		Player player = new Player("Bob");
		Player player2 = new Player("Tommy");

		deck.shuffle();
	}

}
