package com.krieghb.cards.instr.constants;

public enum Rank {
	TWO		(2, "Two"),
	THREE	(3, "Three"),
	FOUR	(4, "Four"),
	FIVE	(5, "Five"),
	SIX		(6, "Six"),
	SEVEN	(7, "Seven"),
	EIGHT	(8, "Eight"),
	NINE	(9, "Nine"),
	TEN		(10, "Ten"),
	JACK	(11, "Jack"),
	QUEEN	(12, "Queen"),
	KING	(13, "King"),
	ACE		(14, "Ace");
	
	

	private final int rank;
	private final String cardName;
	
	private Rank (int rank, String cardName) {
		this.rank = rank;
		this.cardName = cardName;
	}
	
	public int getRank() {
		return this.rank;
	}
	
	public String getCardName() {
		return this.cardName;
	}

}
