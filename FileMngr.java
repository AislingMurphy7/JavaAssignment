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
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

import java.util.ArrayList;

public class FileMngr 
{
	//private static Scanner input; 
	static ArrayList<Integer> wordCount = new ArrayList<Integer>();
	static ArrayList<String> textWords = new ArrayList<String>();
	static ArrayList<String> list = new ArrayList<String>();
	
	public static void fileRead(File myFile2)throws FileNotFoundException
	{
		Scanner inputScan = new Scanner(myFile2);
		String keep;
		int search;
		boolean newWord;
		
		//load just the first word in to get started
		keep = inputScan.next();
		keep = keep.replaceAll("[^a-zA-Z]+", "");
		keep = keep.toLowerCase();
		wordCount.add(1);
		textWords.add(keep);
		
		//while there are still words in the file
		while(inputScan.hasNext())
		{
			newWord = true;
			search = 0;
			
			//read in word, removes all but the letters and converts to lowercase
			keep = inputScan.next();
			keep = keep.replaceAll("a-zA-Z0-9]+", "");
			keep = keep.toLowerCase();
			
			//Goes through the words arraylist
			for  (String string : textWords)
			{
				//if the word was fount somewhere in the ArrayList, increment and say that it was found
				if (string.equals(keep))
				{
					int val = wordCount.get(search);
					val++;
					wordCount.set(search, val);
					newWord = false;
				}
				
				search++;
			}
			
			//if the word was not found in the Arrayist
			if (newWord)
			{
				textWords.add(keep);
				wordCount.add(1);
			}
		}
		
		int line = 0;
		StringBuilder list = new StringBuilder(" ");
		
		//print results
		
		for (int i = 0; i<textWords.size(); i++)
		{
			list.append(textWords.get(i) + ":" + wordCount.get(i) +  "\n\t");
			line++;
			
			if(line > 2)
			{
				line = 0;
			}
		}
		list.append(" ");
		
		JOptionPane.showMessageDialog(null, list.toString(), "Results from Scan", JOptionPane.INFORMATION_MESSAGE);
		
		inputScan.close();
		
	}
}

