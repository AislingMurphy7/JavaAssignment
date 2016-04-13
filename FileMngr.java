/* -----------------------------------------------------------------------------------------------------
   	Aisling Murphy 																						|
   	C14343571       																					|
 	Java Assignment 																					|
    ----------------------------------------------------------------------------------------------------|  
 	Robo-Reader 																						|
 	~ This program is a program written in Java. The program uses user input to get a file from the 	|
 	  user by using the browse button. The user selects the file they wish to open and the program 		|
 	  opens the	file and reads it. It then scans the file the user has selected and counts the most		|
 	  common words within the file and displays them in order of popularity.							|
 	----------------------------------------------------------------------------------------------------|
 	~ This FileMngr class contains all the code which is needed to scan the text files.					|
 	~ There is a fileRead method which reads the file which the user selects when using the 			|
 	  browse button.																					|
 	~ The fileRead method also scans the file and counts the number of times a word						|
 	  is in the text file that the user has selected. It also sorts the array lists and					|
 	  places then in order of popularity.																|
 	~ The results are then displayed on the screen for the user to see.									|
 	-----------------------------------------------------------------------------------------------------
*/

package com.assignment.java; //This is the name of the package this code is stored in

//My import functions
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

import java.util.ArrayList;

public class FileMngr 
{
	/*wordCount holds a number which represents the amount of times a certain word
	Appears in the file.*/
	static ArrayList<Integer> wordCount = new ArrayList<Integer>();
	//textWords holds the words from the file that is scanned
	static ArrayList<String> textWords = new ArrayList<String>();
	//list holds the scan results which is displayed to the user
	static ArrayList<String> list = new ArrayList<String>();
	
	//FileWork method
	public static void fileWork(File myFile2)throws FileNotFoundException
	{
		Scanner inputScan = new Scanner(myFile2); //Scans the file for input
		
		int search; //Variable to search for the words
		String keep; //Variable to keep the words
		boolean newWord; //New word? (T/F)
		
		//loads just the first word from the file in to get started
		keep = inputScan.next(); //Read in the word
		keep = keep.toLowerCase(); //All upper case are converted to lower case
		wordCount.add(1); //Adds to the wordCount array list
		textWords.add(keep); //Adds word to the textWord array list
		
		//while there are still words in the file(selects the next word)
		while(inputScan.hasNext())
		{
			newWord = true; //True because there is more words
			search = 0; //Search is set to 0, word may not be in file
			int val;
			
			keep = inputScan.next(); //Reads in the word
			keep = keep.toLowerCase(); //All upper case are converted to lower case
			
			for  (String string : textWords)
			{
				//if the word is found, increment and say that it was found
				if (string.equals(keep))
				{
					val = wordCount.get(search);
					val++;
					wordCount.set(search, val);
					newWord = false;
				}//End if()
				
				search++; //moves on to the next
			}//End for()
			
			//Adds new found words to the Array list
			if (newWord)
			{
				textWords.add(keep); //Adds word to the array list
				wordCount.add(1); //Adds one to the word it has found
			}//End if()
		}//End while()
		
		//Sorts the array lists 
		boolean notSorted;
		boolean swapNotMade;
		//Temporary variables
		String wordTemp;
		int countTemp;
		
		notSorted = true; //Array list is not sorted
		
		//While the array lists are not sorted
		while(notSorted)
		{
			swapNotMade = true; //No swap occurred
			for (int i = 0; i < wordCount.size()-1; i++)
			{
				//If a number that's later in the list is bigger than the one before it, swap them
				if(wordCount.get(i) < wordCount.get(i+1))
				{
					//use Temporary variables to swap the data
					countTemp = wordCount.get(i+1);
					wordCount.set(i+1, wordCount.get(i));
					wordCount.set(i, countTemp);
					
					//use Temporary variables to swap the data
					wordTemp = textWords.get(i+1);
					textWords.set(i+1, textWords.get(i));
					textWords.set(i, wordTemp);
					
					swapNotMade = false; //Swap has occurred
				}//End if()
			}//End for()
			
			//If a swap is not made in the array lists
			if (swapNotMade)
			{
				notSorted = false; //Then the file hasn't been sorted.
			}//End if()
		}//End while()
		
		StringBuilder list = new StringBuilder(); 
	
		//This for loop scans the size of the word
		for (int i = 0; i<textWords.size(); i++)
		{
			//Joins the textWords array list with the wordCount array list
			list.append(textWords.get(i) + " (" + wordCount.get(i) +  ")\n\t"); 
			
		}//End for()
		
		//Displays the following messages on screen
		JOptionPane.showMessageDialog(null, "Results from Scan.");
		JOptionPane.showMessageDialog(null, "Press ok to view results.");
		//Prints the array List containing the results of the scan
		//Displays how many times a word was found
		JOptionPane.showMessageDialog(null, list.toString());

		inputScan.close(); //Close the scanning process
	}//End fileRead
}//End FileMngr

