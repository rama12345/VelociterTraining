package com.velociter.exercise.collection.chapter12;
import java.util.*;

public class ArrayListExample {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		//ArrayList<E>
		list1.add(5);
		list1.add(6);
		list1.add(7);
		list1.add(8);
		list1.add(9);
		list1.add(10);
		list1.add(6,11 );
		list1.set(5, 45);
		System.out.println(list1.get(6));
		System.out.println(list1);
		System.out.println(" list1 contains 7 : " + list1.contains(7));
        System.out.println(		list1.contains(24));
        }
		
	}


