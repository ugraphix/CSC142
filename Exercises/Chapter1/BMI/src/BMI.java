
public class BMI {

	public static void main(String[] args) {
		// program to calculate BMI

		//declare variables
		double height, weight;
		double bmi;

		//assign value to variable, compute BMI
		height = 70;
		weight = 195;
		bmi = weight / (height * height) * 703;

		//print results of BMI
		System.out.println("Current BMI is " + bmi);

		//declare variables, compute BMI
		height = 80;
		weight = 230;
		bmi = weight / (height * height) * 703;

		//print results of BMI
		System.out.println("New BMI is " + bmi);


	}

}
