public class PracticeLab1 {

	public static void main(String[] args) {
		// Write a small Java program to display your name and something about yourself
		
		/*
		 I want to make sure I always record comments
		 Creating good comments makes it easier for others to understand my code
		 I prefer using Eclipse to create projects, not BlueJ
		
		 
		 Created by: Grace Eder
		 Date: 1/2/2018
		 GitHub:  https://github.com/ugraphix/CSC142/blob/master/PracticeLab1/src/PracticeLab1.java
		 */ 
		
		//printing first statements about myself, incorporating escape-characters
		System.out.println("Hello, my name is Gracie."
				+ "\nI have a cat."
				+ "\nI love bicycles."
				+ "\nWhen I was a bike messenger, people used to say \"Girl, you're so crazy!\"");
		System.out.println();
		
		//calling the method holding my second statement
		secondStatement();
		
		
	}
	
	//Creating a method containing my second statement about myself
	public static void secondStatement() {
		//printing second statement about myself
				System.out.print("Right now");
				System.out.print(" I'm working on my ");
				System.out.println("BAS in Application Development. "
				+ "\nIm only taking this beginning class for Java review."
				+ "\nMy AD300 class was very stressful becuase I hadn't used Java since 2014.");
	}

}