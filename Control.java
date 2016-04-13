/*
 	Aisling Murphy 
 	C14343571       
 	Java Assignment 
    ----------------------------------------------------------------------------------------------------  
 	Robo-Reader 
 	~ This program is a program written in Java. The program uses user input to get a file from the user
 	  by using the browse button. the user selects the file they wish to open and the program opens the 
 	  file and reads it. It then scans the file the user has selected and counts the most common 
 	  words within the file and displays them.
 	-----------------------------------------------------------------------------------------------------
 	
*/

package com.assignment.java; //This is the name of the package this code is stored in.

//My import functions.
import javax.swing.JFrame;

//Start
public class Control 
{
	public static void main(String[] args)
	{
		//Creates a new screen to display. 
		MyScreen newScreen = new MyScreen("Robo Reader");
		newScreen.setSize(500,500); //Sets the size of the new screen.
		newScreen.setLocation(470,120); //Sets the location of the new screen of the screen.
		newScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Sets the close operation.
	}
}
