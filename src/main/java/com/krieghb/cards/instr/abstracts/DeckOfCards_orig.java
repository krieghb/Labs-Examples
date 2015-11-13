package com.krieghb.cards.instr.abstracts;

import java.util.ArrayList;

import com.krieghb.cards.instr.Card;
import com.krieghb.cards.instr.ShuffleCards;
import com.krieghb.cards.instr.constants.Rank;
import com.krieghb.cards.instr.constants.Suit;

public class DeckOfCards_orig {
	
	
	protected ArrayList<Card> cardDeck = new ArrayList<Card>(52);
	protected int cardCount;
	protected int numDecks;
	
	public DeckOfCards_orig() {
	
		this(1);
	}
	
	public DeckOfCards_orig(int numDecks) {
		this.numDecks = numDecks;
		loadDeck();
	}
	
	public void loadDeck() {
		cardCount = 0;
		Card card;
		for (int i = 0; i < numDecks; i++) {
			for (Suit s : Suit.values()) {
				for (Rank r : Rank.values()) {
					
					card = new Card(r, s);
					
					cardDeck.add(card);
					cardCount++;
				}
			}
		}
	}
	
	public ArrayList<Card> getDeck() {
		return cardDeck;
	}
	
	public int getCardCount() {
		return cardCount;
	}
	public void decrementCount() {
		cardCount--;
	}
	
	
	public void shuffle() {
		ShuffleCards shuffle = new ShuffleCards();
		
		shuffle.shuffle(cardDeck);
	}
	


}
