package com.velociter.exercise.chapter4;

public class Month {
	   public static void main(String a[])
	   {
	 String[] mon={"January","Febuary","March","April","May","June","July","August","september","October","November","December"}; 
	 int i;
	 double sum=0; 
	 double n[]=new double[12];
	 System.out.println("Random number");
	 for(i=0;i<12;i++)
	 {
	  n[i]=((100.00*Math.random())+1);
	 }
	 for(i=0;i<12;i++)
	 {
	  System.out.print(+n[i]+".");
	  System.out.println(mon[i]);
	  sum=sum+n[i];
	 }  
	 System.out.println("Sum of 12 number :"+sum); 
	 System.out.println("Average :"+(sum/12));
	   }
	}


