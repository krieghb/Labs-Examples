package com.krieghb.cards.interfaces;

import com.krieghb.cards.DeckOfCards;
import com.krieghb.cards.Player;

public interface CardGame {
	
	public void dealHands();
	
	public void dealHands(Player player, DeckOfCards deck, int numOfCards);
	
	public void printPlayersHands();
	
	public void foldAllHands();
	
	

}
