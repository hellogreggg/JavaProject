package javaproject;

public class PlayField {
	
	int Score;
	
	Dice diece = new Dice();
	
	public void NumberOfPlayers(int numberOfPlayers) {
		
		switch(numberOfPlayers) {
		
		case 2:
		
			Pion player1 = new Pion();
			Pion player2 = new Pion();
			
			break;
		
		case 3:
			
			Pion player01 = new Pion();
			Pion player02 = new Pion();
			Pion player03 = new Pion();
			
			break;
		
		case 4:
			
			Pion player001 = new Pion();
			Pion player002 = new Pion();
			Pion player003 = new Pion();
			Pion player004 = new Pion();
			
			break;
		}	
	}
}
