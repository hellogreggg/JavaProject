package javaproject;

public class Hexagon extends Shape {

	private double distance;
	private int side;
	
	
	public Hexagon(double distance, int side) {
		this.distance = distance;
		this.side = side;
	}

	@Override
	public double getOmtrek() {
		return distance * side;
	}

	@Override
	public double getOppervlakte() {
		double area = (side * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / side));
		return area;
	}

}
