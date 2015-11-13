package com.krieghb.cards.instr.constants;

public enum Rank {
	TWO		(2, "Two", 2, 2),
	THREE	(3, "Three", 3, 3),
	FOUR	(4, "Four", 4, 4),
	FIVE	(5, "Five", 5, 5),
	SIX		(6, "Six", 6, 6),
	SEVEN	(7, "Seven",7 , 7),
	EIGHT	(8, "Eight", 8, 8),
	NINE	(9, "Nine", 9, 9),
	TEN		(10, "Ten", 10, 10),
	JACK	(11, "Jack", 10, 10),
	QUEEN	(12, "Queen", 10, 10),
	KING	(13, "King", 10, 10),
	ACE		(14, "Ace", 1, 11);
	
	

	private final int rank;
	private final String cardName;
	private final int mainRank;
	private final int secondRank;
	
	private Rank (int rank, String cardName, int mainRank, int secondRank) {
		this.rank = rank;
		this.cardName = cardName;
		this.mainRank = mainRank;
		this.secondRank = secondRank;
	}
	
	public int getRank() {
		return this.rank;
	}
	
	public String getCardName() {
		return this.cardName;
	}
	
	public int getMainRank() {
		return this.mainRank;
	}
	
	public int getSecondRank() {
		return this.secondRank;
	}

}
