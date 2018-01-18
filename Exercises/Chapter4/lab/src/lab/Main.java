package lab;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,c, x1, x2, d;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter coefficient for a: ");
		a=in.nextDouble();
		System.out.print("Enter coefficient for b: ");
		b=in.nextDouble();
		System.out.print("Enter coefficient for c: ");
		c=in.nextDouble();
		//input validation


		if (a !=0 && b!=0 && c!=0) {
			//calculate the variables
			d=b*b-4*a*c;
			if (d<0) {
				System.out.print("The Quadratic Equation has no roots because the Discriminant is negative. " );
			}
			else {
				x1=-(b-Math.sqrt(d))/(2*a);
				x2=-(b+Math.sqrt(d))/(2*a);

				if (x1==x2) {
					System.out.print("The Quadratic Equation has one root because the Discriminant is equaled zero.\nx= " + (int)x1 );
				}

				else {
					System.out.print("The Quadratic Equation has two roots.\nx1= " + x1 + "  x2= " + x2);
				}
			}

		}else {
			System.out.print(" This is not a Standard Form of Quadratic Equation! ");

		}


	}

}
