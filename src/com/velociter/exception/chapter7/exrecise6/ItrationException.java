package com.velociter.exception.chapter7.exrecise6;

public class ItrationException {

		public static void main(String[] args) {
			int j =  (int)(3*Math.random());
			try {
			System.out.println("Try block entered.");
			for(int i=10 ;i>=-1 ; i--) {
			System.out.println("Loop entered " + "i = "+ i + " j = "+j);
			System.out.println(i/j); // Divide by 0 - exception thrown
			}
			System.out.println("Ending try block");
			} catch(ArithmeticException e) { // Catch the exception
			System.out.println("Arithmetic exception caught");
			}
			finally {
				int i=0;
			System.out.println(" to ready reassine ");
			

	}

		}
		}
