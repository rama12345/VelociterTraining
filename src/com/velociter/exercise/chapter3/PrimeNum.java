package com.velociter.exercise.chapter3;

public class PrimeNum {

	public static void main(String[] args) {
		int n=13,sq,f=0,i;

		System.out.print("Enter a number to find wheather this number is prime number or not: ");
		
		sq=(int)(Math.sqrt(n));
		for(i=sq;i<n;i++)
		{
			if((n%i)==0)
			{
				f=1;
				break;
			}
		}
		if(f==1)
		{
			System.out.println(+n+" is not prime number");
		}
		else
		{
			System.out.println(+n+" is prime number");
		}
		
		

	}

}
