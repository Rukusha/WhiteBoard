package com.InformationCatalyst.Whiteboard;

//In the same project, create an interface called Movable with the following methods: moveUp(int), moveDown(int), 
//moveLeft(int), moveRight(int). The input for each of these methods is the number of positions to move. 
//Let Rectangle implement the new interface. Update Rectangle accordingly. In the whiteboard, if square is chosen 
//(yes, square. -Why would square work?-) then ask the user for the direction and number of positions to move the square. 
//Display the new coordinates.

public interface Movable {

void moveUp();
void moveDown();
void moveLeft();
void moveRight();

}
