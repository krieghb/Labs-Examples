package com.krieghb.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Player {
	
	String playerName;
	List<Card> playerHand;
	
	/**
	 * Default Constructor, creates a name("Bob"), and a blank array list.
	 */
	public Player() {
		playerName = "Bob";
		playerHand = new ArrayList<Card>();
	}
	
	/**
	 * Basic Constructor with a given hand.
	 * @param hand
	 */
	public Player(List<Card> hand) {
		playerName = "Larry";
		playerHand = new ArrayList<Card>(hand);
	}
	
	/**
	 * Basic Constructor with a given hand and a name.
	 * @param name
	 * @param hand
	 */
	public Player(String name, List<Card> hand) {
		playerName = name;
		playerHand = new ArrayList<Card>(hand);
	}
	
	/**
	 * Basic Constructor with just a name.
	 * @param name
	 */
	public Player(String name) {
		playerName = name;
		playerHand = new ArrayList<Card>();
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
	}
	
	/**
	 * Method to remove a specified card from the player's hand
	 * @param oldCard
	 */
	public void removeFromHand(Card oldCard) {
		playerHand.remove(oldCard);
	}
	
	public void removeFromHand() {
		playerHand.remove(0);
	}
	
	
	/**
	 *   Method to clear the hand.
	 */
	public void foldHand() {
		playerHand.clear();
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
