package com.velociter.exercise.chapter15;

import java.util.Arrays;

public class ArrayMethod {

	public static void main(String[] args) {
			      // initializing char array
			      char array[] = new char[] {'a','b','c'};

			      // let us print the values
			      System.out.println("Actual values: ");
			      for (char value : array) {
			         System.out.println("Value = " + value);
			      }

			      // using fill for placing z
			      Arrays.fill(array, 'z');

			      // let us print the values
			      System.out.println("New values after using fill() method: ");
			      for (char value : array) {
			         System.out.println("Value = " + value);
			      }
		// TODO Auto-generated method stub

	}

}
