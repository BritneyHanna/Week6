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

//
//		for (int i = 1; i < 52; i++) {
//			if (i % 2 == 0) {
//				Bob.draw(deck);
//			} else {
//				Tony.draw(deck);
//			}
//			Card bobCard = Bob.flip();
//			Card tonyCard = Tony.flip();
//
//			if (bobCard.getValue() > tonyCard.getValue()) {
//				Bob.incrementScore();
//			} else if (tonyCard.getValue() > bobCard.getValue()) {
//				Tony.incrementScore();
//			} else {
//				Tony.incrementScore();
//				Bob.incrementScore();
//			}
//
//			int bobScore = Bob.getScore();
//			int tonyScore = Tony.getScore();
//
//			if (bobScore == tonyScore) {
//				System.out.println("It was a draw between" + Bob.getName() + "and" + Tony.getName());
//			} else if (bobScore > tonyScore) {
//				System.out.println("Bob is the winner!!!");
//			} else {
//				System.out.println("Tony is the winner");
//			}
//
//		
//	
//
