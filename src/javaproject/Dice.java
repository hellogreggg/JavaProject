package javaproject;

public class Dice {
	
	
	public int showUser() {
		
		int number = throwDiece();
		
		return number;
	}
	

	public int throwDiece() {
		
		int dieceThrow = (int)(Math.random() * 6 + 1);
		
		return dieceThrow;
	}
}
