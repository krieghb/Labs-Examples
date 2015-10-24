package com.krieghb.main;

public class LabExamples {
	
	
	public enum Money {
		
		QUARTER("Washington", 25),
		DIME("Roosevelt", 10),
		NICKEL("Jefferson", 5),
		PENNY("Lincoln", 1);
		
		private final String president;
		private final int amount;
		
		private Money(String pres, int amount) {
			
			this.president = pres;
			this.amount = amount;
			
		}
		
		public String getDesc() {
			return this.president;
		}
		
		public int getAmount() {
			return this.amount;
		}
		
	}
	
	public static void main (String[] args) {
		System.out.println("HI");
		

		
	}
	
	

	
	

}
