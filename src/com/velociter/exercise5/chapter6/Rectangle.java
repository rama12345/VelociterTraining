package com.velociter.exercise5.chapter6;

public  class Rectangle extends Shape {
	private double x1;
	private double x2;
	private double y1;
	private double y2;
	public Rectangle(double x1,double x2,double y1,double y2) {
		this.x1=x1;
	    this.x2=x2;
		this.y1=y1;
		this.y2=y2;
		
	}
	@Override
	public void show() {
		System.out.println("x co- ordinate  "+x1+" , "+y1);
		System.out.println("y co-ordinate  "+x2+" , "+y2);
	}
	@Override
	public String toString() {
		return "Rectangle [x1=" + x1 + ", x2=" + x2 + ", y1=" + y1 + ", y2=" + y2 + "]";
	}
		

}

