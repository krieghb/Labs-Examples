package com.krieghb.main;

import java.util.ArrayList;
import java.util.List;

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
		
		System.out.println(playerName + " has the following hand: ");
		
		for (Card playerCard : playerHand) {
			playerCard.printCard();
			System.out.print(",  ");
		}
	}
	
	
	public void orderHand() {
		
	}
	
	

}
