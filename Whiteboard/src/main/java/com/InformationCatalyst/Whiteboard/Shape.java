package com.InformationCatalyst.Whiteboard;

public abstract class Shape  {
		
	private String Colour;
	protected double X;
	protected double Y;
	Whiteboard WhiteOBJ = new Whiteboard();

	
	public void Shape() {
	
	}
	  
//	  Get and set X
	  public double getX(){
	       return X;
	  }
	  public void setX(){
		  X = Whiteboard.userDouble;
	  }

//	  Get and set Y
	  public double getY(){
	       return Y;
	  }
	  public void setY(){
		  Y = Whiteboard.userInt;
	  }
	  
//	  Get and set colour
	  public String getColour(){
	       return Colour;
	  }
	  public void setColour(){
		  Colour = Whiteboard.userString;
	  }

}
