/*
 * Grace Eder
 *  HW2 Draw Curves from Straight Lines
 *  Notes:	Part1- create shapes from lines 
 *  		Part2- create filled objects and patterns
 */


import java.awt.Graphics;
import java.awt.Color;
import java.util.Random;


public class HW2Drawing {
	//constant for the panel size in case someone wants to change the size
	static final int PANEL1_SIZE = 500;
	static final int PANEL2_SIZE = 400;
	static final int LINE_INCREMENT=5;

	//main calls the functions/methods of part1 and part 2
	public static void main(String[] args) {
		part1();
		part2();
	}

	//create method for part 1 of the assignment
	public static void part1(){
		DrawingPanel panel = new DrawingPanel (PANEL1_SIZE ,PANEL1_SIZE );
		//create 'paint-brush' line for drawing
		Graphics line = panel.getGraphics();

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
			line.setColor(randomColor);


			//FROM INSTRUCTIONS: "For Part 1, a single loop should be used to draw the entire figure"
			//create for loop to add +1 on each axis to draw a series of lines.
			for (int i=start; i<=end; i=i+LINE_INCREMENT) {
				//set coordinates for the line
				line.drawLine(i,start, end, i );
				line.drawLine(start,i, i, end );

			}
			//make sure to change the size of the objects each time it loops through
			start=start/2+125;
			end=end/2+125;
		}
	}

	//create method for part 2 of the assignment
	public static void part2() {
		//create panel for drawings
		DrawingPanel panel2 = new DrawingPanel (PANEL2_SIZE ,PANEL2_SIZE );
		//set panel with a neutral gray background color
		panel2.setBackground(Color.lightGray);
		//get graphics 'paint-brush' for drawing
		Graphics pb = panel2.getGraphics();
		//place shapes into panel
		rectangle(pb, 0,0);
		triangle( pb, 41, 0);
		oval(pb, 100, 0);
		polygon(pb, 200,0);

		//create for loop to loop through set of shapes 3 times
		for (int k=0; k<=120;k=k+40) {
			//create loop to have polygon2 repeat 
			for (int i=0; i<=PANEL2_SIZE; i=i+40) {
				//set fill color
				pb.setColor(Color.RED);
				polygon2(pb, i,200+k);
			}
			//create loop to have polygon2 repeat 
			for (int j=0; j<=PANEL2_SIZE; j=j+40) {
				//set fill color
				pb.setColor(Color.ORANGE);
				polygon3(pb, j,200+k);
			}
		}
	}

	/**
	 * rectangle draws a rectangle at custom coordinates
	 * @param pb graphics object to draw
	 * @param a x coordinate of top left corner of shape
	 * @param b y coordinate of top left corner of shape
	 */
	public static void rectangle(Graphics pb, int a,  int b ) {
		//draw rectangle
		//set fill color
		pb.setColor(Color.PINK);
		//do math for coordinates
		pb.fillRect(a, b, a+40, b+150);
	}

	/**
	 * 
	 * triangle draws a triangle at custom coordinates
	 * @param pb graphics object to draw
	 * @param a x coordinate of top left corner of shape
	 * @param b y coordinate of top left corner of shape
	 */
	public static void triangle(Graphics pb, int a, int b) {
		//draw triangle
		//set line color
		pb.setColor(Color.RED);
		//do math for coordinates
		pb.drawLine( a, b, a+150, b+150);
		pb.drawLine( a, b+150, a+150, b+150 );
		pb.drawLine(a,b,a,b+150 );
	}


	/**
	 * oval draws a oval at custom coordinates
	 * @param pb graphics object to draw
	 * @param a x coordinate of top left corner of shape
	 * @param b y coordinate of top left corner of shape
	 */
	public static void oval(Graphics pb, int a, int b) {
		//draw oval
		//set fill color
		pb.setColor(Color.BLUE);
		//calculate coordinates
		pb.fillOval(a, b, 75, 75);
	}

	/**
	 * polygon draws a polygon at custom coordinates
	 * @param pb graphics object to draw
	 * @param a x coordinate of top left corner of shape
	 * @param b y coordinate of top left corner of shape
	 */
	public static void polygon(Graphics pb, int a, int b) {
		//set fill color
		pb.setColor(Color.yellow);
		//calculate coordinates
		int xpoints[] = {a, a+120, a+60, a+120, a,a};
		int ypoints[] = {b, b, b+60, b+120, b+120, b};
		int npoints = 6;
		pb.fillPolygon(xpoints, ypoints, npoints);
	}


	/**
	 * polygon2 draws a polygon2 at custom coordinates
	 * @param pb graphics object to draw
	 * @param a x coordinate of top left corner of shape
	 * @param b y coordinate of top left corner of shape
	 */
	public static void polygon2(Graphics pb, int a, int b) {

		//calculate coordinates
		int xpoints[] = {a, a+40, a+40};
		int ypoints[] = {b, b, b+40};
		int npoints = 3;
		pb.fillPolygon(xpoints, ypoints, npoints);
	}

	/**
	 * polygon3 draws a polygon3 at custom coordinates
	 * @param pb graphics object to draw
	 * @param a x coordinate of top left corner of shape
	 * @param b y coordinate of top left corner of shape
	 */
	public static void polygon3(Graphics pb, int a, int b) {

		//calculate coordinates
		int xpoints[] = {a, a+40, a};
		int ypoints[] = {b, b+40, b+40};
		int npoints = 3;
		pb.fillPolygon(xpoints, ypoints, npoints);
	}
}