package com.krieghb.cards.instr;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	private List<Card> playerHand;
	private String playerName;
	
	public Player() {
		this("Frankadolopolous");
	}
	
	public Player(String playerName) {
		this(playerName, new ArrayList<Card>(5));
	}
	
	public Player(String playerName, ArrayList<Card> playerHand) {
		setName(playerName);
		
		this.playerHand = new ArrayList<Card> (playerHand);
	}
	
	
	
	private void setName(String name) {
		this.playerName = name;
	}
	public String getPlayerName() {
		return this.playerName;
	}
	
	public ArrayList<Card> getPlayerHand() {
		return (ArrayList<Card>) this.playerHand;
	}
	
	public void getACard(Card card) {
		playerHand.add(card);
	}

	public void foldACard() {
		foldACard(0);
	}
	
	public void foldACard(int index) {
		playerHand.remove(index);
	}
	
	public String getHands() {
		StringBuilder playerOut = new StringBuilder();
		
		playerOut.append(getPlayerName() + " has the following hands:\n");
		for (int i = 0; i < playerHand.size(); i++) {
			playerOut.append(playerHand.get(i).getCardString());
			playerOut.append("\t");
		}
		
		playerOut.append("\n");
		
		return playerOut.toString();
	}
	
	public void showHands() {
		
		System.out.print(getHands() + "\n");
		
		playerHand.get(0).getCardString();
		
	}
	

}
