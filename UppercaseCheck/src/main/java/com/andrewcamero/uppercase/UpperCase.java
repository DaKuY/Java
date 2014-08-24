package com.andrewcamero.uppercase;

import com.andrewcamero.output.Print;

/**
 * Hello world!
 *
 */
public class UpperCase 
{
	static CheckForUpperCase check = new CheckForUpperCase();
	static Print print = new Print();
	private static String word = "Hello";
	
    public static void main( String[] args )
    {
    	
        if (check.isFirstLetterUpperCase(word)){
        	print.printToConsole(word + " begins with an uppercase letter.");
        }
        else{
        	print.printToConsole(word + " does NOT begin with an uppercase letter.");
        }
    }
}
