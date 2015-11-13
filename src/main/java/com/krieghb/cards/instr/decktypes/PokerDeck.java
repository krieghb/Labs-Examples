package com.krieghb.cards.instr.decktypes;

import com.krieghb.cards.instr.abstracts.DeckOfCards;

public class PokerDeck extends DeckOfCards {
	
	public PokerDeck() {
		numDecks = 1;
		initialize();  // loadDeck();
	}
	
	public void initialize() {
		loadDeck();
	}

}
