package javaproject;

public class Circle extends Shape {
	
	private double radius;
	private double pi = Math.PI;


	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double getOmtrek() {
		return pi * Math.pow(radius, 2);
	}

	@Override
	public double getOppervlakte() {
		return 2 * pi * radius;
	}
	
	
	
	
	
	

}
