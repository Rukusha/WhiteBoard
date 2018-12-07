package com.InformationCatalyst.Whiteboard;

public class Rectangle extends Shape implements Movable {

	protected double X2;
	protected double Y2;

	double XU;
	double YU;
	double X2U;
	double Y2U;
	double userMoveX;

	
public Rectangle() {
	}

//	  Get and set X
	public double getX2() {
		return X2;
	}

//	  Get and set Y
	public double getY2() {
		return Y2;
	}
//	  Get and set X2
    public void setX2(){
		  X2 = Whiteboard.userInt;
		  }
//	  Get and set Y2
	public void setY2(){
		  Y2 = Whiteboard.userInt;
	  }
//	  Get and set the users Move
	public double setMove() {
		userMoveX = Whiteboard.userMove;
		return userMoveX;
	}
//	  Calculations for moving the shape
	@Override
	public void moveUp() {

		XU = X;
		YU = Y + userMoveX;
		X2U = X2;
		Y2U = Y2 + userMoveX;
	}

	@Override
	public void moveDown() {
		XU = X;
		YU = Y - userMoveX;
		X2U = X2;
		Y2U = Y2 - userMoveX;
	}

	@Override
	public void moveLeft() {
		XU = X - userMoveX;
		YU = Y;
		X2U = X2 - userMoveX;
		Y2U = Y2;
	}

	@Override
	public void moveRight() {
		XU = X + userMoveX;
		YU = Y;
		X2U = X2 + userMoveX;
		Y2U = Y2;
	}

	public double getXM() {
		return XU;
	}

	public double getYM() {
		return YU;
	}

	public double getX2M() {
		return X2U;
	}

	public double getY2M() {
		return Y2U;
	}
	}
