package javaproject;

public class Player {
	
	public String name;
	public Pion pion;
	public int score;
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	
	public Player(String name, Pion pion, int score) {
		this.name = name;
		this.pion = pion;
		this.score = score;
	}
}
