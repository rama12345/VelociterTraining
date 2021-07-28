package com.velociter.exercise.chapter3;

public class Vowels {

	public static void main(String[] args) {
		int capitalNumbers=0;// number of capitals generated.
		int numberToGenreate=20;//Number of capitals to generate.
		char Symbol=0;//Variable to store a random character.
		while(capitalNumbers<numberToGenreate) {
			Symbol=(char)(26*Math.random()+'E');// random capital letter from 'A' to 'Z' we can add a random integer
		      // between 0 and 25 to 'A'.
			}
			switch(Symbol) {


			case'A':
				System.out.println("this letter is vowel");

			case'E':
				System.out.println("this letter is vowel");
								

			case'I':
				System.out.println("this letter is vowel");

			case'O':
				System.out.println("this letter is vowel");

			case'U':
				System.out.println(" this letter is vowel");

			break;

			default:


			System.out.print(Symbol + " ");
//Consonant displayed
			capitalNumbers++;

			break;
			
		}
		

	}

}
