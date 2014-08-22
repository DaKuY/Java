package com.andrewcamero.iterate;

import java.util.ArrayList;
import java.util.List;

import com.andrewcamero.output.Print;

public class Iteration {
	
	public void findMultiples(int number1, int number2, int iterationStartNumber, int iterationEndNumber){
		
		Print print = new Print();
		List<String> message = new ArrayList<>();
		
		for(int i=iterationStartNumber;i <=iterationEndNumber; i++){
			
			if(((i % number1) == 0) && ((i % number2) == 0)){
				message.add(i + " is a multiple of " + number1 + " and " + number2 + "!");
			}
			else if ((i % number1) == 0) {
				message.add(i + " is a multiple of " + number1 + "!");
			}
			else if ((i % number2) == 0) {
				message.add(i + " is a multiple of " + number2 + "!");
			}
			
		}
		
		print.printToConsole(message);
		
	}

}
