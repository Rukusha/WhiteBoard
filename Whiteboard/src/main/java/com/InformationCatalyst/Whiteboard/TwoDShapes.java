package com.InformationCatalyst.Whiteboard;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TwoDShapes {

	private static final Logger logger = LoggerFactory.getLogger(Whiteboard.class);

	double ScaleX;
	double ScaleY;
	double ScaleX2;
	double Area;
	double Perimeter;
	
	public void TwoDCircles() {

//		This section is to create and add the Movable shapes into the arrays and then print them out
		for (int k = 0; k < Whiteboard.TwoD.length; k++) {
	//Calls the methods from the whiteboard
			logger.info("Please enter a shape that will then be moved 10 places ");

			Whiteboard.Circle();
			
//			This calculates the area and perimeter of the shapes

			ScaleX = Whiteboard.CircleOBJ.X;
			ScaleY = Whiteboard.CircleOBJ.Y;
			ScaleX2 = Whiteboard.CircleOBJ.Radius;
			Area = (3.142 * Whiteboard.CircleOBJ.Radius * Whiteboard.CircleOBJ.Radius);
			Perimeter = (Whiteboard.CircleOBJ.Radius * 2 * 3.142);
			
	//This sets the specified shape information to the appropriate array positions	
			
			Whiteboard.TwoD[k][0] = ScaleX;
			Whiteboard.TwoD[k][1] = ScaleY;
			Whiteboard.TwoD[k][2] = ScaleX2;
			Whiteboard.TwoD[k][3] = Area;
			Whiteboard.TwoD[k][4] = Perimeter;
			Whiteboard.ShapeColour[k] = Whiteboard.ReSizeOBJ.getColour();
		}
		
		logger.info("Shapes thats perimiters and areas will be measured ");
	//Prints out the arrays
		for (int h = 0; h < Whiteboard.movable.length; h++) {
			logger.info("Shape " + h + " " + Whiteboard.TwoD[h][0]);
			logger.info("Shape " + h + " " + Whiteboard.TwoD[h][1]);
			logger.info("Shape " + h + " " + Whiteboard.TwoD[h][2]);
			logger.info("Shape " + h + " " + "Area " + Whiteboard.TwoD[h][3]);
			logger.info("Shape " + h + " " + "Perimeter " + Whiteboard.TwoD[h][4]);
			logger.info("Shape colour " + Whiteboard.ShapeColour[h]);
			logger.info("  ");

		}
	}
}
