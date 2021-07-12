package com.velociter.exercise.chapter2;

public class DisplayPart {

	public static void main(String[] args){
		double MyNumber=1234.5678;
		long intgrelPart=0;
		short frctnPart=0;
		int decPlaces=4;
		intgrelPart = (long)MyNumber;
		//
		frctnPart = (short)((MyNumber - intgrelPart)*Math.pow(10, decPlaces));
		 System.out.println("The integral part of " + MyNumber + " is " + intgrelPart);
		 System.out.println("The fractional part to " + decPlaces + " decimal places is " + frctnPart);
		 
}
}
//Write a console program to declare and initialize a double variable;
// with some value such as 1234.5678. Retrieve the integral part of the;
//value and store it in a variable of type long, and retrieve the first
//four digits of the fractional part and store them in an integer of
//type short.Display the value of the double variable by outputting
//the two values stored as integers 