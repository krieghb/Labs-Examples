package com.krieghb.constants.enums;

public enum Rank {
	
	ACE("Ace", 14, 1, 11, 13),
	TWO("Two", 2, 2, 2, 1),
	THREE("Three", 3, 3, 3, 2),
	FOUR("Four", 4, 4, 4, 3),
	FIVE("Five", 5, 5, 5, 4),
	SIX("Six", 6, 6, 6, 5),
	SEVEN("Seven", 7, 7, 7, 6),
	EIGHT("Eight", 8, 8, 8, 7),
	NINE("Nine", 9, 9, 9, 8),
	TEN("Ten", 10, 10, 10, 9),
	JACK("Jack", 11, 10, 10, 10),
	QUEEN("Queen", 12, 10, 10, 11),
	KING("King", 13, 10, 10, 12);
	
	private final String cardString;
	private final int basicRank;
	private final int lowAceValue;
	private final int hiAceValue;
	private final int warValue;
	
	
	private Rank (String cardString, int basicRank, int lowAceValue, int hiAceValue, int warValue) {
	
		this.cardString = cardString;
		this.basicRank = basicRank;
		this.lowAceValue = lowAceValue;
		this.hiAceValue = hiAceValue;
		this.warValue = warValue;
		
	}
	
	
	public String getCardString() {
		return this.cardString;
	}
	
	public int getBasicRank() {
		return this.basicRank;
		
	}
	
	public int getLowAceValue() {
		return this.lowAceValue;
		
	}
	
	public int getHiAceValue() {
		return this.hiAceValue;
		
	}
	
	public int getWarValue() {
		return this.warValue;
	}

}
