
public class PrintDesign {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printDesign();

	}
	public static void printDesign() {

		//loop for whole design
		//lineNum starts at 1; run through loop as long as linNumber is less than 5 but no greater; increment lineNumber by 1 
		for (int lineNum=1; lineNum<=5; lineNum++) {

			//variable starts at 6 and decreases by whatever lineNumber is in each loop (1,2,3,4,5)
			int numDashes = 6 - lineNum;


			//for dashes. (left side)
			////start j at one; run through loop as long as j is less than numDashes but no greater, increment j by 1
			for (int j=1 ;j<=numDashes; j++) {
				System.out.print("-");
			}

			//variable that takes the value lineNumber is for the loop, multiplies it by 2, and then subtracts by 1
			//example after third loop: lineNum=3,  3*2=6, 6-1=5, 5 is the final number
			int numbers = lineNum*2-1;


			//for numbers
			//start k at 1; run through loop as long as k is less than but no greater than numbers; increment k by 1
			//not sure why or how this knows when to stop since numbers value always changing
			for (int k=1; k<=numbers; k++) {
				System.out.print(numbers);
			}


			//for dashes. (right side)
			////start j at one; run through loop as long as j is less than numDashes but no greater, increment j by 1
			for (int j=1 ;j<=numDashes; j++) {
				System.out.print("-");
			}
			System.out.println();
		}
	}

}
