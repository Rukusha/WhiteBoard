package com.InformationCatalyst.Whiteboard;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Whiteboard {

	private final static Logger logger = LoggerFactory.getLogger(Whiteboard.class);
	static Scanner userIn = new Scanner(System.in);
	static Scanner userInString = new Scanner(System.in);
	static Scanner userDou = new Scanner(System.in);

	static int userInt;
	static double userDouble;
	static String userString;
	static String shapeIndicator;
	static Boolean InputCheck = false;
	static boolean RS = false;

	public static double userMove;
	private static String[] args;

//------------------------------------------------------------------------------------------Creates objects
	static Rectangle RecOBJ = new Rectangle();
	static Square SquareOBJ = new Square(args);
	static ResizeableSquare ReSizeOBJ = new ResizeableSquare(args);
	static threeMoveableShapes MoveOBJ = new threeMoveableShapes(args);
	static TwoDShapes DShapeOBJ = new TwoDShapes();
	static Circle CircleOBJ = new Circle(args);



	
//------------------------------------------------------------------------------------------Creates Arrays
	public static double[] movable1 = { 1, 2, 3, 4 };
	public static double[] movable2 = { 1, 2, 3, 4 };
	public static double[] movable3 = { 1, 2, 3, 4 };
	public static double[][] movable = { movable1, movable2, movable3 };

	public static double[] resizeable1 = { 1.0, 2.0, 3.0, 4.0 };
	public static double[] resizeable2 = { 1.0, 2.0, 3.0, 4.0 };
	public static double[] resizeable3 = { 1.0, 2.0, 3.0, 4.0 };
	public static double[][] resizeable = { resizeable1, resizeable2, resizeable3 };
	
	public static double[] TwoD1 = { 1.0, 2.0, 3.0, 4.0, 5.0 };
	public static double[] TwoD2 = { 1.0, 2.0, 3.0, 4.0, 5.0 };
	public static double[] TwoD3 = { 1.0, 2.0, 3.0, 4.0, 5.0 };
	public static double[][] TwoD = { TwoD1, TwoD2, TwoD3};
	public static String[] ShapeColour = { "a", "b", "c" };
	

//Main
	public static void main(String[] args) {

		logger.info(" What would you like to draw?");
		logger.info(" The options are a Rectangle, Square, Circle, 2DShape or RS");
		logger.info(" For the 3 shapes array task enter the word shape");
		logger.info(" Enter your selection");

		checkShape CheckShapeOBJ = new checkShape();
//		directs the program to the ShapeUse method in the CheckShape class 
//		this is where the program will take the users input and then decide what shapes matches the users input
		CheckShapeOBJ.ShapeUse(args);
		
	}
	
//circle shape
	public static void Circle() {

		logger.info(" Please enter the X coordinate");
		InputCheck = true;
		numCheck(args);

		CircleOBJ.setX();

		logger.info(" Please enter the Y coordinate");
		InputCheck = true;
		numCheck(args);

		CircleOBJ.setY();

		logger.info(" Please enter the Radius");
		InputCheck = true;
		numCheck(args);

		CircleOBJ.setRadius();

		logger.info(" Please enter the Colour for the Circle");
		userString = userInString.nextLine();

		CircleOBJ.setColour();

		logger.info("Properties of the Circle");

		logger.info(" X = " + CircleOBJ.getX());
		logger.info(" Y = " + CircleOBJ.getY());

		logger.info(" Radius = " + CircleOBJ.getRadius());

		logger.info(CircleOBJ.getColour());
//End of circle shape
		if (shapeIndicator == "2DShape") {
//2DShape
			logger.info("The Area is " + CircleOBJ.getArea());
			logger.info("The Perimeter is " + CircleOBJ.getPerimeter());
		}
	}
//End of circle 2DShape
//Start for the rectangle
	public static void Rectangle() {
		logger.info(" You will now select the top left X and Y coordinates");
		logger.info(" Please enter the top left X coordinate");
		
//Number validation
		numCheck(args);
		
//This part directs the values to the correct shapes Object
		switch (shapeIndicator) {
		case "Rectangle":
			RecOBJ.setX();
		case "Square":
			SquareOBJ.setX();
		case "ResizableSquare":
			ReSizeOBJ.setX();
		}
		logger.info(" Please enter the top left Y coordinate");
		InputCheck = true;
//Number validation
		numCheck(args);
		
//This part directs the values to the correct shapes Object
		switch (shapeIndicator) {
		case "Rectangle":
			RecOBJ.setY();
		case "Square":
			SquareOBJ.setY();
		case "ResizableSquare":
			ReSizeOBJ.setY();
		}

//Bottom

		logger.info(" You will now select the bottom right X and Y coordinates");
		logger.info(" Please enter the bottom right X coordinate");
		InputCheck = true;
//Number validation
		numCheck(args);

		switch (shapeIndicator) {
		case "Rectangle":
			RecOBJ.setX2();
		case "Square":
			SquareOBJ.setX2();
		case "ResizableSquare":
			ReSizeOBJ.setX2();
		}
		logger.info(" Please enter the bottom right Y coordinate");
		InputCheck = true;
//Number validation
		numCheck(args);

		switch (shapeIndicator) {
		case "Rectangle":
			RecOBJ.setY2();
		case "Square":
			SquareOBJ.setY2();
		case "ResizableSquare":
			ReSizeOBJ.setY2();
			

		}

		logger.info(" Please enter the colour of the shape");
		userString = userInString.nextLine();
		RecOBJ.setColour();
		SquareOBJ.setColour();
		ReSizeOBJ.setColour();

		if (shapeIndicator == "Rectangle") {
			logger.info(" Properties of the Rectangle");
			logger.info(" X = " + RecOBJ.getX());
			logger.info(" Y = " + RecOBJ.getY());

			logger.info(" X2 = " + RecOBJ.getX2());
			logger.info(" Y2 = " + RecOBJ.getY2());

			logger.info(RecOBJ.getColour());
		}
	}
//End of rectangle shape
//Start of Square
	public static void Square() {
		SquareOBJ.Check();
		logger.info("\n");

		logger.info("This " + SquareOBJ.Square + " A Square");
		logger.info("\n");

		logger.info("What direction would you like to move the shape in?");
		logger.info("The options are Up, Down, Left and right");

		userString = userInString.nextLine();
		logger.info("You chose " + userString);
		moveShape();
	}
//End of square shape
//Moving the shape
	public static void moveShape() {
		logger.info("How many spaces would you like to move the Square?");
		userMove = userDou.nextInt();
		SquareOBJ.setMove();
		switch (userString) {
		case "up":
			SquareOBJ.moveUp();
			move();
			break;
		case "down":
			SquareOBJ.moveDown();
			move();
			break;
		case "left":
			SquareOBJ.moveLeft();
			move();
			break;
		case "right":
			SquareOBJ.moveRight();
			move();
			break;
		}
	}
//End of movable shape
//Displaying the new coordinates for the square after the move
		public static void move() {
			logger.info("new X coordinate is " + SquareOBJ.getXM());
			logger.info("new Y coordinate is " + SquareOBJ.getYM());
			logger.info("new X2 coordinate is " + SquareOBJ.getX2M());
			logger.info("new Y2 coordinate is " + SquareOBJ.getY2M());
		}
//Resizeable Square
	public void reSizableSquare() {
		if (RS == false) {
			logger.info("How much % do you want to scale the Square by?");
			userMove = userDou.nextInt();
			ReSizeOBJ.setS();
			SquarePropertiesDisplay();
		}
	}
//End of Resiseable shape
//Square Properties
	public void SquarePropertiesDisplay() {
		logger.info(" Properties of the Square");
		logger.info(" X = " + ReSizeOBJ.getXMR());
		logger.info(" Y = " + ReSizeOBJ.getYMR());
		logger.info(" X2 = " + ReSizeOBJ.getX2MR());
		logger.info(" Y2 = " + ReSizeOBJ.getY2MR());

		logger.info(SquareOBJ.getColour());
	}

//Checks all users input that involve numbers
	public static void numCheck(String[] args) {
		do {
			try {
				userInt = userIn.nextInt();
				switch (userInt) {
				case -1:
				case -2:
				case -3:
				case -4:
				case -5:
				case -6:
				case -7:
				case -8:
				case -9:
				case -10:
				case 0:
				case 1:
				case 2:
				case 3:
				case 4:
				case 5:
				case 6:
				case 7:
				case 8:
				case 9:
					InputCheck = false;
					userDouble = userInt;
					break;
				default:
					InputCheck = true;
					throw new InputMismatchException();
				}
			} catch (InputMismatchException InputCheck) {
				logger.info(" You have input a string or char instead of a number ");
				logger.info(" You have entered an incorrect value please try again ");
			}
		} while (InputCheck == true);
	}
	//End of Num Check
}
