package com.andrewcamero.sum;

import java.util.ArrayList;
import java.util.List;

import com.andrewcamero.arithmetic.Addition;

/**
 * Sum of the numbers in a list
 *
 */
public class Sum 
{
	
	private static List<Integer> integerList = new ArrayList();
	
	
    public static void main( String[] args )
    {
    	integerList.add(100);
		integerList.add(25);
		integerList.add(75);
		integerList.add(50);
		integerList.add(50);
    	
        Addition add = new Addition();
        add.addList(integerList);
    }
}
