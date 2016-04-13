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
 	~ This class contains all the code which is needed to scan the documents.							|
 	~ There is a fileRead method which reads the file the user selects when  							|
 	  they select it from the browse button.															|
 	~ The fileRead method also scans the file and counts the number of times a 							|
 	  is in the text file that is selected.																|
 	~ The results are then displayed on the screen for the user to see.								|
 	-----------------------------------------------------------------------------------------------------
*/

package com.assignment.java; //This is the name of the package this code is stored in.

//My import functions.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

import java.util.ArrayList;

public class FileMngr 
{//Start
	
	//wordCount holds the number of certain words in the file in the Array list
	static ArrayList<Integer> wordCount = new ArrayList<Integer>();
	//textWords holds the words from the file in the Array list
	static ArrayList<String> textWords = new ArrayList<String>();
	//list holds the scan results
	static ArrayList<String> list = new ArrayList<String>();
	
	//FileRead method
	public static void fileRead(File myFile2)throws FileNotFoundException
	{
		Scanner inputScan = new Scanner(myFile2); //Scans the file for input
		int search; //Variable to search for the words
		String keep; //Variable to keep the words
		boolean newWord; //Adds new words
		
		//loads just the first word from the file in to get started
		keep = inputScan.next(); //Read in the word
		keep = keep.replaceAll("[^a-zA-Z]+", ""); //Changes everything except the letters
		keep = keep.toLowerCase(); //All upper case are converted to lower case
		wordCount.add(1); //Adds to the word count
		textWords.add(keep); //Adds word to the textWord to keep
		
		//while there are still words in the file(selects the next word)
		while(inputScan.hasNext())
		{
			newWord = true; //True because there is more words
			search = 0; //Search is set to 0, word may not be in file
			
			keep = inputScan.next(); //Reads in the word
			keep = keep.replaceAll("a-zA-Z0-9]+", ""); //Changes everything except the letters
			keep = keep.toLowerCase(); //All upper case are converted to lower case
			
			//Goes through the words array list
			for  (String string : textWords)
			{
				//if the word is found somewhere in the ArrayList, increment and say that it was found
				if (string.equals(keep))
				{
					int val = wordCount.get(search);
					val++;
					wordCount.set(search, val);
					newWord = false;
				}//End if()
				
				search++; //moves on to the next
			}//End for()
			
			//Adds found words to the Arrayist
			if (newWord)
			{
				textWords.add(keep); //Adds word to the arraylist
				wordCount.add(1); //Adds one to the word it has found
			}//End if()
		}//End while()
		
		StringBuilder list = new StringBuilder(" ");
	
		//This for loop scans the size of the word
		for (int i = 0; i<textWords.size(); i++)
		{
			//Joins the the textWords array list with the wordCount array list
			list.append(textWords.get(i) + ": " + wordCount.get(i) +  "\n\t"); 
		}//End for()
		
		//Displays the following messages on screen
		JOptionPane.showMessageDialog(null, "Results from Scan!\nPress OK");
		JOptionPane.showMessageDialog(null, list.toString());
		
		inputScan.close(); //Close the scanning process
		
	}//End fileRead
}//End FileMngr

