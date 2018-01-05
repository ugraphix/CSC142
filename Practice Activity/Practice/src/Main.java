
public class Main {
	/*
	 * Author: Grace Eder
	 * Title: Practice1
	 * Created: 1/5/2018

	 */
	public static void main(String[] args) {
		
		
		//assign numbers to 'number' variable
		int number = 123;

		// print the sum of digits and numbers
		System.out.println("The sum of digits " + number  + " = " + sumOfDigits(number));
		System.out.println("The sum of two numbers, starting at 0-100, in a loop " + " = "  + sumOfNumbers(1, 100));

	}

	public static int sumOfDigits(int number) { //add integer as a parameter
		int d1, d2, d3, sum;
		
		//calculate
		d1 = number/100;
		d2= number/10%10;
		d3=number%10;
		sum = d1 + d2 + d3;
		return sum;

	}

	public static int sumOfNumbers(int start, int end) { //add two integers are your parameters


		int sum = 0;
		//create your for loop to find the sum of numbers
		for (int i = start; i<=end; i++) {
			sum += i;
		}
		return sum;	


	}

}
