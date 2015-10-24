package com.krieghb.cards;

public class PokerDeck extends ParentDeckOfCards {
	
	private int numberOfDecks = 1;
	
	public PokerDeck() {
		instantiateCardList(numberOfDecks);
	}

}
