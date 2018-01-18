import java.awt.Graphics;
import java.awt.Color;


public class DrawLine {

	public static void main(String[] args) {
		
		//create the drawing panel
		DrawingPanel panel = new DrawingPanel (500,500);
		
		//draw a line on the panel using the Graphics paint brush
		Graphics g = panel.getGraphics();
		g.drawLine(25, 75, 75, 25);
		
	
		
		
		
	}
}