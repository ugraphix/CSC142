import java.awt.Graphics;
import java.awt.Color;
import java.util.Random;

public class HW2Drawing {
	//constant for the panel size in case someone wants to change the size
	static final int PANEL1_SIZE = 500;
	static final int PANEL2_SIZE = 400;
	
	
	public static void main(String[] args) {
		part1();
	}

	
	//great method for part 1 of the assignment
	public static void part1(){

		//create the drawing panel
		DrawingPanel panel = new DrawingPanel (PANEL1_SIZE ,PANEL1_SIZE );
		//set panel with a neutral gray background color
		panel.setBackground(Color.lightGray);

		//variables for loops
		int start = 0;
		//Use constant SIZE to loop 500 times
		int end = PANEL1_SIZE;

		//create a loop so that 7 objects are formed in the panel
		for (int j=0; j<=6; j++) {
			//create a new random color by creating random primary colors
			Random rand = new Random();
			float r = rand.nextFloat();
			float g = rand.nextFloat();
			float b = rand.nextFloat();
			//create the color, pass the primary colors into the constructor
			Color randomColor = new Color(r, g, b);

			//draw a line on the panel using the Graphics paint brush
			Graphics line = panel.getGraphics();
			line.setColor(randomColor);


			//FROM INSTRUCTIONS: "For Part 1, a single loop should be used to draw the entire figure"
			//create for loop to add +1 on each axis to draw a series of lines.
			for (int i=start; i<=end; i++) {
				//set coordinates for the line
				line.drawLine(i,start, end, i );
				line.drawLine(start,i, i, end );

			}
			//make sure to change the size of the objects each time it loops through
			start=start/2+125;
			end=end/2+125;
		}
	}
	
	
	
	//great method for part 2 of the assignment
	public static void part2() {
		
	}
}