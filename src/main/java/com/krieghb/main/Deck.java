package com.krieghb.main;

import java.util.*;

import com.krieghb.constants.enums.Rank;
import com.krieghb.constants.enums.Suit;



public class Deck {


	
	List<Card> orderedCardList = new ArrayList<Card>(52);
	List<Card> cardList;
	Stack<Card> deckOfCards;
	
	public Deck() {
		
		//  Instantiating list of all 52 cards
		for (Suit s: Suit.values()) {
			for (Rank r : Rank.values()) {
				Card newCard = new Card(s, r);
				orderedCardList.add(newCard);
			}
		}
		
		//  To keep a list of all the values without it being shuffled;
		cardList = new ArrayList<Card>(orderedCardList);
		
		//  Shuffling ParentDeckOfCards and placing in stack;
		newDeckStack();
		
	}
	
	// Shuffling cardList
	public void shuffleDeck() {
		Collections.shuffle(cardList);
	}
	
	
	//  Creating new stack of cards
	public void newDeckStack() {
		
		shuffleDeck();
		
		deckOfCards = new Stack<Card>();
		
		for (Card oneCard : cardList) {
			deckOfCards.push(oneCard);
		}
		
	}
	
	//  Returning a card and removing from stack.
	public Card getACard() {
		Card retCard;
		
		try {
			retCard = deckOfCards.pop();
		}
		catch (EmptyStackException e) {
			System.out.println("No more cards in the deck!");
			retCard = null;
		}
		
		return retCard;
	}
	
	
	public void printDeck() {
		for (Card card : cardList) {
			card.printCard();
			System.out.println("");
		}
		
		System.out.println("\n\n");
	}
	
	public void printOrderedDeck() {
		for (Card card : orderedCardList) {
			card.printCard();
			System.out.println("");
		}
		
		System.out.println("\n\n");
	}
	
	
	
	
	

	
	
	
	


}
