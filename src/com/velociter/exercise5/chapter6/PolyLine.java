package com.velociter.exercise5.chapter6;

import java.util.LinkedList;

public class PolyLine {
	public PolyLine(double[][] coords) {
		// TODO Auto-generated constructor stub
	}
	public PolyLine(Point[] points) {
		// TODO Auto-generated constructor stub
	}
	// Construct a polyline from an array of coordinate pairs
	public void PolyLine(double[][] coords) {
	Point[] points = new Point[coords.length]; // Array to hold points
	// Create points from the coordinates
	for(int i = 0; i < coords.length ; i++) {
	points[i] = new Point(coords[i][0], coords[i][1]);
	}
	// Create the polyline from the array of points
	polyline = new LinkedList<Point>(); // Create list of Point objects 
	}
	// Construct a polyline from an array of points
	public void PolyLine(Point[] points) {
	polyline = new LinkedList<Point>(); // Create list of Point objects
	}
	// Add a Point object to the list
	public void addPoint(Point point) {
	polyline.add(point); // Add the point to the list
	}
	// Add a point from a coordinate pair to the list
	public void addPoint(double x, double y) {
	polyline.add(new Point(x, y)); // Add the point to the list
	}
	// String representation of a polyline
	public String toString() {
	StringBuffer str = new StringBuffer("Polyline:");
	Point point = (Point) polyline.getFirst(); 
	// Set the 1st point as start
	while(point != null) {
	str.append(" ("+ point+ ")"); // Append the current point
	point = (Point)polyline.getFirst(); // Make the next point current
	}
	return str.toString();
	}
	private LinkedList<Point> polyline;
	public static void main(String[] args) {
		// Create an array of coordinate pairs
		double[][] coords = { {1., 1.}, {1., 2.}, { 2., 3.},
		{-3., 5.}, {-5., 1.}, {0., 0.} };
		// Create a polyline from the coordinates and display it
		PolyLine polygon = new PolyLine(coords);
		System.out.println(polygon);
		// Add a point and display the polyline again
		polygon.addPoint(10., 10.);
		System.out.println(polygon);
		// Create Point objects from the coordinate array
		Point[] points = new Point[coords.length];
		for(int i = 0; i < points.length; i++) {
		points[i] = new Point(coords[i][0],coords[i][1]);
		}
		// Use the points to create a new polyline and display it
		PolyLine newPoly = new PolyLine(points);
		System.out.println(newPoly);// The linked list of point

}
}
