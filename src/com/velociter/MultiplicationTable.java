package com.velociter.variable;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int z=100;
		Scanner input = new Scanner(System.in);
		System.out.print("\nDisplay Multiplication Table selected:");
		System.out.print("\nPlease enter the size of the table: ");

		z = input.nextInt();
		int magnitude = Integer.toString(z).length();

		String formatStringPad = String.format("%%%ds", magnitude);

		String formatIntegerPad = String.format("%%%dd", magnitude);

		input.close();

		// Decision Statement
		if (z >= 1 && z <= 100) {

			// Display Corner of table
			System.out.printf(formatStringPad + "" + " |", " ");

			// Display table header
			for (int i = 1; i <= z; i++)
			{

				System.out.printf("%5d", i);
			}
			// Display table divider

			System.out.println(); // add space

			for (int i = 1; i <= z; i++) // i is number of rows
			{

				System.out.print("-------");
			}

			// Display Multiplication table
			System.out.println();

			for (int i = 1; i <= z; i++) {

				System.out.printf(" " + formatIntegerPad + " |", i);

				for (int j = 1; j <= z; j++) // j is number of columns
				{

					System.out.printf("%5d", (i * j));

				}
				System.out.println("");

			} // End outer loop

		} else {

			System.out.println("Must enter a number between 0 and 12.");
		}
	}
}


