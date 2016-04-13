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

package com.assignment.java;

import javax.swing.JFrame;

public class Control 
{
	public static void main(String[] args)
	{
		MyScreen newScreen = new MyScreen("Robo Reader");
		newScreen.setSize(500,500); //Sets size of the screen.
		newScreen.setLocation(470,120); //Sets the location on of the screen.
		newScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Sets the close operation.
	}
}
