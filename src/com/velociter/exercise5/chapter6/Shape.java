package com.velociter.exercise5.chapter6;

public abstract class Shape {
	private double xPos;
	private double yPos;
	// default-argument constructor
	
	Shape ()
	{
	xPos=0;
	yPos=0;
	}
	// A constructor to assign values to xpos & yPos
	// int x position and y position
	
	Shape (double x, double y)
	{
	xPos=x;
	yPos=y;
	}
// get the xPos
	//return int xPos
	
	public final double getxPos() {
		return xPos;
	}
	
	final double getyPos() {
	//final: cannot override the method in the derive
		return yPos;
	}
	public void moveTo(double x, double y)
	{
	xPos = x;
	yPos = y;
	}
	public String toString()
	{ return "x = " + xPos + " y= " + yPos;
	}
	public abstract void show();
	}


	