# JavaAssignment

Robo Reader program for Java Assignment 2016.

For my Assignment I chose to do the Robo-Reader option.

The program will read a file which is selected by the user and display words that will suggest what the text file is about, 
the text file that the user selects will be read and scanned and the words that repeat will be counted.
The results will then be displayed on screen for the user to see, it is up to the user to decide was the document is about.

When the Program is ran, it displays an interface with two buttons and a textfield.
The two button are labeled as 'Browse' and 'Scan file'. 
The user selects 'Browse' and this opens up another window where the user selects the file they wish to open. 
This will run code located in the FileMngr class which will read the selected file
The program will only open 'doc', 'txt' and 'text' files. 
The program will then display two messages saying 'Opening File' the user will then
click 'ok' and the second message will appear saying 'Press 'Scan file' to continue" button. Press 'ok'. 
The user will then press the scan button, which will display a message saying 'Scanning selected file'. 
Another message will appear saying 'Results from Scan' then 'Press ok to view results'.
The Results will then display on screen with a number beside each word representing the number of times the word is repeated in the text
file.

My Program is made up of a control class called Control, A GUI class called MyScreen and a file manager class called FileMngr.

The MyScreen class implements the buttons and textfield. 
I had to implement a switch statement because i had two action listners on my Browse button and on my scan button. 
I needed to differentiate between them because obviously they do different things in the program. 

The Control class simply sets the size and the location of the GUI on screen.

The FileMngr class contains all the code that is needed to read file and to scan the file for words, which in turn counts the number
of repeated words. This class also displays the results to the user. I also attempted to sort the words from most popular to least popular in this class.

