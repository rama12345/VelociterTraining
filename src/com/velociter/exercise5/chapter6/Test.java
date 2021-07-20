package com.velociter.exercise5.chapter6;

public class Test {

	public static void main(String[] args) {
		double x1 = Math.random()*5;
		double y1 = Math.random()*5;
		double x2 = Math.random()*5;
		double y2 = Math.random()*5;
		
		//Point p = new Point(x, y);
		Line lineObject= new Line(x1, x2, y1, y2);
		lineObject.show();
		System.out.println(	"this result genrated by  toString() for line "+"," +	lineObject.toString());
		System.out.println("====================circle details===================");
		double center=x1; double radius=y1;
		Circle circleObj=new Circle(center,radius);
		circleObj.show();
		System.out.println(	"this result genrated by  toString() for circle "+"," +	circleObj.toString());

		System.out.println("====================Rectangle details===================");
		Rectangle rectangleObj=new Rectangle(x1, x2, y1, y2);
		 rectangleObj.show();
			System.out.println(	"this result genrated by  toString() for Rectangle "+"," +	 rectangleObj.toString());
		System.out.println("====================circle details===================");
        ShapeList shapListObtect = new ShapeList(circleObj);
        
		 
		
	}

}
