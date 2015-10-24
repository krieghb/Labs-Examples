package com.krieghb.cards.instr.constants;

public enum Suit {
	SPADES		("Spades"),
	CLUBS		("Clubs"),	
	HEARTS		("Hearts"),
	DIAMONDS	("Diamonds");
	
	private final String suit;
	
	private Suit (String suit) {
		this.suit = suit;
	}
	
	public String getSuitString() {
		return this.suit;
	}

}
