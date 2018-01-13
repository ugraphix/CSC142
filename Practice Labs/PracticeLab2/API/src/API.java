import java.awt.Point;

/*
 * Grace Eder
 * API Activity
 * 1/10/2018
 */



public class API {

	public static void main(String[] args) {

		//Given the declaration String s = “letterhead”; and using the String class
		//Write the expression to find index of the character ‘h’.
		String test = "letterhead";
		System.out.println("1. The index of the character ‘h’ in letterhead: " + test.indexOf('h'));
		// Write the expression to retrieve the character ‘r’ from the String.
		System.out.println("2. retrieve the character ‘r’ from the String: " + test.substring(5,6));
		//Write the expression to get the substring “ette”.
		System.out.println("3. retrieve the character ‘ette’ from the String: " + test.substring(1,5));
		//Write the expression to find the index location of the last 'e'
		System.out.println("4. The index location of the last 'e':"  + test.lastIndexOf('e'));
		System.out.println();




		//Using the Math class
		//Write the expression to calculate e1.7
		double num = Math.pow(Math.E, 1.7);
		System.out.printf("1. Calculate e1.7: " + "%.2f\n", num);
		//Write the expression to find the larger of two values x and y
		double x = 10.45, y=10.2;
		System.out.printf("2. Max of two numbers: " + "%.2f\n", Math.max(x, y));
		//Write the expression to generate a random number in the range [0.0, 1.0)
		double numRandom1 = Math.random() * 1.0 + 0.0;
		System.out.printf("3. Random Number (between 0.0-1.0): " + "%.2f\n" , numRandom1);
		//Write the expression to generate a random number in the range [0.0, 20.0)
		double numRandom2 = Math.random() * 20.0 + 0.0;
		System.out.printf("4. Random Number (between 0.0-20.0): " + "%.2f\n" , numRandom2);
		//Write the expression to generate a random number in the range [5,6)
		double numRandom3 = Math.random() * (6 - 5) + 5;
		System.out.printf("5. Random Number (between 5.0-6.0): " + "%.2f\n" , numRandom3);
		//Write the expression to generate a random number in the range [10,15)
		double numRandom4 = Math.random() * (15 - 10) + 10;
		System.out.printf("6. Random Number (between 10.0-15.0): " + "%.2f\n" , numRandom4);

		//Write the expression to generate a random integer in the range [1,2,3,4,5,6,7,8,9,10]
		int numRandom5 = (int) Math.random() * 10 + 1;
		System.out.println("7. Random integer in the range [1,2,3,4,5,6,7,8,9,10]: " + numRandom5);
		System.out.println();

		/*
		//Im not sure if you were asking for this???? random integers for 1-2,2-3,3-4,4-5,5-6,6-7,7-8,8-9,9-10??
		System.out.printf("7. Random integer in the range [1,2,3,4,5,6,7,8,9,10]: \n" );
		for (double s=2.0; s<=10; s++) {
			double numRandom6 = Math.random() * (s - (s-1)) + (s-1);
			System.out.printf("\t" + "%.2f\n" , numRandom6);
		}
		System.out.println();
		 */


		
		
		
		//More searching through the API
		//Write a statement to instantiate a Point object with coordinates (3, 4) and binding it to an appropriate reference variable.
		Point firstPoint = new Point(3,4);
		Point secondPoint = new Point(firstPoint);

		System.out.println("secondPoint is located at: " + firstPoint);

		//What package do you need to import to use a Point object?:  java.awt.Point

		//What are the coordinates of a Point object if you don't specify any? [x=0,y=0]




	}



}




