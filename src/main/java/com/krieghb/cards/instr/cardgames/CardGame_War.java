package com.krieghb.cards.instr.cardgames;

import java.util.ArrayList;
import java.util.Collections;

import com.krieghb.cards.instr.Card;
import com.krieghb.cards.instr.Player;
import com.krieghb.cards.instr.dealers.NormalDealer;
import com.krieghb.constants.numbers.Number_Constants;


public class CardGame_War {
	
	private ArrayList<Player> playerList;
	
	private NormalDealer joeTheDealer;
	
	private Player player1;
	private Player player2;
	
	private int battleCounter = 0;
	private int tieCounter = 0;
	
	private int cardsPerPlayer = 10;
	
	
	
	
	public CardGame_War(ArrayList<Player> playerList) {
		
		joeTheDealer = new NormalDealer();
		
		setPlayerList(playerList);
		
		joeTheDealer.shuffle();
		
		dealHands();
		playWar();
		
	}
	
	
	
	public void setPlayerList(ArrayList<Player> playerList) {
			
		if (playerList.size() > 2) {
			System.err.println("Only two players can play WAR at the same time, only using first two in the list of players.");
			
		}
		else if (playerList.size() < 2) {
			System.err.println("Two players are needed to play WAR, only one was given, adding Frankadopolopolous to play against " + playerList.get(0).getPlayerName());
			playerList.add(new Player("Frankadopolopolous"));
		
		}
		
		else if (playerList.size() < 1) {
			System.err.println("Two players are needed to play WAR, none was given, adding Dopey and Frankadopolopolous to play against each other.");
			playerList.add(new Player("Dopey"));
			playerList.add(new Player("Frankadopolopolous"));
		
		}
		
		this.playerList = new ArrayList<Player>();
		this.playerList.add(playerList.get(0));
		this.playerList.add(playerList.get(1));
		
		this.player1 = this.playerList.get(0);
		this.player2 = this.playerList.get(1);
	}
	
	
	public void dealHands() {
		Card newCard;
		for (int cardI = 0; cardI < cardsPerPlayer; cardI++) {
			for (Player thisPlayer : playerList) {
				newCard = joeTheDealer.dealCard();
				if (!(newCard == null)) {
					thisPlayer.getACard(newCard);
				}
				else {
					System.out.println("Error getting card during dealing of hands, ran out of cards");
				}
				
			}
		}
	}
	
	
	
	public void playWar() {
		// Resetting hand counters
		tieCounter = 0;
		battleCounter = 0;
		int maxRounds = Number_Constants.MAX_WAR_ROUNDS;
		
		ArrayList<Card> currentWinList = new ArrayList<Card>();
		
		Card p1, p2;
		
		//  Showing beginning hands
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
		} 
		catch (InterruptedException e) {
		}
		
		while ( (!player1.isHandEmpty()) && (!player2.isHandEmpty()) && (battleCounter < maxRounds)) {

			System.out.println("\n");
			
			p1 = player1.foldACard();
			currentWinList.add(p1);
			p2 = player2.foldACard();
			currentWinList.add(p2);
			
			System.out.print(player1.getPlayerName() + ": ");
			p1.printCard();
			System.out.print("  VS  ");
			System.out.print(player2.getPlayerName() + ": ");
			p2.printCard();
			
			System.out.println();	
			
			checkBattle(p1, p2, currentWinList);		

			battleCounter++;
		}
		
		if (player1.isHandEmpty()) {
			System.out.println("In " +  battleCounter + " moves, " + player2.getPlayerName() + " is the winner of WAR!!!");
			printWin();
		}
		else if (player2.isHandEmpty()) {
			System.out.println("In " +  battleCounter + " moves, " + player1.getPlayerName() + " is the winner of WAR!!!");
		}
		else {
			System.out.println("No one won after " + battleCounter + " moves??");			
		}		
		
		System.out.println("Out of the " +  battleCounter + " moves, there were " + tieCounter + " tie battles.");
//		printPlayersHands();
		System.out.println("");
		
		
	}
	
	public void checkBattle(Card card1, Card card2, ArrayList<Card> cardWonList) {
		if (card1.getRank().getRank() < card2.getRank().getRank()) {
			wonHand(player2, cardWonList, player1);
		
		}
		else if (card1.getRank().getRank() > card2.getRank().getRank()){
			wonHand(player1, cardWonList, player2);
		}
		else {
			tiedhand(cardWonList);
		}
	}
	
	public void wonHand(Player winner, ArrayList<Card> wonList, Player loser) {
		
		//  Mixing up order that winning cards get put back in player's hands
		Collections.shuffle(wonList);
		
		for (Card card : wonList) {
			winner.getACard(card);
		}
		System.out.println("Winner of the hand:  " + winner.getPlayerName());
		
		wonList.clear();
		
		printPlayersHands();		
		
	}
	
	
	public void tiedhand(ArrayList<Card> cardList) {
		tieCounter++;
		
		System.out.println("*****  IT'S A TIE!  THE BATTLE HAS BEGUN!!  *****");
		try{

			Thread.sleep(1);
		}
		catch (InterruptedException e) {
			
		}
		
		
		//  Checking that the players have enough to battle, if not they forfeit.
		if (player1.isHandEmpty()) {
			System.out.print("^^^^^^^^^^  " + player1.getPlayerName() + " forfeits due to lack of battle cards!  ^^^^^^^^^^");
			wonHand(player2, cardList, player1);
			return;
		}
		else if (player2.isHandEmpty()) {
			System.out.print("^^^^^^^^^^  " + player2.getPlayerName() + " forfeits due to lack of battle cards!  ^^^^^^^^^^");
			wonHand(player1, cardList, player2);
			return;
		}
		
		//  Number of card to put face down before war cards.
		int numDown = Number_Constants.NUMBER_CARDS_DOWN;
		if ( (player1.getCardCount() > numDown) && (player2.getCardCount() > numDown) ) {
			for (int i = 0; i < numDown; i++) {
				cardList.add(player1.foldACard());
				cardList.add(player2.foldACard());
			}
		}
		
		Card card1 = player1.foldACard();
		Card card2 = player2.foldACard();
		cardList.add(card1);
		cardList.add(card2);
		
		checkBattle(card1, card2, cardList);
		
		
	}
	
	
	public void printWin() {
		
	}

	public void printPlayersHands() {
		System.out.println("\n****************************************************************************************************");
		
		for (Player player : playerList) {
			System.out.println("****************************************************************************************************");
			player.showHands();
			System.out.println("\n****************************************************************************************************");
		}
		System.out.println("****************************************************************************************************");
	}

	
	public void foldAllHands() {
		for (Player thisPlayer : playerList) {
			thisPlayer.foldHand();
		}
	}

}
