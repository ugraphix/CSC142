
public class Histogram {

	/*
	 * Author: Grace Eder
	 * Title: Homework 1
	 * Created: 1/4/2018
	 * Notes: A histogram showing data from a voter participation document
	 * Histogram Key: T=total people of voting age, R=number of registered voters, V=actual votes made
	 *  
	 */


	//Create a constant for the scaleFactor argument.
	//Use a scale for the chart to create bars in the appropriate size.
	static final int SCALE_FACTOR = 100000;

	//Create constants for data/symbols/letters to be repeated in the data bar.
	static final String TOTAL = "T";
	static final String REGISTERED = "R";
	static final String VOTERS = "V";

	//Create a constant for the title.
	static final String TITLE = "Presidential Elections";

	public static void main(String[] args) {
		/*
		 * Call the createBar function, and add the parameters:
		 * year, number of people, character letters, and integer data (scaleFactor).
		 */
		printHeader(TITLE);
		createBar("2000 ", 4368000, TOTAL, SCALE_FACTOR);
		createBar(3335714, REGISTERED, SCALE_FACTOR) ; 
		createBar(2517028, VOTERS, SCALE_FACTOR);
		emptyRow();
		createBar("2004 ", 4646000, TOTAL,  SCALE_FACTOR);
		createBar(3508208, REGISTERED, SCALE_FACTOR);
		createBar(2884783, VOTERS, SCALE_FACTOR);
		emptyRow();
		createBar("2008 ", 5010844, TOTAL, SCALE_FACTOR);
		createBar(3630118, REGISTERED, SCALE_FACTOR); 
		createBar(3071587, VOTERS, SCALE_FACTOR);
		emptyRow();
		createBar("2012 ", 5221125, TOTAL, SCALE_FACTOR);
		createBar(3904959, REGISTERED, SCALE_FACTOR);
		createBar(3172930, VOTERS, SCALE_FACTOR);
		emptyRow();
		createBar("2016 ", 5557921, TOTAL, SCALE_FACTOR);
		createBar(4270270, REGISTERED, SCALE_FACTOR); 
		createBar(3363440, VOTERS, SCALE_FACTOR);
		createAxis(1000000);
	}

	//Create the title for the histogram.
	public static void printHeader(String title) {
		//Find the number of letters in the title string.
		int length = title.length();

		/*Create variable to hold calculations on centering text in header.
		Text that will appear centered (over a 80-character space) 
		before the histogram is displayed. One blank line follows it. 
		 */
		int numSpaces = (80 - length) / 2;  //80 character space minus title length, then divide by two.

		//Create a for loop to insert the number of spaces in the title.
		for (int i=1; i<=numSpaces; i++){
			System.out.print(" ");
		}
		//Print the title name in the console, which is located at the very top.
		System.out.println(title);
		System.out.println();
	}

	/*
	 * Create an overloaded method that accepts four parameters:
	 * 1. an integer specifying the bar title (the year)
	 * 2. an integer indicating the bar value 
	 * 3. the character to be repeated to create the data bar 
	 * 4. the scale
	 */
	public static void createBar(String barYear, int numPeople, String barCharacter, int scaleFactor ) { //create barLength parameters to add value for the loop

		//Calculate math so that we can divide the number of people from 100,000 to make the histogram easier to read
		int barLength = numPeople / scaleFactor;

		//Print year on graph.
		System.out.print(barYear);

		//Create a 'Y' axis line for the graph.
		System.out.print("|");

		//create a for loop for histogram data.
		for (int i=1; i<=barLength; i++){
			//print the number of times a T, R, or V shows on the histogram
			System.out.print(barCharacter);
		}
		System.out.println();
	}


	/*
	 * The second variant of the overloaded method can only accept 3 parameters:
	 * 1. bar value
	 * 2. integer bar value
	 * 3. scale
	 */
	public static void createBar( int numPeople, String barCharacter, int scaleFactor ) { //create barLength parameters to add value for the loop
		//Parameters; one is blank to avoid year, the rest is people, character letter, and the scale factor.
		createBar("     ", numPeople, barCharacter, scaleFactor);

	}


	//Create the lower horizontal axis. 
	public static void createAxis( int axis) {
		System.out.print("     |");
		//Create for loop for number the dashes in a set.
		for (int i=0; i<=5; i++) {
			//Create a nested loop to indicate how many sets of dashes need to show.
			for (int j=0; j<=9; j++) {
				System.out.print("-");
			}
			//Place the plus symbol after dashes.
			System.out.print("+");
		}

		//Create enough spaces for alignment.
		//(had to set zero outside the loop because spacing wasn't aligning directly under the + symbols on the axis)
		System.out.println();
		System.out.print("     0   ");

		//Create loop for the numbers under horizontal axis.
		for (int i=1000000  ; i<=6000000; i=i+axis) {
			System.out.print("    " + i);
		}
		//Create space, and then add the scale on the bottom for under the horizontal axis.
		System.out.println();
	}


	//Create an empty row below each year. NO PARAMETERS.
	public static void emptyRow () {
		//empty line with no data, except for a connecting | for the y axis
		System.out.println("     |");
	}


	/*
	//Attempt to find percentages at the end of the graphs. Extra credit.
	public static int findPercentage (int voterPercentage) {

		int votingAge = ;
		int registeredVoters = ;
		int math = votingAge / registeredVoters;
		return math;
	}*/


}
