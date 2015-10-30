package com.krieghb.cards;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import com.krieghb.constants.enums.Rank;
import com.krieghb.constants.enums.Suit;

public class ParentDeckOfCards {

	/**
	 *  
1)     Create a public Class named Card which represents a regular playing card. The class should have 2 private enums: Value (2-Ace) Suit( Spades, Clubs, Hearts, and Diamonds).  Create Get and Set methods to manipulate the members of the class.  Constructor should take a value for each data member.  If you want, you can implement Methods associated with these enums to accept / return strings and/or Integers for each enum.  
2)     Create another public Class named DeckofCards.  This class should have an array of class Card to contain all 52 cards.  The constructor should be able to initialize the card array to contain all 52 values.  You should also consider a counter on the number of cards in a deck.  As you deal the cards, there will be fewer cards left in the deck.
3)     Create an Interface called Dealer which contains 2 methods, Shuffle and DealCard (which returns a Card Object)
4)   Implement the Dealer Interface with a new class NormalDealer for the dealer.  NormalDealer implements the Shuffle method by some means of randomizing the deck (I’ll let you figure that one out).    The DealCard method will return the top card available in the deck.  Both method should be passed a DeckofCards object. 
5)   Create a Player_O class that contains an array of 5 Cards and any other attributes that you would like to associate with a player.
6)   Create a class with a main method that instantiates a DeckofCards and multiple Player_O.  Use the Shuffle method to shuffle the deck and DealCard method to deal 5 cards to each player.  
7)   Print the cards dealt to each player

	 * 
	 * 
	 * 
	 * 
	 * 2)	Create 3 new classes that extend a deck of cards.  
a.	PinochleDeck – Note:  A Pinochle deck of cards contains 2 of each of the following cards 9, 10, Jack, Queen, King, and Ace of each suit.  This is a total of 48 cards.  You should define a method that Loads the deck and is called from the constructor.  This method should be overridden by subclasses (i.e. PinochleDeck).
b.	BlackJackShoe – Note: The shoe in Black Jack can typically hold up to 6 standard decks of 52 cards.  Initialize the Deck accordingly.
c.	PokerDeck – Similar to last week’s standard deck of 52 cards.

3)	Split the Dealer interface into 2 interfaces Shuffle and Deal.  The Deal interface should be extended by a Deal3 interface to extend Deal.  The Deal3 will return an array of 3 cards, while the standard Deal interface will return an array of 1 Card. Shuffle the decks. It’s typical for a Pinochle dealer to deal 3 cards at a time to each of 4 players – 12 cards each.  Create a PinochleDealer class to implement the Deal3 interface.

4)	Change the Player_O Class to use a List<Card> similar to the DeckofCards Class.  

5)	Change your main method to create a PinochleDeck, BlackJackShoe, and a PokerDeck.  Create 4 Pinochle players (deal twelve cards each, 3 at a time), 5 BlackJack Player_O’s – 2 Cards each from the “Shoe”, and 4 Poker Player_O’s – 5 Cards each.  Print each player’s hands.

	 */

	protected List<Card> orderedCardList = new ArrayList<Card>();
	protected List<Card> cardList;
	protected Stack<Card> stackOfCards;
	
	protected int numberOfDecks;
	protected int cardsLeft;
	protected int cardsPerDeck;
	
	
	public ParentDeckOfCards() {
		
//		this.instantiateCardList();
		
	}
	public ParentDeckOfCards(int decks) {
		
//		this.instantiateCardList(decks);
		
	}
	
	public List<Card> instantiateCardList() {
		numberOfDecks = 1;
		cardsPerDeck = 52;
		
		return this.instantiateCardList(numberOfDecks, cardsPerDeck);

	}
	
	public List<Card> instantiateCardList(int numOfDecks) {

		return this.instantiateCardList(numOfDecks, 52);
		
	}
	
	
	
	public List<Card> instantiateCardList(int numOfDecks, int cardsPerDeck) {
		this.numberOfDecks = numOfDecks;
		this.cardsPerDeck = cardsPerDeck;
		this.cardsLeft = numOfDecks * cardsPerDeck;
		
		orderedCardList = new ArrayList<Card>(cardsLeft);
		
		for (int i = 0; i < numOfDecks; i++) {
			//  Instantiating list of all 52 cards
			for (Suit s: Suit.values()) {
				for (Rank r : Rank.values()) {
					Card newCard = new Card(s, r);
					orderedCardList.add(newCard);
				}
			}
		}
		
		cardList = new ArrayList<Card>(orderedCardList);
		
		stackOfCards = new Stack<Card>();
		
		for (Card oneCard : cardList) {
			stackOfCards.push(oneCard);
		}
		
		
		return cardList;
		
	}
	
	public List<Card> getCardList() {
		return this.cardList;
	}
	
	
	public List<Card> resetCardList() {
		
		cardList = new ArrayList<Card> (orderedCardList);
		
		return cardList;
	}
	
	
	
	public Card dealCard() {
		
		Card card;
		
		
		try {
			card = cardList.remove(0);
			cardsLeft = cardList.size();
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println("No more cards!");
			card = null;
		}
		catch (Exception e) {
			
			System.out.println("Error with dealing a card:   ");
			e.printStackTrace();
			card = null;
			
		}
		
		
		return card;
		
	}
	
	public boolean cardsLeft() {
		
		return (cardsLeft > 0);
	}
	
	
	public int getCardsRemaining() {
		return cardsLeft;
	}
	
	
	public void printDeck() {
		for (Card card : cardList) {
			card.printCard();
			System.out.println("");
		}
	}
	
}
