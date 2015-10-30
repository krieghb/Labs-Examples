package com.krieghb.cards.instr;

import java.util.ArrayList;
import java.util.Collections;

import com.krieghb.cards.instr.abstracts.DeckOfCards;
import com.krieghb.cards.instr.abstracts.Shuffle;

public class ShuffleCards implements Shuffle {

	public void shuffle(DeckOfCards deck) {
		
		//  Shuffling 7 times ( :-) )
		for (int i = 0; i < 7; i++) {

			Collections.shuffle(deck.getDeck());
		}
		
	}

	public void shuffle(ArrayList<Card> deck) {
		
		//  Shuffling 7 times ( :-) )
		for (int i = 0; i < 7; i++) {

			Collections.shuffle(deck);
		}
		
	}

}
