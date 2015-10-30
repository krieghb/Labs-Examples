package com.krieghb.cards.instr.dealers;

import java.util.Collections;

import com.krieghb.cards.instr.Card;
import com.krieghb.cards.instr.abstracts.Dealer;
import com.krieghb.cards.instr.abstracts.DeckOfCards;
import com.krieghb.cards.instr.constants.Rank;
import com.krieghb.cards.instr.constants.Suit;

public class NormalDealer implements Dealer {
	
	private DeckOfCards deck;
	
	public NormalDealer() {
		this.deck = new DeckOfCards();
	}
	
	public NormalDealer(DeckOfCards deck) {
		this.deck = deck;
	}
	
	public void shuffle() {

		shuffle(this.deck);
	}

	public void shuffle(DeckOfCards deck) {
		
		//  Shuffling 7 times ( :-) )
		for (int i = 0; i < 7; i++) {

			Collections.shuffle(deck.getDeck());

		}
		
	}
	
	
	
	public Card dealCard() {
		return dealCard(this.deck);
	}

	public Card dealCard(DeckOfCards deck) {
		Card card;
		
		try{
			card = deck.getDeck().remove(0);
			deck.decrementCount();
		}
		catch (IndexOutOfBoundsException e) {
			card = new Card(Rank.ACE, Suit.CLUBS);
		}
		return card;
	}
	
	
	

}
