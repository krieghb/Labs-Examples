package com.krieghb.cards.instr;

import java.util.ArrayList;

import com.krieghb.cards.instr.abstracts.DeckOfCards;
import com.krieghb.cards.instr.cardgames.CardGame_War;
import com.krieghb.cards.instr.dealers.BlackJackDealer;
import com.krieghb.cards.instr.dealers.NormalDealer;
import com.krieghb.cards.instr.dealers.PinocleDealer;
import com.krieghb.cards.instr.dealers.PokerDealer;

public class SimpleHands {

	public static void main(String[] args) {
		
		DeckOfCards deck = new DeckOfCards();
		NormalDealer joeTheDealer = new NormalDealer();
		PinocleDealer larryTheDealer = new PinocleDealer();
		BlackJackDealer moeTheDealer = new BlackJackDealer();
		PokerDealer langTheDealer = new PokerDealer();
		
		joeTheDealer.shuffle(deck);
		
		Player wPlayer1 = new Player("Fred");
		Player wPlayer2 = new Player();
		
		Player pPlayer1 = new Player("Curly");
		Player pPlayer2 = new Player("Moe");
		Player pPlayer3 = new Player("Larry");
		Player pPlayer4 = new Player("Shemp");
		
		BlackjackPlayer bjPlayer1 = new BlackjackPlayer("Gibbs");
		BlackjackPlayer bjPlayer2 = new BlackjackPlayer("McGee");
		BlackjackPlayer bjPlayer3 = new BlackjackPlayer("Tony");
		BlackjackPlayer bjPlayer4 = new BlackjackPlayer("Ducky");
		BlackjackPlayer bjPlayer5 = new BlackjackPlayer("Ziva");

		Player poPlayer1 = new Player("Cartman");
		Player poPlayer2 = new Player("Kenny");
		Player poPlayer3 = new Player("Stan");
		Player poPlayer4 = new Player("Eddie");
		
		
		
		

		ArrayList<Player> wPlayerList = new ArrayList<Player>();
		wPlayerList.add(wPlayer1);
		wPlayerList.add(wPlayer2);
		
		ArrayList<Player> pPlayerList = new ArrayList<Player>();
		pPlayerList.add(pPlayer1);
		pPlayerList.add(pPlayer2);
		pPlayerList.add(pPlayer3);
		pPlayerList.add(pPlayer4);

		ArrayList<Player> bjPlayerList = new ArrayList<Player>();
		bjPlayerList.add(bjPlayer1);
		bjPlayerList.add(bjPlayer2);
		bjPlayerList.add(bjPlayer3);
		bjPlayerList.add(bjPlayer4);
		bjPlayerList.add(bjPlayer5);

		ArrayList<Player> poPlayerList = new ArrayList<Player>();
		poPlayerList.add(poPlayer1);
		poPlayerList.add(poPlayer2);
		poPlayerList.add(poPlayer3);
		poPlayerList.add(poPlayer4);
		
		//  Playing War
//		new CardGame_War(wPlayerList);
		
		//  Playing Pinocle
		larryTheDealer.dealHands(pPlayerList);
		for (Player player : pPlayerList) {
			player.showHands();
		}
		
		//  Playing BlackJack
		moeTheDealer.DealHands(bjPlayerList);
		for (Player player : bjPlayerList) {
			player.showHands();
			
		}
		
		//  Playing Poker
		langTheDealer.DealHands(poPlayerList);
		for (Player player : poPlayerList) {
			player.showHands();
		}
		
		
		
		
		
	}

}
