package lab9;

import javax.swing.JOptionPane;

/**
 * <p>Title: The Lab9App class</p>
 *
 * <p>Description: This application class tests the various methods that have been written
 * in the Hand programmer-defined class. Initially, a new deck is created and shuffled, a new Hand object
 * is created and 7 cards are inserted into the user's hand. This program tests the toString method,
 * getCards accessor method, replaceCard method, findNumFaceCards method, searchCard method, findLowCard
 * method and replaceLowCard method. </p>
 * 
 * @author Uriah Pissalidis and Ken Chuang
 */
public class Lab9App {

	public static void main(String[] args)
	{
		// create and shuffle the deck
		Deck theDeck = new Deck();
		theDeck.shuffleDeck();
		
		// instantiate a Hand object
		Hand myHand = new Hand();
	
		// insert 7 amount of cards in the hand
		Card theCard;
		for (int i = 0; i < 7; i++)
		{
			theCard = theDeck.dealCard();
			myHand.insertCard(theCard);
		}
		
		// Printing out myHand object using toString method
		System.out.println("Testing toString method: " + myHand.toString());
		
		// Creating a new string for concactenation with the list of card objects from the copied card array
		String cardList = new String("\n");
		Card[] cards = myHand.getCards();
		for (int i = 0; i < 7; i++)
			cardList += cards[i] + "\n";
		System.out.println("\nTesting getCards method: " + cardList);
		
		// Replacing random card within the hand with a newly dealt card and prints it out
		String newCardList = new String("\n");
		cards[(int)(Math.random()*7)] = theDeck.dealCard();
		for (int i = 0; i < 7; i++)
			newCardList += cards[i] + "\n";
		System.out.println("Testing getCards method again: " + newCardList);
		
		// Verifying that the original hand did not change
		System.out.println("Verifying that original hand did not change: " + myHand.toString());
		
		// Replacing the first card in the hand and printing out the hand again
		myHand.replaceCard(0, theDeck.dealCard());
		System.out.println("\nReplacing card one: " + myHand.toString());
		
		// Checking to see if the Ace of Spades is in the hand
		Card aceOfSpades = new Card(40);
		boolean exists = myHand.searchCard(aceOfSpades);
		System.out.println("\nTesting Ace of Spades: " + exists);
		
		// Finds the number of face cards in the user's hand
		int faceCards;
		faceCards = myHand.findNumFaceCards();
		System.out.println("\nNumber of Face Cards: " + faceCards);
		
		// Replaces the lowest card in the hand with a random newly dealt card from the deck
		myHand.replaceLowCard(theDeck.dealCard());
		System.out.println("\nReplacing Low Card: " + myHand.toString());
	}
	
}
