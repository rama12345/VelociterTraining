package com.velociter.exercise.chapter5;

public class McmLength {
	  static final int CM_PER_M = 100;
	  static final int MM_PER_CM = 10;
	  static final int MM_PER_M = MM_PER_CM*CM_PER_M;
	 
	  // Private member variables:
	  private int meters = 0;
	  private int centimeters = 0;
	  private int millimeters = 0;
	 
	  // Constructors:
	  public McmLength(double cm) {
	    this((int)Math.round(cm*MM_PER_CM));
	  }
	 
	  public McmLength(int mm){
	    meters = mm/MM_PER_M;
	    centimeters = (mm - meters*MM_PER_M)/MM_PER_CM;
	    millimeters = mm - meters*MM_PER_M - centimeters*MM_PER_CM;
	  }
	  
	  public McmLength(int m, int cm, int mm) {
	    this(m*MM_PER_M + cm*MM_PER_CM + mm);
	  }
	  public McmLength(){
		  
	  }
}


