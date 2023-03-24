package unit9;

import java.util.Random;

/**
 * This class models a deck of cards which starts unshuffled 
 * and contains methods that shuffle the deck and displays it and unshuffle it again
 * @author Daniel Achacon
 */
public class DeckOfCards 
{
	private String unshuffledCards[][] = new String[52][2];	// column 0 stores value,  column 1 stores suit
	
	private String suits[] = {"clubs", "diamonds", "hearts", "spades"};
	private String value[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
	
	/**
	 * Displays Cards from top of deck to bottom of deck
	 */
	public void displayDeck()
	{
		for(int i = 0; i < unshuffledCards.length; i++)
			System.out.println(unshuffledCards[i][0] + " " + unshuffledCards[i][1]);	//Each card is 1 row with 2 attributes, Goes through each row and prints value and suit for each card
	}
	
	/**
	 * Shuffles the deck to have random order
	 */
	public void shuffleDeck()
	{
		Random rand = new Random();
		int randomIndex;
		String tempSuit, tempValue;
		
		//Picks a random card in the deck and swaps it with ith card in the deck each iteration
		for(int i = unshuffledCards.length - 1; i >= 1; i--)
		{
			randomIndex = rand.nextInt(i + 1);
			tempValue = unshuffledCards[i][0];
			tempSuit = unshuffledCards[i][1];
			
			unshuffledCards[i][0] = unshuffledCards[randomIndex][0];
			unshuffledCards[i][1] = unshuffledCards[randomIndex][1];
			
			unshuffledCards[randomIndex][0] = tempValue;
			unshuffledCards[randomIndex][1] = tempSuit;
		}
	}
	
	/**
	 * Unshuffles the deck, makes each card in order
	 */
	public void unshuffleDeck()
	{
		int valueCount = 0;
		int suitCount = 0;
		
		for(int i = 0; i < 52; i++)
		{
			//Goes through each card and fixes both attributes in correct order
			unshuffledCards[i][0] = value[valueCount];
			unshuffledCards[i][1] = suits[suitCount];
			
			//Iterates through every value before changing suit (ex: Clubs 1-King, then Diamonds 1-King)
			if((valueCount + 1) % 13 == 0)	//If card is unshuffled for every value for 1 suit
			{
				valueCount = 0;
				suitCount++;	//Then change suit and reset the value to go through iteration
			}
			else
				valueCount++;	//Iterate through value
		}
	}
	
	/**
	 * Constructor
	 * Fills empty array with the unshuffled deck of cards
	 */
	
	public DeckOfCards()
	{
		unshuffleDeck();
	}
}
