package com.krieghb.cards.instr;

import java.util.ArrayList;

import com.krieghb.cards.instr.constants.Rank;
import com.krieghb.cards.instr.constants.Suit;

public class BlackjackPlayer extends Player {	

	
	
	public BlackjackPlayer() {
		this("Frankadolopolous");
	}
	
	public BlackjackPlayer(ArrayList<Card> hand) {
		this("Frankadolopolous", hand);
	}
	
	public BlackjackPlayer(String playerName) {
		this(playerName, new ArrayList<Card>(5));
	}
	
	public BlackjackPlayer(String playerName, ArrayList<Card> playerHand) {
		setName(playerName);
		setHand(playerHand);
		handValue = 0;
	}
	
	public void showHands() {
		
		boolean hasAce = false;
		
		System.out.print(getHands());
		

		System.out.print("Hand Value:  " + handValue + "\n");
		
		for (Card card : playerHand) {
			
			if (card.getRank().getCardName() == "Ace") {

				System.out.print("Had an ACE\n");
				
			}
			
			
		}
		System.out.print("\n");
		
	}

}
