package com.krieghb.cards.instr;

import java.util.ArrayList;

import com.krieghb.utilities.Utilities;

public class Player {
	
	protected ArrayList<Card> playerHand;
	protected String playerName;
	protected int cardCount;
	protected int handValue;
	
	
	public Player() {
		this("Frankadolopolous");
	}
	
	public Player(ArrayList<Card> hand) {
		this("Frankadolopolous", hand);
	}
	
	public Player(String playerName) {
		this(playerName, new ArrayList<Card>(5));
	}
	
	public Player(String playerName, ArrayList<Card> playerHand) {
		setName(playerName);
		setHand(playerHand);
		handValue = 0;
	}
	
	
	protected void setHand(ArrayList<Card> hand) {
		this.playerHand = new ArrayList<Card>(hand);
		cardCount = playerHand.size();
	}
	protected void setName(String name) {
		this.playerName = name;
	}
	public String getPlayerName() {
		return this.playerName;
	}
	
	public ArrayList<Card> getPlayerHand() {
		return (ArrayList<Card>) this.playerHand;
	}
	
	
	/**
	 *  Method to add a card to the player's hand.
	 * @param newCard
	 */
	public void getACard(Card card) {
		playerHand.add(card);
		cardCount++;
		handValue += card.getRank().getSecondRank();
	}
	/**
	 * Method to remove a card from the player's hand
	 * @param oldCard
	 */
	public Card foldACard() {
		return foldACard(0);
	}
	/**
	 * Method to remove a specified card from the player's hand
	 * @param oldCard
	 */
	public Card foldACard(int index) {
		Card byeCard = playerHand.remove(index);
		cardCount--;
		
		handValue -= byeCard.getRank().getSecondRank();
		
		return byeCard;
	}
	/**
	 *   Method to clear the hand.
	 */
	public void foldHand() {
		playerHand.clear();
		cardCount = 0;
		handValue = 0;
	}
	
	/**
	 *   Method to get the size of the player's hand
	 */
	public int getCardCount() {
		return cardCount;
	}
	
	public boolean isHandEmpty() {
		return (cardCount == 0);
	}
	
	/**
	 *   Method to print a semi-organized view of the player's hand.
	 */
	public String getHands() {
		StringBuilder playerOut = new StringBuilder();		
		StringBuilder oneCard = new StringBuilder();
		int dispCounter = 0;
		
		
		playerOut.append(getPlayerName() + " has the following cards:\n");
		
		if (isHandEmpty()) {
			playerOut.append("Empty Hand.");
		}
		
		
		for (int i = 0; i < cardCount; i++) {
			if ((dispCounter % 5 == 0) && !(dispCounter == 0)) {
				playerOut.append("\n");
			}

			dispCounter++;
			
			oneCard = Utilities.setSBWidth(new StringBuilder(playerHand.get(i).getCardString()), 20);
			
			playerOut.append(oneCard);
		}
		
		playerOut.append("\n");
		
		return playerOut.toString();
	}
	
	public void showHands() {
		
		System.out.print(getHands() + "\n");
		
//		if (isHandEmpty()) {
//			System.out.println("No cards.");
//		}
//		else {
//
//			playerHand.get(0).getCardString();
//		}
		
		
	}

}
