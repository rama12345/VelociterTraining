package com.velociter.exception.chapter7.exrecise6;

import java.util.Scanner;

public class DemoNullPointerException
{
	public static void main(String[] args) 
	{
		
    Employee empObject = new Employee();
    empObject.setEmpId(1);
  
    empObject.setEmpName(null);
    System.out.println("employeee detils  :"+empObject);
	
    Employee empObject1 = new Employee();
    empObject1 = null ;
    
    System.out.println("employeee detils  :"+empObject1);
	}

}
