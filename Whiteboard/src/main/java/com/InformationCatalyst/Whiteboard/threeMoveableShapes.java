package com.InformationCatalyst.Whiteboard;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class threeMoveableShapes {
	private static final Logger logger = LoggerFactory.getLogger(Whiteboard.class);

	double ScaleX;
	double ScaleY;
	double ScaleX2;
	double ScaleY2;
	
	public threeMoveableShapes(String[] args) {
	}
	public void threeMShapes() {

//		This section is to create and add the Movable shapes into the arrays and then print them out
		for (int k = 0; k < Whiteboard.movable.length; k++) {
	//Calls the methods from the whiteboard
			logger.info("Please enter a shape that will then be moved 10 places ");

			Whiteboard.Rectangle();
			
//			This moves the shapes before they go into the array by 10

			ScaleX = Whiteboard.ReSizeOBJ.X + 10;
			ScaleY = Whiteboard.SquareOBJ.Y;
			ScaleX2 = Whiteboard.ReSizeOBJ.X2 + 10;
			ScaleY2 = Whiteboard.SquareOBJ.Y2;
			
	//This sets the specified shape information to the appropriate array positions		
			Whiteboard.movable[k][0] = ScaleX;
			Whiteboard.movable[k][1] = ScaleY;
			Whiteboard.movable[k][2] = ScaleX2;
			Whiteboard.movable[k][3] = ScaleY2;
			Whiteboard.ShapeColour[k] = Whiteboard.ReSizeOBJ.getColour();


		}
		
		logger.info("Shapes that will be moved by 10 spaces to the top right");
	//Prints out the arrays
		for (int h = 0; h < Whiteboard.movable.length; h++) {
			logger.info("Shape " + h + " " + Whiteboard.movable[h][0]);
			logger.info("Shape " + h + " " + Whiteboard.movable[h][1]);
			logger.info("Shape " + h + " " + Whiteboard.movable[h][2]);
			logger.info("Shape " + h + " " + Whiteboard.movable[h][3]);
			logger.info("Shape colour " + Whiteboard.ShapeColour[h]);
			logger.info("  ");

		}
		Whiteboard.DShapeOBJ.TwoDCircles();
	}
}
