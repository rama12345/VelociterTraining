package com.velociter.exercise.chapter4;

public class TestArray {
	static void min(int arr[]){
		//creating a method which receives an array as a parameter 
		int min=arr[0];  
		for(int i=0;i<arr.length;i++)  
		 if(min>arr[i])  
		  min=arr[i];  
		  
		System.out.println(min);  
		}  
		  
		public static void main(String args[]){  
		int a[]={33,3,4,5};//declaring and initializing an array  
		min(a);//passing array to method  
		}  

}
