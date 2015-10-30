package com.krieghb.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class Player_O {
	
	String playerName;
	ArrayList<Card> playerHand;
	private int cardCount;
	
	/**
	 * Default Constructor, creates a name("Bob"), and a blank array list.
	 */
	public Player_O() {
		this("Bob", new ArrayList<Card>());
	}
	
	/**
	 * Basic Constructor with a given hand.
	 * @param hand
	 */
	public Player_O(ArrayList<Card> hand) {
		this("Larry", hand);
	}
	
	/**
	 * Basic Constructor with just a name.
	 * @param name
	 */
	public Player_O(String name) {
		this(name, new ArrayList<Card>());
	}
	
	/**
	 * Basic Constructor with a given hand and a name.
	 * @param name
	 * @param hand
	 */
	public Player_O(String name, ArrayList<Card> hand) {
		setName(name);
		setHand(hand);
	}
	
	private void setName(String name) {
		this.playerName = name;
	}
	
	private void setHand(ArrayList<Card> hand) {
		this.playerHand = new ArrayList<Card>(hand);
		cardCount = playerHand.size();
	}

		
	public String getName() {
		return playerName;
	}
	
	/**
	 *  Method to add a card to the player's hand.
	 * @param newCard
	 */
	public void addToHand(Card newCard) {
		playerHand.add(newCard);
		cardCount++;
	}
	
	public void removeFromHand() {
		removeFromHand(playerHand.get(0));
	}
	
	/**
	 * Method to remove a specified card from the player's hand
	 * @param oldCard
	 */
	public void removeFromHand(Card oldCard) {
		playerHand.remove(oldCard);
		cardCount--;
	}
	
	
	/**
	 *   Method to clear the hand.
	 */
	public void foldHand() {
		playerHand.clear();
		cardCount = 0;
	}
	
	public int getCardCount() {
		return cardCount;
	}
	
	
	public boolean isHandEmpty() {
		return cardCount == 0;
	}
	
	/**
	 *   Method to print a semi-organized view of the player's hand.
	 */
	public void printHand() {
		int counter = 0;
		
		System.out.println(playerName + " has the following hand: ");
		
		ListIterator<Card> it = playerHand.listIterator();
		Card playerCard;
		if (it.hasNext()) {
			playerCard = it.next();
			playerCard.printCard();
		}
		while (it.hasNext()) {
			counter++;
			
			playerCard = it.next();
			System.out.print(", ");
			
			if (counter % 5 == 0) {
				System.out.print("\n");
			}
			
			playerCard.printCard();
			
		}
		
		System.out.println("");
	}
	
	
	public void orderHand() {
		Collections.sort(playerHand);
	}
	
	

}
