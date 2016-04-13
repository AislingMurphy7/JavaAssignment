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

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MyScreen extends JFrame implements ActionListener
{
	
	static ArrayList<Integer> wordCount = new ArrayList<Integer>();
	static ArrayList<String> textWords = new ArrayList<String>();
	static ArrayList<String> list = new ArrayList<String>();
	
	JTextField text; //Text box
	JButton button, browse; //Scan button, Browse button.
	JLabel Label, Label1; //Text
	File myFile;
	
	public MyScreen(String title)
	{
		super(title); //Title for the screen
		setLayout(new FlowLayout()); //Sets the Layout of the screen
		
		//Will add the label and will display the message on the screen
		Label = new JLabel("Welcome to Robo-Reader!");
		add(Label); //Add the label to the screen
		
		//Will display the message on screen.
		Label1 = new JLabel("Please Select a File that you would like to search!");
		add(Label1); //Add the label to the screen
		
		//Text field will get the file name and place it here
		//"File Name" will be displayed in the text box when the program first runs
		text = new JTextField("File Name");
		text.setPreferredSize(new Dimension(200,30)); //Sets the size of the text box
		add(text); //Add the text box to the screen
	
		//Browse button will allow the user to browse files. 
		browse = new JButton("Browse Files");
		browse.addActionListener(this); //Action listener is add to the button
		add(browse); //Add the button to the screen
		
		// button will allow the user to scan a certain file
		button = new JButton("Scan Files");
		button.addActionListener(this); //Action listener is add to the button
		add(button); //Add the button to the screen
		
		//Both the button and the browse have action listener
		//So need to be able to differentiate from them.
		//Will use Switch statement
		browse.setActionCommand("1"); //Browse button will be set to Case: "1"
		button.setActionCommand("2"); //Scan button will be set to Case: "2"
		
		setVisible(true); //Allows the screen to display.
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		String Action = e.getActionCommand();
		
		FileMngr FileManager = new FileMngr();
		
		switch(Action)
		{
			//Browse Button
			case "1":
				//Takes path and places it in text box
				JFileChooser path = new JFileChooser();
				FileNameExtensionFilter txtFilter = new FileNameExtensionFilter("TEXT FILES", "txt", "text");
				path.setFileFilter(txtFilter);
				int value = path.showOpenDialog(this);
				if (value == JFileChooser.APPROVE_OPTION)
				{
					myFile = path.getSelectedFile();
					text.setText(myFile.getName());
					JOptionPane.showMessageDialog(this, "Opening File! ");
				}
				else
				{
					JOptionPane.showMessageDialog(this, "Process has been Terminated.");
				}
				break;
			
			//Scan button
			case "2":
				JOptionPane.showMessageDialog(this, "Scanning File");
				FileMngr file = new FileMngr();
				try 
				{
					textWords.clear();
					wordCount.clear();
					list.clear();
					
					FileMngr.fileRead(myFile);
				}
				catch (IOException e1) 
				{
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(this, "ERROR!: " + e1);
				}
				break;
		}
	}

}

