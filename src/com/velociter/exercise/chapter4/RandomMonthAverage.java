 package com.velociter.exercise.chapter4;

public class RandomMonthAverage {
	   public static void main(String a[])
	   {
		   //create string 
	 String[] month={"January","Febuary","March","April","May","June","July","August","september","October","November","December"}; 
	 int number;
	 double sum=0; 
	 double numberArray[]=new double[12];
	 System.out.println("Random number");
	 for(number=0;number<12;number++)
	 {
		 numberArray[number]=((100.00*Math.random())+1);
	 }
	 for(number=0;number<12;number++)
	 {
	  System.out.print(+numberArray[number]+".");
	  System.out.println(month[number]);
	  sum=sum+numberArray[number];
	 }  
	 System.out.println("Sum of 12 number :"+sum); 
	 System.out.println("Average :"+(sum/12));
	   }
	}


