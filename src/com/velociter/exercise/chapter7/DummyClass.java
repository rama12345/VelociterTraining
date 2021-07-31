package com.velociter.exception.chapter7.exrecise6;

public class DummyClass
{
	
	public static DummyClass init() {  
		return null;  
		}  
		String convert(String s) {  
		return s.toUpperCase();  
		}  
		public static void main(String[] args)  throws NullPointerException
		{ 
			
				DummyClass dummy = DummyClass.init();  
				System.out.println(dummy.convert("jtp"));  
			
		
		}  
		  
}
