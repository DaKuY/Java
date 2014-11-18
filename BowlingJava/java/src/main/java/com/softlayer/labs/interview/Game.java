package com.softlayer.labs.interview;

public class Game
{
	
	private Integer[] currentScore = new Integer[22];
	private int rollNumberIndex;
	private int finalScore;
	
	Game(){
		rollNumberIndex = 1;
		finalScore = 0;
		init();
	}
	
	public void init(){

		for(int i = 0; i<22 ; i++){
    		currentScore[i] = 0 ;
    	}
	}
	
    // Called for each roll of the bowling ball. Passed the number
    // of pins knocked down on this roll.
    public void roll(int pins) {
    	    	
    	/** Final rollNumberIndex **/
    	if (rollNumberIndex == 21){
    		currentScore[rollNumberIndex] = pins;
    	}
    	
    	else{
    		checkPinCount(pins);
    	}
    	
    	
    }
    
    public void checkPinCount(int pins){
    	
    	/** Spare or previous frame was a spare**/
    	if (rollNumberIndex % 2 != 0 && 
    			pins != 10 && 
    			rollNumberIndex > 2 &&
    			currentScore[rollNumberIndex - 2] + currentScore[rollNumberIndex - 1] == 10 &&
    			currentScore[rollNumberIndex - 2] != 10 ){
    		
    		addSpareScore(pins);
    		
    	}
    	
    	/** Strike or previous frame was a strike **/
    	else if(rollNumberIndex > 2 && (currentScore[rollNumberIndex - 3] == 10 || currentScore[rollNumberIndex - 1] == 10 || currentScore[rollNumberIndex - 2] == 10 || pins == 10)){
    		addStrikeScore(pins);
    	}
    	
    	/** anything else - not hitting spares or strikes **/
    	else{
    		currentScore[rollNumberIndex] = pins;
    	}
    	
    	rollNumberIndex ++;
    }
    
    public void addSpareScore(int pins){
    	
    	//check if the last rollNumberIndex was a strike
		if (currentScore[rollNumberIndex - 3] == 10){
			currentScore[rollNumberIndex - 3] += currentScore[rollNumberIndex - 1] + currentScore[rollNumberIndex];
		}else{
    		//split - adds pins to previous rollNumberIndex
			currentScore[rollNumberIndex-1] += pins;
		}
		
		//sets current rollNumberIndex
		currentScore[rollNumberIndex] = pins;   
    }
    
    public void addStrikeScore(int pins){
    	// previous rollNumberIndex was a strike
    	if (rollNumberIndex > 2 && currentScore[rollNumberIndex - 3] == 10){
    		//strike - adds pins to previous rollNumberIndex
    		currentScore[rollNumberIndex - 3] = currentScore[rollNumberIndex - 3] + currentScore[rollNumberIndex - 1] + pins;
    		    		    		
    		//sets current rollNumberIndex
    		currentScore[rollNumberIndex] = pins;
    	}
		
		// strike and the previous rollNumberIndex was a spare
		else if (rollNumberIndex > 2 && currentScore[rollNumberIndex - 2] + currentScore[rollNumberIndex - 1] == 10 && currentScore[rollNumberIndex - 2] != 10 && pins == 10) {
    		
    		//check if the last rollNumberIndex was a spare
    		if (currentScore[rollNumberIndex - 2] + currentScore[rollNumberIndex - 1] == 10){
    			currentScore[rollNumberIndex - 2] += pins;
    		}
    		//sets current rollNumberIndex
    		currentScore[rollNumberIndex] = pins;
    		
    	}else if (rollNumberIndex > 4 && currentScore[rollNumberIndex - 2] == 10 && pins == 10){
    		//strike - adds pins to previous rollNumberIndex
    		currentScore[rollNumberIndex - 2] += pins + pins;
    		//sets current rollNumberIndex
    		currentScore[rollNumberIndex] = pins;

    	}else if (rollNumberIndex > 2 && currentScore[rollNumberIndex - 2] == 10 && pins == 10){
    		//strike - adds pins to previous rollNumberIndex
    		currentScore[rollNumberIndex - 2] += pins;
    		//sets current rollNumberIndex
    		currentScore[rollNumberIndex] = pins;
    	}
    }
    
    

    // Called once at the end of the game.
    public int getScore() {
    	finalScore = 0;
    	for(int i = 1; i<22 ; i++){
    		finalScore += currentScore[i];
    	}    
    	
    	return finalScore;
    }
}
