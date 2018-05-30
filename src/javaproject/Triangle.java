package javaproject;

public class Triangle extends Shape {
	
	private int sideA;
	private int sideB;
	private int sideC;

	public Triangle(int sideA, int sideB, int sideC) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}

	@Override
	public double getOmtrek() {
		double s = (sideA + sideB + sideC) / 2;
	    
	return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
	}

	@Override
	public double getOppervlakte() {

		return sideA + sideB + sideC;
	}

}
