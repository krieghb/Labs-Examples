package com.krieghb.cards;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import com.krieghb.constants.enums.Rank;
import com.krieghb.constants.enums.Suit;

public class PinochleDeck extends ParentDeckOfCards {
	
	public PinochleDeck() {
		this.instantiateCardList();
	}

	
	public List<Card> instantiateCardList() {
		numberOfDecks = 2;
		cardsPerDeck = 24;
		
		return this.instantiateCardList(numberOfDecks, cardsPerDeck);
	}
	
	public List<Card> instantiateCardList(int numOfDecks) {
		
		return instantiateCardList(numOfDecks, 52);
		
	}
	
	
	
	public List<Card> instantiateCardList(int numOfDecks, int cardsPerDeck) {
		this.numberOfDecks = numOfDecks;
		this.cardsPerDeck = cardsPerDeck;
		this.cardsLeft = numOfDecks * cardsPerDeck;
		
		orderedCardList = new ArrayList<Card>(cardsLeft);
		
		for (int i = 0; i < numOfDecks; i++) {
			//  Instantiating list of all 52 cards
			for (Suit s: Suit.values()) {
				for (Rank r : Rank.values()) {
					if (r.getBasicRank() < 9) {
						continue;
					}
					Card newCard = new Card(s, r);
					orderedCardList.add(newCard);
				}
			}
		}
		
		cardList = new ArrayList<Card>(orderedCardList);
		
		stackOfCards = new Stack<Card>();
		
		for (Card oneCard : cardList) {
			stackOfCards.push(oneCard);
		}
		
		return cardList;
		
	}
	
	public List<Card> getCardList() {
		return this.cardList;
	}
	
}
