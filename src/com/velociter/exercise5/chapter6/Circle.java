package com.velociter.exercise5.chapter6;

public  class Circle extends Shape 
{
	
	private double center;
	private double radius;
	public Circle( double center, double radius) 
	{
		this.center=center;
		this.radius=radius;
	}
	
	public double getCenter() {
		return center;
	}

	public void setCenter(double center) {
		this.center = center;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void show()
	{
		System.out.println("Circle details center=" + center + ",radius=" + radius );
	}
	@Override
	public String toString() {
		return "Circle [center=" + center + ", radius=" + radius + "]";
	}
	
}
