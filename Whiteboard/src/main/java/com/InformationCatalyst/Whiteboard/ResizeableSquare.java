package com.InformationCatalyst.Whiteboard;

public class ResizeableSquare extends Square implements Resizeable {

	double XR;
	double YR;
	double X2R;
	double Y2R;
	
	public ResizeableSquare(String[] args) {
		super(args);

	}


	@Override
	public void resize() {
		XR = X + (X * (userMoveX / 100));
		YR = Y + (Y * (userMoveX / 100));
		X2R = X2 + (X2 * (userMoveX /100));
		Y2R = Y2 + (Y2 * (userMoveX / 100));
		}
	

	public double getXMR() {
		resize();
		return XR;	
	}
	public double getYMR() {
		resize();
		return YR;	
		
	}
	public double getX2MR() {
		resize();
		return X2R;	
	}
	public double getY2MR() {
		resize();
		return Y2R;	
	}
	public double setS() {
		userMoveX = Whiteboard.userMove;
		return userMoveX;
	}
	public double getS() {
		return userMoveX;	
		}

}
