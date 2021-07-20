package com.velociter.exception.chapter7.exrecise6;

public class HandleException
{
	public static void main(String[] args) {  
		          
		           try{    
		                int a[]=new int[5];    
		                a[5]=30/0;
		                a[6]=-10;
		               }    
		               catch(ArithmeticException  e)  
		                  {  
		                   System.out.println("Arithmetic Exception occurs");  
		                  }    
		               catch(ArrayIndexOutOfBoundsException e)  
		                  {  
		                   System.out.println("ArrayIndexOutOfBounds Exception occurs");  
		                  }    
		                
		                              
		               System.out.println("rest of the code");    
		}

	}


