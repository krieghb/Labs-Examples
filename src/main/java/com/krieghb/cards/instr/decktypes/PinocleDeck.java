package com.krieghb.cards.instr.decktypes;

import com.krieghb.cards.instr.Card;
import com.krieghb.cards.instr.abstracts.DeckOfCards;
import com.krieghb.cards.instr.constants.Rank;
import com.krieghb.cards.instr.constants.Suit;

public class PinocleDeck extends DeckOfCards {
	
	public PinocleDeck() {
		numDecks = 2;
		loadDeck();
	}
	
	
	public void loadDeck() {
		cardCount = 0;
		Card card;
		for (int i = 0; i < numDecks; i++) {
			for (Suit s : Suit.values()) {
				for (Rank r : Rank.values()) {
					if (r.getRank() < 9) {
						continue;
					}
					
					card = new Card(r, s);
					
					cardDeck.add(card);
					cardCount++;
				}
			}
		}
	}

}
