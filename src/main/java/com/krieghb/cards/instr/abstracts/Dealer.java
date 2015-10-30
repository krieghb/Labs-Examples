package com.krieghb.cards.instr.abstracts;

import com.krieghb.cards.instr.Card;

public interface Dealer {
	
	public void shuffle(DeckOfCards deck);

	public Card dealCard(DeckOfCards deck);
}
