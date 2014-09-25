package com.andrewcamero.arithmetic;

import java.util.List;

import com.andrewcamero.output.Print;

public class Addition {

		public void addList(List<Integer> intList){
			Print print = new Print();
			int total = 0;
			int count = 0;
			
			for(Integer i: intList){
				total += intList.get(count);
				count ++;
			}
			
			print.printToConsole("The total sum of the list is: " + total);
		}
}
