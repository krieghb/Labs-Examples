package com.krieghb.cards.instr;

import com.krieghb.cards.instr.constants.Rank;
import com.krieghb.cards.instr.constants.Suit;

public class Card {
	
	private Rank rank;
	private Suit suit;
	
//	private enum Rank {
//		TWO		(2),
//		THREE	(3),
//		FOUR	(4),
//		FIVE	(5),
//		SIX		(6),
//		SEVEN	(7),
//		EIGHT	(8),
//		NINE	(9),
//		TEN		(10),
//		JACK	(11),
//		QUEEN	(12),
//		KING	(13),
//		ACE		(14);
//		
//		
//	
//		private final int rank;
//		
//		private Rank (int rank) {
//			this.rank = rank;
//		}
//		
//		public int getRank() {
//			return this.rank;
//		}
//	}
//	
//	
//	private enum Suit {
//		SPADES		("Spades"),
//		CLUBS		("Clubs"),	
//		HEARTS		("Hearts"),
//		DIAMONDS	("Diamonds");
//		
//		private final String suit;
//		
//		private Suit (String suit) {
//			this.suit = suit;
//		}
//		
//		public String getSuitString() {
//			return this.suit;
//		}
//		
//	}
	
	public Card (Rank value, Suit suit) {
		setRank(value);
		setSuit(suit);
	}
	
	public void setRank(Rank rank) {
		this.rank = rank;
	}
	public Rank getRank() {
		return this.rank;
	}
	
	public void setSuit(Suit suit) {
		this.suit = suit;
	}
	public Suit getSuit() {
		return this.suit;
	}
	
	public void printCard() {
		
		System.out.print(getRank().getCardName() + " of " + getSuit().getSuitString());
		
	}
	
	public String getCardString() {
		StringBuilder myCard = new StringBuilder();
		myCard.append(getRank().getCardName());
		myCard.append(" of ");
		myCard.append(getSuit().getSuitString());
				
		return myCard.toString();
	}

}
