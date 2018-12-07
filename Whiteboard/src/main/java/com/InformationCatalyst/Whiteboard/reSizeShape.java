package com.InformationCatalyst.Whiteboard;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class reSizeShape{
	private static final Logger logger = LoggerFactory.getLogger(Whiteboard.class);

	double ScaleX;
	double ScaleY;
	double ScaleX2;
	double ScaleY2;
	
	public void ReSize() {
		Whiteboard.shapeIndicator = "ResizableSquare";

		for (int k = 0; k < Whiteboard.resizeable.length; k++) {
			Whiteboard.shapeIndicator = "ResizableSquare";
//This RS is used to split up the Resizable square into the single version and the multiple array
			Whiteboard.RS = true;
//Calls the methods from the whiteboard
			Whiteboard.Rectangle();
			
//			This scales the shapes before they go into the array by 50%
			ScaleX = Whiteboard.ReSizeOBJ.X - (Whiteboard.ReSizeOBJ.X / 2);
			ScaleY = Whiteboard.ReSizeOBJ.Y - (Whiteboard.ReSizeOBJ.Y / 2);
			ScaleX2 = Whiteboard.ReSizeOBJ.X2 - (Whiteboard.ReSizeOBJ.X2 / 2);
			ScaleY2 = Whiteboard.ReSizeOBJ.Y2 - (Whiteboard.ReSizeOBJ.Y2 / 2);
			
//This sets the specified shape information to the appropriate array positions		
			Whiteboard.resizeable[k][0] = ScaleX;
			Whiteboard.resizeable[k][1] = ScaleY;
			Whiteboard.resizeable[k][2] = ScaleX2;
			Whiteboard.resizeable[k][3] = ScaleY2;
			Whiteboard.ShapeColour[k] = Whiteboard.ReSizeOBJ.getColour();


		}
		
		logger.info("Shapes scaled by 50%");
//Prints out the arrays
		for (int h = 0; h < Whiteboard.resizeable.length; h++) {
			logger.info("Shape " + h + " " + Whiteboard.resizeable[h][0]);
			logger.info("Shape " + h + " " + Whiteboard.resizeable[h][1]);
			logger.info("Shape " + h + " " + Whiteboard.resizeable[h][2]);
			logger.info("Shape " + h + " " + Whiteboard.resizeable[h][3]);
			logger.info("Shape colour " + Whiteboard.ShapeColour[h]);
			logger.info("  ");

		}
		Whiteboard.MoveOBJ.threeMShapes();
}
}
