
public class Homework1 {
	/*
	 * Author: Grace Eder
	 * Title: Homework 1
	 * Created: 1/4/2018
	 * Notes: A histogram showing data from a voter participation document
	 * Histogram Key: T=total people of voting age, R=number of registered voters, V=actual votes made
	 *  
	 */
	public static void main(String[] args) {
		//create a scaleFactor variable to make it easier than typing in the same numbers over again for each year
		int scaleFactor = 100000;
		
		
		
		//call the createBar function, and add the arguments = year, number of people, character letter, and integer data (scaleFactor). 
		
		
		createBar("2000   ", 4368000, "T",  scaleFactor);
		createBar("       ", 3335714, "R", scaleFactor); 
		createBar("       ", 2517028, "V", scaleFactor);
		
		createBar("2004   ", 4646000, "T",  scaleFactor);
		createBar("       ", 3508208, "R", scaleFactor);
		createBar("       ", 2884783, "V", scaleFactor);
		
		createBar("2008   ", 5010844, "T",  scaleFactor);
		createBar("       ", 3630118, "R", scaleFactor); 
		createBar("       ", 3071587, "V", scaleFactor);
		
		createBar("2012   ", 5221125, "T",  scaleFactor);
		createBar("       ", 3904959, "R", scaleFactor);
		createBar("       ", 3172930, "V", scaleFactor);
		
		createBar("2016   ", 5557921, "T",  scaleFactor);
		createBar("       ", 4270270, "R", scaleFactor); 
		createBar("       ", 3363440, "V", scaleFactor);
	
		
		
	}



	public static void createBar(String barYear, int numPeople, String barCharacter, int scaleFactor ) { //create barLength parameters to add value for the loop
		/*Find percentages at the end of the graphs
		int votingAge = 4368000;
		int registeredVoters = 3335714;
		int voterPercentage = votingAge / registeredVoters;
		*/
		
		//do the math so that we can divide the number of people from 100,000 to make the histogram easier to read
		int barLength = numPeople / scaleFactor;
		
		
		//print year on graph
		System.out.print(barYear);
		
		//create a 'Y' axis for the graph
		System.out.print("| ");
		
		//create a for loop for histogram data
		for (int i=1; i<=barLength; i++){
			System.out.print(barCharacter);
			
			

		}
		System.out.println("");
	}


}
