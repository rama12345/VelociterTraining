package com.velociter.exercise5.chapter6;

interface ShapeInterface 
	{
	    void area(int x, int y);
	}
	class Rectgl implements ShapeInterface
	{
	    @Override
	    public void area(int length, int breadth)
	    {
	        System.out.println(length*breadth);
	    }
	}
	class Triangle implements ShapeInterface
	{
	    @Override
	    public void area(int base, int height)
	    {
	        System.out.println(base*height);
	    }
	}
	public class ShapeUsingInterface
	{
	    public static void main(String X[])
	    {
	    	Rectgl r = new Rectgl();
	        Triangle t  = new Triangle();

	        r.area(5, 4);
	        t.area(6, 3);
	    }
	}



