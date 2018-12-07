package com.InformationCatalyst.Whiteboard;

import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class checkShape extends Shape{
	private static final Logger logger = LoggerFactory.getLogger(Whiteboard.class);
	Scanner userInString = new Scanner(System.in);

	public void ShapeUse(String[] args) {
		Whiteboard WhiteOBJ = new Whiteboard();

			while (Whiteboard.InputCheck == false) {

				
//				Takes user input and adds it to userString
				WhiteOBJ.userString = WhiteOBJ.userInString.nextLine();
				WhiteOBJ.userString.toLowerCase();
//				Its then matched to one of the cases if possible
				switch (WhiteOBJ.userString) {
				case "square":
					logger.info(" You chose Square");
					WhiteOBJ.shapeIndicator = "Square";
					WhiteOBJ.Rectangle();
					WhiteOBJ.Square();
					break;

				case "rectangle":
					logger.info(" You chose Rectangle");
					WhiteOBJ.shapeIndicator = "Rectangle";
					WhiteOBJ.Rectangle();
					break;

				case "circle":
					logger.info(" You chose Circle");
					WhiteOBJ.shapeIndicator = "Circle";
					WhiteOBJ.Circle();
					break;

				case "2DShape":
					logger.info(" You chose 2DShape");
					WhiteOBJ.shapeIndicator = "2DShape";
					WhiteOBJ.Circle();
					break;

				case "rs":
					logger.info(" You chose ResizableSquare");
					WhiteOBJ.shapeIndicator = "ResizableSquare";
					WhiteOBJ.Rectangle();
					WhiteOBJ.reSizableSquare();
					break;

				case "shape":
					logger.info(" You chose 3 Shape arrays");
					WhiteOBJ.shapeIndicator = "3ShapeArray";
					reSizeShape ReSizeShapeOBJ = new reSizeShape();
					ReSizeShapeOBJ.ReSize();
                    //InputCheck is a bool im using to keep manage the flow through the program as the user enters the correct information
					WhiteOBJ.InputCheck = true;
					break;
					
				default:
					logger.info(" You have entered an incorrect word please try again");
					WhiteOBJ.userString = "";
//					InputCheck is forced to be false untill they get it right
					WhiteOBJ.InputCheck = false;
					break;
				}
			}
		}


	}


