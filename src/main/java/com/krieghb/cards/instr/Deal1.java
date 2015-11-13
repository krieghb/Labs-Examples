package com.krieghb.cards.instr;

import java.util.ArrayList;

import com.krieghb.cards.instr.abstracts.Deal;
import com.krieghb.cards.instr.abstracts.DeckOfCards;
import com.krieghb.cards.instr.constants.Rank;
import com.krieghb.cards.instr.constants.Suit;

public class Deal1 implements Deal {
	
	public Deal1() {
		
	}

	public ArrayList<Card> dealCard(DeckOfCards deck) throws DealCardException {
		ArrayList<Card> cards = new ArrayList<Card>();
		
		try{
			cards.add(deck.getDeck().remove(0));
			deck.decrementCount();
		}
		catch (DealCardException e) {
			
		}
		catch (IndexOutOfBoundsException e) {
			System.out.print("Failure in dealing card.");
			cards.add(new Card(Rank.ACE, Suit.CLUBS));
		}
		return cards;
	}

}
