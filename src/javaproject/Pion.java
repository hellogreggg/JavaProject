package javaproject;

import java.awt.Color;

public class Pion {
	
	private int hoogte;
	private int breedte;
	private Color kleur;
	private int[][] positie = new int[11][11];
	
	public void setHoogte(int hoogte) {
		this.hoogte = hoogte;	
	}
	
	public int getHoogte() {
		return hoogte;
	}
	
	
	public void setBreedte(int breedte) {
		this.breedte = breedte;
	}
	
	public int getBreedte() {
		return breedte;
	}
	
	
	public void setKleur(Color kleur) {
		this.kleur = kleur;
	}
	
	public Color getKleur() {
		return kleur;
	}
	
	public int[][] getPositie() {
		return positie;
	}

	public void setPositie(int[][] positie) {
		this.positie = positie;
	}

	
	// constructor
	public Pion() {}
	
	
	public Pion(int h, int b, Color k, int[][] p) {
		hoogte = h;
		breedte = b;
		kleur = k;
		positie = p;
	}	
}
