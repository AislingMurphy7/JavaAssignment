////////////////////////
///  Aisling Murphy  ///
///  C14343571       ///
///  Java Assignment ///
///        -         ///
///  Robo-Reader     ///
////////////////////////

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
