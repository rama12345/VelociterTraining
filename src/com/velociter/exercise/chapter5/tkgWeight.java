package com.velociter.exercise.chapter5;

class tkgWeight{
	
	
    static final int KG_PER_TON = 1000;
    static final int GRAMS_PER_KG = 1000;
    static final int GRAMS_PER_TON = GRAMS_PER_KG*KG_PER_TON;
		 
		  //  instance variables
		  int tons = 0;
		  int kilograms = 0;
		  int grams = 0;
		 // Constructors
		  tkgWeight(int g) {
		    tons = g/GRAMS_PER_TON;
		    kilograms = (g - tons*GRAMS_PER_TON)/GRAMS_PER_KG;
		    grams = g - tons*GRAMS_PER_TON - kilograms*GRAMS_PER_KG;
		  }
		  tkgWeight(double kg) {
			    this((int)Math.round(kg*GRAMS_PER_KG));
			  }
		  tkgWeight(int t, int kg, int g) {
			    this(t*GRAMS_PER_TON + kg*GRAMS_PER_KG + g);
			  }
		  tkgWeight(){}
		  // Methods
		  public String toString()  {
		    return Integer.toString(tons) + "t " + kilograms + "kg " + grams + "g";
		  }
		 public int toGrams() {
		    return tons*GRAMS_PER_TON + kilograms*GRAMS_PER_KG + grams;
		  }
		  public double toKilograms() {
		    return ((double)toGrams())/GRAMS_PER_KG;
		  }
		 
		  public tkgWeight add(tkgWeight weight) {
		    return new tkgWeight(toGrams() + weight.toGrams());
		  }
		 
		  public tkgWeight subtract(tkgWeight weight) {
		    return new tkgWeight(toGrams() - weight.toGrams());
		  }
		 
		  public tkgWeight multiply(int n) {
		    return new tkgWeight(n*toGrams());
		  }
		 
		  public tkgWeight divide(int n) {
		    return new tkgWeight(toGrams()/n);
		  }
		 
		  // Compare two weights
		  // Return value is 1 if current greater than arg
		  //                 0 if current equal to arg
		  //                -1 if current less than arg
}
		
