package com.krieghb.cards.instr.decktypes;

import com.krieghb.cards.instr.abstracts.DeckOfCards;

public class BlackJackShoe extends DeckOfCards{
	
	public BlackJackShoe() {
		
		numDecks = 6;
		initialize();  //  loadDeck();
	}
	
	public void initialize() {
		loadDeck();
	}

	

}
