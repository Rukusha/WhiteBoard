package com.InformationCatalyst.Whiteboard;

public class Circle extends Shape implements TwoDShape{
	
	protected int Radius;
	protected int Area;
	protected int Perimeter;
	
	public Circle(String[] args) {
		
	}
//	  Get and set X
	  public int getRadius(){
	       return Radius;
	  }

	  public void setRadius(){
		  Radius = Whiteboard.userInt;
	  }
	@Override
	public int getArea() {
		return Area = (int) (3.142 * Radius * Radius);
		
	}
	@Override
	public int getPerimeter() {
		return Perimeter = (int) (Radius * 2 * 3.142);
		
	}


}