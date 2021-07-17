package com.velociter.exercise.chapter3;

public class Choice {

	public static void main(String[] args) {
		int Mychoice;
		Mychoice=(int)(6*Math.random());
		switch(Mychoice) {
		case 0:  System.out.println("Breakfast choice is scrambled eggs");
        break;
		case 1:  System.out.println("Breakfast choice is waffles");
        break;
		case 2:  System.out.println("Breakfast choice is fruits");
        break;
		case 3:  System.out.println("Breakfast choice is cereal ");
        break;
		case 4:  System.out.println("Breakfast choice is toast ");
        break;
		case 5:  System.out.println("Breakfast choice is yogurt ");
        break;
        default:
        	System.out.println("can't take a breakfast");
		
		
		}
		
		
		
		// TODO Auto-generated method stub

	}

}
