package com.velociter.exercise.chapter14;

import java.util.Vector;

public class PrimeNumber {
	public static void main(String[] args)
	{	
		Vector<Long> primes = new Vector<Long>();   // Vector to store primes
	    int primesRequired = 50;                   // Number of primes required
	 
	    primes.add( (2L));  // Seed the first prime
	    primes.add((3L));   // and the second
	    long number = 5L;   // Next integer to be tested
	    long divisor = 0L; // Stores current trial divisor
	 
	  outer:
	    for(number=5 ; primes.size() < primesRequired; number += 2) {
	      // The maximum divisor we need to try is square root of number
	      long limit = (long)Math.ceil(Math.sqrt((double)number));
	 
	      // Divide by all the primes we have up to limit
	      for(int i = 1; i < primes.size() && (divisor = primes.elementAt(i)) <= limit; ++i) {
	        if(number%divisor == 0) {                                      // Is it an exact divisor?
	          continue outer;                                              // Yes, try the next number
	        }
	      }
	      primes.add(number);                                              // We got one!
	    }
	    // Output all the primes six to a line
	    int count = 0;
	    for(Long prime : primes) {
	      System.out.printf("%5d", prime);
	      if(++count%6 == 0) {
	        System.out.println();
	      }
		// TODO Auto-generated method stub

	}

}
}
