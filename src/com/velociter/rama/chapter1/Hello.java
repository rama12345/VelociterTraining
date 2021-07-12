package com.velociter.rama.chapter1;

public class Hello {
   static int a=10;
   static int b=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Hi Hello, Thank you ");
       System.out.println("I know who is this");
       try {
    	   int c=a+b;
		System.out.println(""+(a+b));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
