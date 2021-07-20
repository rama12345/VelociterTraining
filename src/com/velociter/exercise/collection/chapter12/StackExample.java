package com.velociter.exercise.collection.chapter12;

import java.util.List;
import java.util.*;
import java.util.Stack;

public class StackExample {
	 static void stack_push(Stack<Integer> stack)
	    {
	        for(int i = 0; i < 10; i++)
	        {
	            stack.push(i);
	        }
	    }
	      
	    // Popping element from the top of the stack
	    static void stack_pop(Stack<Integer> stack)
	    {
	        System.out.println("Pop Operation:");
	  
	        for(int i = 0; i < 10; i++)
	        {
	            Integer y = (Integer) stack.pop();
	            System.out.println(y);
	        }
	    }
	  /*
	     Displaying element on the top of the stack
	    static void stack_peek(Stack<Integer> stack)
	   {
	        Integer element = (Integer) stack.peek();
	        System.out.println("Element on stack top: " + element);
	   }
	  */
	      
	    // Searching element in the stack
	    static void stack_search(Stack<Integer> stack, int element)
	    {
	        Integer position = (Integer) stack.search(element);
	  
	        if(position == -1)
	            System.out.println("Element not found");
	        else
	            System.out.println("Element is found at position: " + position);
	    }
	    static void ListAll() {
	    	
		}
	  
	  
	    public static void main (String[] args)
	    {
	        Stack<Integer> stack = new Stack<Integer>();
	        stack_push(stack);
	        stack_pop(stack);
	        stack_push(stack);
	        stack_search(stack, 2);
	        stack_search(stack, 6);
	    }
	  
 
		// T
		    
		    
		    

	}


