package com.krieghb.constants.enums;



public enum Suit {
	
	SPADES("Spades", Color.BLACK),
	CLUBS("Clubs", Color.BLACK),
	DIAMONDS("Diamonds", Color.RED),
	HEARTS("Hearts", Color.RED);
	
	
	private final String suit;
	private final Color color;
	
	private Suit(String suit, Color color) {
		
		this.suit = suit;
		this.color = color;
		
	}
	
	public String getSuit() {
		return this.suit;
	}

	
	public String getColorStr() {
		return this.color.getColor();
	}
	
	public void printSuit() {
		
		System.out.print("Suit:  " + this.suit);
	
	}
	
	public Suit createRandomSuit() {
		return values()[(int) (Math.random() * values().length)];
	}
	
	
	

}
