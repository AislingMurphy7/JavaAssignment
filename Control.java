/* -----------------------------------------------------------------------------------------------------
   	Aisling Murphy 																						|
   	C14343571       																					|
 	Java Assignment 																					|
    ----------------------------------------------------------------------------------------------------|  
 	Robo-Reader 																						|
 	~ This program is a program written in Java. The program uses user input to get a file from the 	|
 	  user by using the browse button. the user selects the file they wish to open and the program 		|
 	  opens the	file and reads it. It then scans the file the user has selected and counts the most		|
 	  common words within the file and displays them.													|
 	----------------------------------------------------------------------------------------------------|
 	~ This class is the control class.																	|
 	~ This class contains the code that creates the screen that will display.							|
 	~ Also contains the code that sets the size of the screen and the location of the new screen 		|
 	  on the computer screen.																			|
 	-----------------------------------------------------------------------------------------------------
*/

package com.assignment.java; //This is the name of the package this code is stored in.

public class Control 
{
	public static void main(String[] args)
	{
		MyScreen newScreen = new MyScreen("Robo Reader");
		newScreen.setSize(500,500); //Sets the size of the new screen.
		newScreen.setLocation(470,120); //Sets the location of the new screen of the screen.
	}//End main()
}//End control
