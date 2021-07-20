package com.velociter.exercise.collection.chapter12;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer>list=new LinkedList<Integer>();//create linked list
		list.add(50);
		list.add(60);	
		list.add(80);
		list.push(444);
		
		Iterator<Integer>itrate=list.iterator();
		while(itrate.hasNext())
		{
			System.out.println(itrate.next());
		}

			
		
		System.out.println(list);
	System.out.println(list.clone());//remove 1 st element
		System.out.println(list);
	}

}
