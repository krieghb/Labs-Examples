package com.krieghb.cards.instr.dealers;

import java.util.ArrayList;
import java.util.Collections;

import com.krieghb.cards.instr.Card;
import com.krieghb.cards.instr.Player;
import com.krieghb.cards.instr.abstracts.Deal;
import com.krieghb.cards.instr.abstracts.DeckOfCards;
import com.krieghb.cards.instr.abstracts.Shuffle;
import com.krieghb.cards.instr.constants.Rank;
import com.krieghb.cards.instr.constants.Suit;

public class BlackJackDealer implements Deal, Shuffle {

	private DeckOfCards deck;
	
	public BlackJackDealer() {
		this(new DeckOfCards());
	}
	
	public BlackJackDealer(DeckOfCards deck) {
		this.deck = deck;
		shuffle();
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
	
	public ArrayList<Card> dealCard() {
		return dealCard(this.deck);
	}

	public ArrayList<Card> dealCard(DeckOfCards deck) {
		ArrayList<Card> cards = new ArrayList<Card>();
		
		try{
			cards.add(deck.getDeck().remove(0));
			deck.decrementCount();
		}
		catch (IndexOutOfBoundsException e) {
			System.out.print("Failure in dealing card.");
			cards.add(new Card(Rank.ACE, Suit.CLUBS));
		}
		return cards;
	}
	
	
	public void DealHands(ArrayList<Player> playerList) {
		for (int i = 0; i < 2; i++) {
			for (Player player : playerList) {
				player.getACard(dealCard().get(0));
			}
		}
	}

}
