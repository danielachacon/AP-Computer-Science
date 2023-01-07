package unit9;

import java.util.Random;
public class DeckOfCards 
{
	private String unshuffledCards[][] = new String[52][2];	// 0 = value 1 = suit
	
	private String suits[] = {"clubs", "diamonds", "hearts", "spades"};
	private String value[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
	
	public void displayDeck()
	{
		for(int i = 0; i < unshuffledCards.length; i++)
			System.out.println(unshuffledCards[i][0] + " " + unshuffledCards[i][1]);
	}
	
	public void shuffleDeck()
	{
		Random rand = new Random();
		int randomIndex;
		String tempSuit, tempValue;
		
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
	
	public void unshuffleDeck()
	{
		int valueCount = 0;
		int suitCount = 0;
		
		for(int i = 0; i < 52; i++)
		{
			unshuffledCards[i][0] = value[valueCount];
			unshuffledCards[i][1] = suits[suitCount];
			if((valueCount + 1) % 13 == 0)
			{
				valueCount = 0;
				suitCount++;
			}
			else
				valueCount++;
		}
	}
	
	public DeckOfCards()
	{
		unshuffleDeck();
	}
}
