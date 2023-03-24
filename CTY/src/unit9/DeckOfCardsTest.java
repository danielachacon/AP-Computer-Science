package unit9;

public class DeckOfCardsTest {

	public static void main(String[] args)
	{
		System.out.println("Unshuffled Deck");
		DeckOfCards deck = new DeckOfCards();
		deck.displayDeck();
		System.out.println("__________________________________________________________");
		System.out.println("Shuffled Deck");
		deck.shuffleDeck();
		deck.displayDeck();
	}

}
