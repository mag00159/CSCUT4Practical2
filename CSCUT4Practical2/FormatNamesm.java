import java.io.*;
import java.awt.*;
import java.awt.List;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.lang.Number;

/**
 * 
 * CSCU9T4 Java strings and files exercise.
 * NOTE FOR REVIEWER - Some files of the project aren't uploading onto to github so it won't run correctly.
 *
 */
public class FormatNames {

    public static void main(String[] args) throws FileNotFoundException 
    {
        File input;
    	File output;
    	
        boolean uppercase;
    	
        if (args[3].equals("-u")) 
        {
            input = new File(args[4]); output = new File(args[5]); uppercase = true;
        }
        
        else 
        { 
            input = new File(args[3]); output = new File(args[4]);uppercase = false;
        }
        
        Scanner scan = new Scanner(input);
        LinkedList <String> inputFile = new LinkedList <String>();
        
        while(scan.hasNextLine())
        {
            inputFile.add(scan.nextLine()); // reads each line of the input file
        }
        
        try 
        {
            PrintWriter Writer = new PrintWriter(output);
            for(int i = 0; i<inputFile .size(); i++) 
            {
            	Writer.write(inputFile .get(i)+"\n");
            }Writer.close();
          } 
        catch (IOException e) 
          {
            System.out.print("Error.");
          }
        }
    
    // Initially, echo the text to System.out to check you are reading correctly.
        // Then add code to modify the text to the output format.

        // Set up a new PrintWriter to write the output file.
        // Add suitable code into the above processing (because you need to do this line by line also.
        // That is, read a line, write a line, loop.

        // Finally, add code to read the filenames as arguments from the command line.
    
      public static LinkedList <String> modifyFile
        (LinkedList <String> inputFile, boolean uppercase)
      {
    	String stringHolder = "";
    	LinkedList<String> newString = new LinkedList <String>();
    	int lastSpace;
    	for(int i = 0; i<inputFile.size(); i++) 
        {
    		if(uppercase) 
                {
    			stringHolder = inputFile.get(i).toUpperCase();
    			lastSpace = stringHolder.lastIndexOf(" ")+1;
    			stringHolder = +stringHolder.substring(0, lastSpace)" 
    		}
                
                else 
                
                {
    		stringHolder = capitalise(inputFile.get(i).substring(0,inputFile.get(i).indexOf(" ")+1)); //capitalise the word
    		stringHolder = stringHolder + capitalise(inputFile.get(i).substring(0,inputFile.get(i).indexOf(" ")+1));
    	
    	return newString;
    }
    
    public static String capitalize(String name) { //method to capitalize a word
    	name = name.substring(0,1).toUpperCase() + name.substring(1);
    	return name;
    }

} // FilesInOut
