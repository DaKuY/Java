package com.softlayer.labs.interview;

public class Game
{
	
	private Integer[] currentScore = new Integer[22];
	private int frame;
	private int finalScore;
	
	Game(){
		frame = 1;
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
    	//currentScore += pins;
    	
    
    	
    	/** Final Frame **/
    	if (frame == 21){
    		currentScore[frame] = pins;
    	}
    	
    	/** Spare **/
    	else if (frame % 2 != 0 && 
    			pins != 10 && 
    			frame > 2 &&
    			currentScore[frame - 2] + currentScore[frame - 1] == 10 &&
    			currentScore[frame - 2] != 10 ){
    		
    		//check if the last frame was a strike
    		if (currentScore[frame - 3] == 10){
    			currentScore[frame - 3] += currentScore[frame - 1] + currentScore[frame];
    		}else{
        		//split - adds pins to previous frame
    			currentScore[frame-1] += pins;
    		}
    		
    		//sets current frame
    		currentScore[frame] = pins;    	
    		
    	}
    	
    	/** strike **/
	    		
		// previous frame was a strike
    	else if (frame > 2 && currentScore[frame - 3] == 10){
    		//strike - adds pins to previous frame
    		currentScore[frame - 3] = currentScore[frame - 3] + currentScore[frame - 1] + pins;
    		    		    		
    		//sets current frame
    		currentScore[frame] = pins;
    	}
		
		// strike and the previous frame was a spare
		else if (frame > 2 && currentScore[frame - 2] + currentScore[frame - 1] == 10 && currentScore[frame - 2] != 10 && pins == 10) {
    		
    		//check if the last frame was a spare
    		if (currentScore[frame - 2] + currentScore[frame - 1] == 10){
    			currentScore[frame - 2] += pins;
    		}
    		//sets current frame
    		currentScore[frame] = pins;
    		
    	}else if (frame > 4 && currentScore[frame - 2] == 10 && pins == 10){
    		//strike - adds pins to previous frame
    		currentScore[frame - 2] += pins + pins;
    		//sets current frame
    		currentScore[frame] = pins;

    	}else if (frame > 2 && currentScore[frame - 2] == 10 && pins == 10){
    		//strike - adds pins to previous frame
    		currentScore[frame - 2] += pins;
    		//sets current frame
    		currentScore[frame] = pins;
    	}
    		
    	
    	/** anything else - not hitting spares or strikes **/
    	else{
    		currentScore[frame] = pins;
    	}
    	
    	getScore();
    	
    	frame ++;
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
