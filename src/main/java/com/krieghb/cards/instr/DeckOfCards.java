package com.krieghb.cards.instr;

import java.util.ArrayList;
import java.util.List;

import com.krieghb.cards.instr.constants.Rank;
import com.krieghb.cards.instr.constants.Suit;

public class DeckOfCards {
	
	
	private List<Card> cardDeck = new ArrayList<Card>(52);
	private int cardCount;
	
	public DeckOfCards() {
	
		newDeck();
	}
	
	public void newDeck() {
		cardCount = 0;
		Card card;
		for (Suit s : Suit.values()) {
			for (Rank r : Rank.values()) {
				
				card = new Card(r, s);
				
				cardDeck.add(card);
				cardCount++;
			}
		}
	}
	
	public List<Card> getDeck() {
		return cardDeck;
	}
	
	public int getCardCount() {
		return cardCount;
	}
	public void decrementCount() {
		cardCount--;
	}

}
