package com.krieghb.cards.instr;

import java.util.ArrayList;

import com.krieghb.cards.instr.abstracts.Deal;
import com.krieghb.cards.instr.abstracts.DeckOfCards;
import com.krieghb.cards.instr.constants.Rank;
import com.krieghb.cards.instr.constants.Suit;

public class Deal3 implements Deal {
	
	public Deal3() {
		
	}

	public ArrayList<Card> dealCard(DeckOfCards deck) {
		ArrayList<Card> cards3 = new ArrayList<Card>(3);
		
		try {
			cards3.add(deck.getDeck().remove(0));
			deck.decrementCount();
			cards3.add(deck.getDeck().remove(0));
			deck.decrementCount();
			cards3.add(deck.getDeck().remove(0));
			deck.decrementCount();
		}
		catch (IndexOutOfBoundsException e) {
			System.out.print("Failure in dealing 3 cards.");
			cards3.add(new Card(Rank.ACE, Suit.CLUBS));
			cards3.add(new Card(Rank.ACE, Suit.CLUBS));
			cards3.add(new Card(Rank.ACE, Suit.CLUBS));
		}
		
		return cards3;
	}

}
