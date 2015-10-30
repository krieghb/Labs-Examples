package com.krieghb.main;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import com.krieghb.constants.enums.Letters;


public class DeckMain {
	
	
	
	public static void main(String[] args) {
		
		
		String disp = "Lisa";
		
		disp = getLetterBox("Lisa");
		
		System.out.print(disp);
		

//		int numOfCards = 5;
//		int numOfPlayers = 4;
//		
//		List<Player_O> players = new ArrayList<Player_O>();
//		
//		Deck newDeck = new Deck();
//		
//		
//		System.out.print("Printing ParentDeckOfCards:");
//		newDeck.printOrderedDeck();
//		
//		
//		
////		//  Creating list of players
////		for (int playerI = 0; playerI < numOfPlayers; playerI++) {
////			Player_O newPlayer = new Player_O();
////			players.add(newPlayer);
////		}
//		
//		
//		Player_O newPlayer1 = new Player_O("Doug");
//		Player_O newPlayer2 = new Player_O("Lisa");
//		Player_O newPlayer3 = new Player_O("Frankadoladopolous");
//		Player_O newPlayer4 = new Player_O("Pat");
//		
//		players.add(new Player_O("Doug"));
//		players.add(new Player_O("Lisa"));
//		players.add(new Player_O("Frankadoladopolous"));
//		players.add(new Player_O("Pat"));
//		
//		
//		
//		//  Dealing cards to the players
//		dealHands(players, newDeck, numOfCards);
//		
//		//  Printing out the players current hands.
//		printPlayersHands(players);		
//		
//		//  Folding hands and getting new cards;
//		foldAllHands(players);
//		
//		
//		
//		System.out.print("\n\n*****     Faulty deal, the dealer has been sacked.     *****\n");
//		System.out.print("*****      Here comes the new deal.     *****\n\n\n\n");
//		
//		// Shuffling and getting new deck.
//		newDeck.newDeckStack();
//		
//		//  Dealing cards to the players
//		dealHands(players, newDeck, numOfCards);
//		
//		//  Printing out the players current hands.
//		printPlayersHands(players);	
//	
	}
	
	
	
	
	public static String getLetterBox(String name) {
		String returnLetter = "";
		List<String[]> letters = new ArrayList<String[]>();
		char letter;
		
		for (int index = 0; index < name.length(); index++) {
			
			letter = name.charAt(index);
			
			switch (letter) {
			
			case 'a':	letters.add(Letters.Letter_A);
						break;
						
			case 'i':	
			case 'I':
						letters.add(Letters.Letter_I);
									break;
									
			case 'l':	
			case 'L':
						letters.add(Letters.Letter_L);
									break;									
			case 's':	
			case 'S':
						letters.add(Letters.Letter_S);
									break;
			
						
			default: 	
						break;

			}
			
		}
		
		
		for (int i = 0; i < Letters.Letter_L.length; i++) {
			for (int i2 = 0; i2 < letters.size(); i2++) {
				
				returnLetter += letters.get(i2)[i];
				
			}
			returnLetter += "\n";
		}
		
		
		
		return returnLetter;
	}
	
	
	public static void dealHands(List<Player> playerList, Deck deck, int numOfCards) {
		
		for (int cardI = 0; cardI < numOfCards; cardI++) {
			for (Player thisPlayer : playerList) {
				
				thisPlayer.addToHand(deck.getACard());
				
			}
		}
		
	}
	
	public static void printPlayersHands(List<Player> playerList) {
		for (Player thisPlayer : playerList) {
			
			thisPlayer.printHand();
			System.out.println("\n");
			
		} 
	}
	
	public static void foldAllHands(List<Player> playerList) {
		for (Player thisPlayer : playerList) {
			thisPlayer.foldHand();
		}
		
	}

}

