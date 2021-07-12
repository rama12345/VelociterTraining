package com.velociter.exercise.chapter2;


public class Tax {
	float income,taxRate,rs; 
	//create a instance variable
	 int taxDollars, taxCents;
	    //create a method of these class
	    int calculateTax() {
	    	income=(float)200.85;
	    	taxRate=(float)((35.00*income)/100.00);//calculate taxrate
			 rs=(float)(taxRate*67.50);
			 taxDollars=(int)rs;
			 taxCents=(int)((rs-taxDollars)*100);
			 System.out.println("Tax Rate in Dollars="+taxRate);
			 System.out.println("Tax Rate in Rs="+taxDollars);
			 System.out.println("Tax Rate in Paisa="+taxCents);

			 return taxCents;

	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //Create object.
		Tax obj=new Tax();//creating object of class
		//Calling calculateTax method to required pass two values to the argument if it is parameterized method or constructor  
		float taxCents= obj.calculateTax();
		 System.out.println("Tax Rate in Paisa="+taxCents);	}

}
