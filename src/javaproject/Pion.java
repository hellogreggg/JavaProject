package javaproject;

import java.awt.Color;

public class Pion {
	
	private int hoogte;
	private int breedte;
	private Color kleur;
	
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
	
	// constructor
	public Pion(int h, int b, Color k) {
		hoogte = h;
		breedte = b;
		kleur = k;
	}
	
}
