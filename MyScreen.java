////////////////////////
///  Aisling Murphy  ///
///  C14343571       ///
///  Java Assignment ///
///        -         ///
///  Robo-Reader     ///
////////////////////////

package com.assignment.java;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyScreen extends JFrame implements ActionListener
{
	JTextField text; //Text box
	JButton button; //Button
	
	public MyScreen(String title)
	{
		super(title);
		setLayout(new FlowLayout());
		
		text = new JTextField("Please enter file name here...", 20);
		text.addActionListener(this);
		add(text);
		
		button = new JButton("Click here to run Robo-Reader!");
		button.addActionListener(this);
		add(button);
		
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		// TODO Auto-generated method stub
		
	}

}
