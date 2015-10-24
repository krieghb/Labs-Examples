package com.krieghb.cards;

import java.util.ArrayList;
import java.util.List;


public class DeckMain {
	
	
	
	public static void main(String[] args) {
		
		//  List of players for the game (passed on to card game object).
		List<Player> players = new ArrayList<Player>();
		
		// Creating a dealer
//		NormalDealer dealer = new NormalDealer(1);
		
//		dealer.shuffle();
		
		
		//  Deck of cards object to hold the 52 cards
//		DeckOfCards newDeck = new DeckOfCards();
		
		//  Card Game object, specifically the game of War.
//		CardGame_War2 newWarGame;
		
		// Players to participate in the card games
		Player newPlayer1 = new Player("Doug");
		Player newPlayer2 = new Player("Lisa");
		Player newPlayer3 = new Player("Frankadopolopolous");
//		Player newPlayer4 = new Player("Pat");
		
		//  Adding players to card game
		players.add(newPlayer1);
		players.add(newPlayer2);
		
		
		
		//  Instantiating a new war game with 2 players
		 new CardGame_War2(players);
		
//		//  Showing ordering of hands.
//		newWarGame.dealHands(newPlayer3, newDeck, 5);
//		newPlayer3.printHand();
//		newPlayer3.orderHand();
//		newPlayer3.printHand();
		
		
		
//		//  Dealing cards to the players
//		newWarGame.dealHands();
//		
//		//  Printing out the players current hands.
//		newWarGame.printPlayersHands();		
//		
//		
//		// Playing War
//		newWarGame.playWar();
		
	}
	
	
}

