package com.andrewcamero.iterate;

/**
 * Hello world!
 *
 */
public class App 
{
	
	private static int iterationStartNumber = 1;
	private static int iterationEndNumber = 100;
	private static int number1 = 3;
	private static int number2 = 5;
	
	/*
	 * 
	 */
    public static void main( String[] args )
    {
    	Iteration iterate = new Iteration();
    	iterate.findMultiples(number1, number2, iterationStartNumber, iterationEndNumber);
    }
}
