package unit9;

public class Unit9Lab2 {

	public static void main(String[] args)
	{
		DeckOfCards deck = new DeckOfCards();
		
		deck.displayDeck();
		System.out.println("__________________");
		deck.shuffleDeck();
		deck.displayDeck();
		System.out.println("__________________");
		deck.unshuffleDeck();
		deck.displayDeck();
		System.out.println("__________________");
	}

}
