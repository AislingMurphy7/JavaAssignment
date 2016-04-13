////////////////////////
///  Aisling Murphy  ///
///  C14343571       ///
///  Java Assignment ///
///        -         ///
///  Robo-Reader     ///
////////////////////////

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
		
		
	}

}

