package com.krieghb.cards;

import com.krieghb.cards.interfaces.CardGame;
import com.krieghb.constants.numbers.Number_Constants;
import com.krieghb.constants.strings.String_Letters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CardGame_War implements CardGame {
	
//	private DeckOfCards warDeck;
	
	private ParentDeckOfCards warDeck;
	
	//  Number of cards per player.
	private int numOfCards;
	
	private List<Player_O> playerList;
	
	private Player_O player1;
	private Player_O player2;
	
	private int handCounter = 0;
	private int tieCounter = 0;
	
	/**
	 *   Basic constructor with the list of players (for war should only be 2).
	 * @param playerList
	 */
	public CardGame_War(List<Player_O> playerList) {

		//  Calling main constructor with player list, new deck and default card number.
		this(playerList, new ParentDeckOfCards(2), Number_Constants.WAR_CARD_PER_PLAYER);
		
		
	}
	
	
	public CardGame_War(Player_O player1, Player_O player2) {

		//  Calling main constructor with new player list with given players, new deck and default card number.
//		this(Arrays.asList(player1, player2), new DeckOfCards(), Number_Constants.WAR_CARD_PER_PLAYER);
		this(Arrays.asList(player1, player2), new ParentDeckOfCards(), Number_Constants.WAR_CARD_PER_PLAYER);
		
		
	}
	
	
	public CardGame_War(List<Player_O> playerList, ParentDeckOfCards deck) {

		//  Calling main constructor with player list, given deck and default card number.
		this(playerList, deck, Number_Constants.WAR_CARD_PER_PLAYER);
		
		
	}
	
	
	public CardGame_War(List<Player_O> playerList, ParentDeckOfCards deck, int numOfCards) {

		setPlayerList(playerList);
		
		this.warDeck = deck;
		
		this.numOfCards = numOfCards;
		
		Collections.shuffle(warDeck.getCardList());
		
		
	}
	
	
	public void setPlayerList(List<Player_O> playerList) {
		
		if (playerList.size() > 2) {
			System.err.println("Only two players can play WAR at the same time, only using first two in the list of players.");
			
		}
		else if (playerList.size() < 2) {
			System.err.println("Two players are needed to play WAR, only one was given, adding Frankadopolopolous to play against " + playerList.get(0).getName());
			playerList.add(new Player_O("Frankadopolopolous"));
		
		}
		
		this.playerList = new ArrayList<Player_O>();
		this.playerList.add(playerList.get(0));
		this.playerList.add(playerList.get(1));
		
		this.player1 = this.playerList.get(0);
		this.player2 = this.playerList.get(1);
	}
	

	public void dealHands() {
		
		for (int cardI = 0; cardI < numOfCards; cardI++) {
			for (Player_O thisPlayer : playerList) {
				
//				thisPlayer.addToHand(warDeck.getACard());
				thisPlayer.addToHand(warDeck.dealCard());
				
			}
		}
	}

	public void dealHands(Player_O player, DeckOfCards deck, int numOfCards) {
		
		for (int cardI = 0; cardI < numOfCards; cardI++) {
			player.addToHand(deck.getACard());
				
		}
		
	}

	public void printPlayersHands() {
		System.out.println("\n****************************************************************************************************");
		
		for (Player_O player : playerList) {
			System.out.println("****************************************************************************************************");
			player.printHand();
			System.out.println("\n****************************************************************************************************");
		}
		System.out.println("****************************************************************************************************");
	}

	
	public void foldAllHands() {
		for (Player_O thisPlayer : playerList) {
			thisPlayer.foldHand();
		}
	}
	
	
	
	public void playWar() {
		//  Reseting tie counter and hand counter.
		tieCounter = 0;
		handCounter = 0;
		int maxRounds = Number_Constants.MAX_WAR_ROUNDS;
		
		List<Card> cardWonList = new ArrayList<Card>();

		printPlayersHands();
		
		
		
		String hm = 
				"************************************************************************************************************\n"
			  + "************************************************************************************************************\n"
	   		  + "********************    ************    ********                ********                ********************\n"
	   		  + "********************    ************    ********    ********    ********    ********    ********************\n"
	   		  + "********************    ************    ********    ********    ********    ********    ********************\n"
	   		  + "********************    ************    ********    ********    ********    ********    ********************\n"
	   		  + "********************    ************    ********    ********    ********    ********    ********************\n"
	   		  + "********************    ************    ********    ********    ********    ********    ********************\n"
	   		  + "********************    ************    ********    ********    ********    ********    ********************\n"
	   		  + "********************    ************    ********                ********               *********************\n"
	   		  + "********************    ****    ****    ********    ********    ********    **    **************************\n"
	   		  + "********************    ****    ****    ********    ********    ********    ***    *************************\n"
	   		  + "********************    ****    ****    ********    ********    ********    ****    ************************\n"
	   		  + "********************    ****    ****    ********    ********    ********    *****    ***********************\n"
	   		  + "********************    ****    ****    ********    ********    ********    ******    **********************\n"
	   		  + "********************    ****    ****    ********    ********    ********    *******    *********************\n"
	   		  + "********************    ****    ****    ********    ********    ********    ********    ********************\n"
	   		  + "********************                    ********    ********    ********    *********    *******************\n"
	   		  + "************************************************************************************************************\n"
	   		  + "************************************************************************************************************";
		
		System.out.println(hm);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
								
		
		while ( (!player1.playerHand.isEmpty()) && (!player2.playerHand.isEmpty()) & (handCounter < maxRounds) ) {
			

			
			System.out.println("\n");
			
			Card p1 = player1.playerHand.get(0);
			player1.removeFromHand(p1);
			cardWonList.add(p1);
			Card p2 = player2.playerHand.get(0);
			player2.removeFromHand(p2);
			cardWonList.add(p2);
			
			System.out.print(player1.getName() + ": ");
			p1.printCard();
			System.out.print("  VS  ");
			System.out.print(player2.getName() + ": ");
			p2.printCard();
			
			System.out.println();
			
			checkBattle(p1, p2, cardWonList);		

			handCounter++;
			
		}
		
		
		if (player1.playerHand.isEmpty()) {
			System.out.println("In " +  handCounter + " moves, " + player2.getName() + " is the winner of WAR!!!");
			printWin();
		}
		else if (player2.playerHand.isEmpty()) {
			System.out.println("In " +  handCounter + " moves, " + player1.getName() + " is the winner of WAR!!!");
		}
		else {
			System.out.println("No one won after " + handCounter + " moves??");			
		}

		System.out.println("Out of the " +  handCounter + " moves, there were " + tieCounter + " tie battles.");
		printPlayersHands();
		System.out.println("");
	}
	
	public void checkBattle(Card card1, Card card2, List<Card> cardWonList) {
		
		if (card1.getRank().getWarValue() < card2.getRank().getWarValue()) {
			wonHand(player2, cardWonList, player1);
		}
		else if (card1.getRank().getWarValue() > card2.getRank().getWarValue()){
			wonHand(player1, cardWonList, player2);
		}
		else {
			tiedhand(cardWonList);
		}
	}
	
	
	
	public void wonHand(Player_O winner, List<Card> wonList, Player_O loser) {
		for (Card card : wonList) {
			winner.addToHand(card);
		}
		System.out.println("Winner of the hand:  " + winner.getName());
		
		wonList.clear();
		
		printPlayersHands();		
		
	}
	
	public void tiedhand(List<Card> cardList) {
		//  Incrementing the number of ties in a game.
		tieCounter++;
		
		System.out.println("*****  IT'S A TIE!  THE BATTLE HAS BEGUN!!  *****");
		try{

			Thread.sleep(1);
		}
		catch (InterruptedException e) {
			
		}
		
		if (player1.playerHand.size() == 0) {
			System.out.print("^^^^^^^^^^  " + player1.getName() + " forfeits due to lack of battle cards!  ^^^^^^^^^^");
			wonHand(player2, cardList, player1);
			
			return;
		}
		else if (player2.playerHand.size() == 0) {
			System.out.print("^^^^^^^^^^  " + player2.getName() + " forfeits due to lack of battle cards!  ^^^^^^^^^^");
			wonHand(player1, cardList, player2);
			
			return;
		}
		
		
		
		int numDown = 2;
		
		System.out.println("Player1 size: " + player1.playerHand.size());
		System.out.println("Player2 size: " + player2.playerHand.size());
		
		if ((player1.playerHand.size() > numDown) && (player2.playerHand.size() > numDown)) {
			for (int i = 0; i < numDown; i++) {
				cardList.add(player1.playerHand.remove(0));
				cardList.add(player2.playerHand.remove(0));
			}
		}
		
		Card card1 = player1.playerHand.remove(0);
		Card card2 = player2.playerHand.remove(0);
		cardList.add(card1);
		cardList.add(card2);
		
		checkBattle(card1, card2, cardList);
		
	}
	
	public void printWin() {

//		System.out.println("\n");
//		System.out.print(String_Letters.L0 + String_Letters.I0 + String_Letters.S0 + String_Letters.A0);
//		System.out.println("\n");
		
	}

}
