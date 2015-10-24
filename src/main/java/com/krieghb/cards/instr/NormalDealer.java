package com.krieghb.cards.instr;

import java.util.Collections;

public class NormalDealer implements Dealer {

	public void shuffle(DeckOfCards deck) {
		
		//  Shuffling 7 times ( :-) )
		for (int i = 0; i < 7; i++) {

			Collections.shuffle(deck.getDeck());

		}
		
	}

	public Card dealCard(DeckOfCards deck) {
		Card card;
		
		card = deck.getDeck().remove(0);
		deck.decrementCount();
		
		return card;
	}

}
