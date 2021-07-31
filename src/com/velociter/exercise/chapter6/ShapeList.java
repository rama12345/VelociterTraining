package com.velociter.exercise5.chapter6;

public class ShapeList
{
	
		private  double center;
		private  double radius;
		public ShapeList( Circle circleObj) 
		{
			this.center=circleObj.getCenter();
			this.radius=circleObj.getCenter();
		}
		public void show()
		{
			System.out.println("Circle details center=" + center + ",radius=" + radius );
		}
		@Override
		public String toString() {
			return "Circle [center=" + center + ", radius=" + radius + "]";
		}
		
}
	


