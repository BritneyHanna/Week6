package cardName;

public class Card {

	private String name;
	private int value;

	public Card(String name, int value) {
		this.name = name;
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void describe() {
		System.out.println("Card " + name);
	}

}
//
////
////	private int value;
////	private String name;
////
////	public Card(String name, int value) {}
////		this.name = name;
////
////		this.value = value;
////
////	}
////
////	private void setValue(int value) {
////		this.value = value;
////
////	}
////
////	private void setName(String name) {
////		this.name = name;
////	}
////
////	public int getValue() {
////		return value;
////	}
////
////	public String getName() {
////		return name;
////	}
////
////	public void describe() {
////		System.out.println() ;
////	}
//
//////
////	@Override
////
////	public String toString() {
////		return name;
////	}
//}
//
////return "[name=" + name + ",value=" + value + "]";