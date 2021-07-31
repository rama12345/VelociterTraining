package com.velociter.exercise.chapter14;

import java.util.Map;
import java.util.TreeMap;

public class PhoneDirectoryWithTreeMap  
{
private TreeMap<String,String> data;
   
   
   
    // Constructor creates an initially empty directory.
    
   public  PhoneDirectoryWithTreeMap() {
      data = new TreeMap<String,String>();
   }
   
   
   /**
    * find the phone number, if any, for a given name.
    *  The phone number associated with the name; if the name does
    *    not occur in the phone directory, then the return value is null.
    */
   public String getPhoneNumber( String name ) {
         return data.get(name);
   }

   
   /**
    * Associates a given name with a given phone number.  If the name
    * already exists in the phone directory, then the new number replaces
    * the old one.  Otherwise, a new name/number pair is added.  The
    * name and number should both be non-null.  An IllegalArgumentException
    * is thrown if this is not the case.
    */
   public void putNumber( String name, String number ) {
      if (name == null || number == null)
          throw new IllegalArgumentException("name and number cannot be null");
      data.put(name,number);
   }
   
   
   
  // Write the contents of the phone directory to System.out.
   
   public void print() {
      for ( Map.Entry<String,String> entry : data.entrySet() )
         System.out.println( entry.getKey() + ":  " + entry.getValue() );
   }
   public static void main(String[] args) {
       PhoneDirectoryWithTreeMap phoneDirectory = new PhoneDirectoryWithTreeMap();
       System.out.println("This program creates a PhoneDirectoryWithTreeMap and");
       System.out.println("adds several entries.  It then prints the contents of");
       System.out.println("directory and does a few lookups.");
       System.out.println();
       phoneDirectory.putNumber("rohit","8368967389");
       phoneDirectory.putNumber("kohli","6263579357");
       phoneDirectory.putNumber("rahul","9955533456");
       System.out.println("content are:");
       System.out.println();
       phoneDirectory.print();
       System.out.println();
       System.out.println("Number for rohit is " + phoneDirectory.getPhoneNumber("rohit"));
       System.out.println("Number for kohli is " + phoneDirectory.getPhoneNumber("kohlis"));
       System.out.println("Number for rahul is " + phoneDirectory.getPhoneNumber("rahul"));
          // The output from the last line should be null.
   }
	

}
