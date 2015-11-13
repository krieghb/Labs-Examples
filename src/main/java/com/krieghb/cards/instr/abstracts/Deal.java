package com.krieghb.cards.instr.abstracts;

import java.util.ArrayList;

import com.krieghb.cards.instr.Card;
import com.krieghb.cards.instr.DealCardException;

public interface Deal {


	public ArrayList<Card> dealCard(DeckOfCards deck) throws DealCardException;
	
	
}
