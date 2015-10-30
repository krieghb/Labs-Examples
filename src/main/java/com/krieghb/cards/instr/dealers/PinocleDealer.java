package com.krieghb.cards.instr.dealers;

import java.util.ArrayList;
import java.util.Collections;

import com.krieghb.cards.instr.Card;
import com.krieghb.cards.instr.Player;
import com.krieghb.cards.instr.abstracts.Deal3;
import com.krieghb.cards.instr.abstracts.DeckOfCards;
import com.krieghb.cards.instr.abstracts.Shuffle;
import com.krieghb.cards.instr.constants.Rank;
import com.krieghb.cards.instr.constants.Suit;
import com.krieghb.cards.instr.decktypes.PinocleDeck;

public class PinocleDealer implements Deal3, Shuffle {
	private DeckOfCards deck;
	
	public PinocleDealer() {
		this.deck = new PinocleDeck();
		
	}
	
	public PinocleDealer(PinocleDeck deck) {
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
	
	public ArrayList<Card> deal3Cards() {
		return deal3Cards(this.deck);
	}

	public ArrayList<Card> deal3Cards(DeckOfCards deck) {
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

	public ArrayList<Card> dealCard(DeckOfCards deck) {
		return null;
	}
	
	
	public void dealHands(ArrayList<Player> playerList) {
		ArrayList<Card> cards3;
		for (int i = 0; i < 4; i++) {
			for (Player player : playerList) {
				cards3 = new ArrayList<Card>(deal3Cards());
				
				for (int j = 0; j < 3; j++) {
					player.getACard(cards3.remove(0));
				}
			}
		}
	}
	

}
