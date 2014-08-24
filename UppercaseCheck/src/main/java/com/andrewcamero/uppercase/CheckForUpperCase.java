package com.andrewcamero.uppercase;

public class CheckForUpperCase {

	public boolean isFirstLetterUpperCase (String word){
		if (Character.isUpperCase(word.charAt(0))){
			return true;
		}
		else{
			return false;
		}
	}
	
}
