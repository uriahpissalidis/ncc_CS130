package lab9;

/**
 * <p>Title: The Hand class</p>
 *
 * <p>Description: This class represents a Hand of playing cards. This class created an array of cards and
 * a integer representing the number of cards in the player's hand. It is capable of inserting cards into the
 * hand as well as replacing those cards. It can also find the number of face cards in the hand, find the
 * lowest card and replace it, and search if a particular card is in the hand. It also converts the card
 * array into a string.</p>
 * 
 * @author Uriah Pissalidis and Ken Chuang
 */
public class Hand {
	private Card[] cards;
	private int numCards;

	/**
	 * default Hand constructor --
	 * allocates an array that is capable of storing at most 10 Card references
	 * sets the number of cards to 0
	 */
	public Hand()
	{
		cards = new Card[7];
		numCards = 0;
	}

	/** 
	 * insertCard method -- 
	 * accepts a reference to the Card object to be stored in the next position in the 
	 * cards array - checks to make sure the array isn't full
	 * @param theCard a reference to the Card object to be stored in the array
	 */
	public void insertCard(Card theCard)
	{
		if (numCards < cards.length)
		{
			cards[numCards] = theCard;
			numCards++;
		}
	}

	/**
	 * getCards method --
	 * makes a copy of the cards array and returns the address of the copy; 
	 * the size of the array that is returned is based upon the number of 
	 * cards currently in the hand
	 * @return a reference to the copy of the cards array 
	 */
	public Card[] getCards()
	{
		
		Card[] cardsCopy = new Card[cards.length];
		for (int i = 0; i < cards.length; i++)
			cardsCopy[i] = cards[i];
		return cardsCopy;
	}


	/**
	 * replaceCard method -- 
	 * accepts a reference to a new Card object and the position in which 
	 * the reference should be stored; the position is expected to be in the
	 * range 0 - (number of cards -1); position is validated to ensure that 
	 * it is in this range
	 * @param pos the index where the card should be stored
	 * @param theCard the reference to the Card object to be stored in the array
	 */
	public void replaceCard(int position, Card theCard)
	{
		cards[position] = theCard;
	}


	/** 
	 * findNumFaceCards method --
	 * counts the number of face cards (ie. value of 11, 12 or 13) in the hand and
	 * returns the count
	 * @return the number of face cards in the hand
	 */
	public int findNumFaceCards()
	{
		int faceCount = 0;
		for (int i = 0; i < cards.length; i++)
		{
			if (cards[i].getValue()>10)
				faceCount += 1;
		}
		return faceCount;
	}


	/**
	 * searchCard method --
	 * accepts a reference to a Card to search for and determines whether 
	 * or not that card exists in the hand 
	 * @param theCard a reference to the Card to search for
	 * @return true if the card is found, false otherwise
	 */
	public boolean searchCard(Card aCard)
	{
		boolean exists = false;
		for (int i = 0; i < cards.length; i++)
		{
			if (cards[i].equalCard(aCard))
				exists = true;
		}
		return exists;
	}



	/**
	 * findLowCard method --
	 * finds and returns the position of the lowest card
	 * @return the index of the lowest card
	 */
	public int findLowCard()
	{
		int lowCard = 0;
		for (int i = 1; i < cards.length; i++)
		{
			if(cards[lowCard].getValue() > cards[i].getValue())
				lowCard = i;
		}
		return lowCard;
	}


	/**
	 * replaceLowCard method --
	 * accepts a reference to a Card object and replaces the card 
	 * having the lowest value with the new card
	 * @param theCard a reference to the Card object that will replace the 
	 * lowest card
	 */
	public void replaceLowCard(Card card)
	{
		cards[this.findLowCard()] = card;
	}


	/**
	 * toString method --
	 * creates and returns a reference to a String with each of the card values 
	 * on a separate line
	 * @return a reference to a String containing the state of the hand
	 */

	public String toString()
	{
		String str = new String();
		for (int i = 0; i < cards.length; i++)
		{
			str += "\nCard " + (i+1) + ": " + cards[i];
		}
		return str;
	}
}
