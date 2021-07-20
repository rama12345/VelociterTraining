package com.velociter.exercise.collection.chapter12;

import java.util.Stack;
import java.util.*;
import java.io.*;

public class StackOperation {
	public static void main(String [] args) {
		Stack<String> string  = new Stack<String>();//Initialization of Stack
        // using Generics
	     Stack<Integer> values = new Stack<Integer>();
	    /// pushing the elements
		    string.push("a");
		    string.push("b");
		    string.push("c");
		    string.push("d");
		    string.push("e");
		    string.push("f");
		    string.push("g");
		    string.push("h");
		    string.push("i");
		    string.push("j");
		    System.out.println(string); // Priniting the Stack Elements
		    values.push(1);
		    values.push(2);
		    values.push(3);
		    values.push(4);
		    values.push(5);
		    values.push(6);
		    values.push(7);
		    values.push(8);
		    values.push(9);
		    values.push(10);
		    System.out.println(values);
		    string.pop();
		    values.pop();
		    System.out.println("written null ");
		    
		    
		    
	
	}
		
	}


	
		    
	  
	     