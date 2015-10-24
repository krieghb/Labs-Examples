package com.krieghb.cards;

import java.util.Collections;

import com.krieghb.cards.interfaces.Dealer;


public class NormalDealer implements Dealer {
	
	private ParentDeckOfCards mainDeck = new ParentDeckOfCards();
	
	private int numberDecksUsed;

	
	public NormalDealer() {
		mainDeck.instantiateCardList();
		
		numberDecksUsed = mainDeck.numberOfDecks;
	}
	
	public NormalDealer(int numOfDecks) {
		numberDecksUsed = numOfDecks;
		mainDeck.instantiateCardList(numOfDecks);
	}
	
	
	public int getNumberDecks() {
		return numberDecksUsed;
	}
	
	
	public void shuffle() {
		
		Collections.shuffle(mainDeck.getCardList());
		
	}
	
	public Card dealCard() {
		Card card;
		
		card = mainDeck.dealCard();
				
		return card;
	}

}
