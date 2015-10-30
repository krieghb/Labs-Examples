package com.krieghb.cards.instr.abstracts;

import java.util.ArrayList;

import com.krieghb.cards.Player_O;

public class CardGame {
	
	ArrayList<Player_O> playerList = new ArrayList<Player_O>();
	
	public void foldAllHands() {
		for (Player_O thisPlayer : playerList) {
			thisPlayer.foldHand();
		}
	}

}
