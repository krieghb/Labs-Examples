package com.krieghb.cards.instr;

public interface Dealer {
	
	public void shuffle(DeckOfCards deck);

	public Card dealCard(DeckOfCards deck);
}
