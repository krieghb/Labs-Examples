package com.krieghb.constants.enums;

public enum Color {
	
	BLACK("Black"),
	RED("Red");
	
	private final String color;
	
	private Color(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return this.color;
	}

}
