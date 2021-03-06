package com.krieghb.cards;

import com.krieghb.constants.enums.Rank;
import com.krieghb.constants.enums.Suit;

@SuppressWarnings("rawtypes")
public class Card implements Comparable {
	
	private Suit suit;
	private Rank rank;
	private int warValue;
	
	public Card() {
		
	}
	
	public Card(Suit suit, Rank rank) {
		this.suit = suit;
		this.rank = rank;
		this.warValue = rank.getWarValue();
	}
	
	
	public Suit getSuit() {
		return suit;
	}
	public void setSuit(Suit suit) {
		this.suit = suit;
	}
	public Rank getRank() {
		return rank;
	}
	public void setRank(Rank rank) {
		this.rank = rank;
		this.warValue = rank.getWarValue();
	}
	
	
	public void createRandomCard() {		
		setSuit(Suit.values()[(int) (Math.random() * Suit.values().length)]);
		setRank(Rank.values()[(int) (Math.random() * Rank.values().length)]);
		
	}
	
	public void createCard(Suit suit, Rank rank) {
		
		setSuit(suit);
		setRank(rank);
		
	}
	
	
	public void printFullCard() {
		System.out.printf("%9s:  %-7s %8s    %9s:  %-8s %5s\n" , 
				"Card Suit", suit, "(" + suit.getColorStr() + ")", 
				"Card Rank", rank, "(" + rank.getLowAceValue() + ")");
		
	}
	
	public void printCard() {
		System.out.print(rank.getCardString() + " of " + suit.getSuit());
	}
	
	public String cardString() {
		return rank.getCardString() + " of " + suit.getSuit();
	}

	public int compareTo(Object compareCard) {
		
		int compareValue = ((Card) compareCard).getRank().getWarValue();
		
		return this.warValue - compareValue;
		
	}


	
	

}
