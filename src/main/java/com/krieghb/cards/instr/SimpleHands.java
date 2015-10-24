package com.krieghb.cards.instr;

public class SimpleHands {

	public static void main(String[] args) {
		
		DeckOfCards deck = new DeckOfCards();
		NormalDealer joeTheDealer = new NormalDealer();
		
		joeTheDealer.shuffle(deck);
		
		Player player1 = new Player("Larry");
		Player player2 = new Player();
		
		for (int i = 0; i < 5; i++){
			player1.getACard(joeTheDealer.dealCard(deck));
			player2.getACard(joeTheDealer.dealCard(deck));
			
		}
		
		
		player1.showHands();
		player2.showHands();
		
	}

}
