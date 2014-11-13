package com.softlayer.labs.interview;

import junit.framework.TestCase;
import java.util.ArrayList;

public class GameTest extends TestCase
{	
	private ArrayList<String> testCaseList = new ArrayList<String>();
	
	public void setAllTestCases(){
		/**T1 Test Case - Gutter**/
		testCaseList.add("T1");
		
		/**T2 Test Case - Non Gutter**/
		testCaseList.add("T2");
		
		/**T3 Test Case - Spare**/
		testCaseList.add("T3");
		
		/**T4 Test Case - Strike Mixed**/
		testCaseList.add("T4");
		
		/**T5 Test Case - Perfect Game**/
		testCaseList.add("T5");
	}
	
    public void testALL() {
        Game game = null;
        String input = null;
        Integer[] scoreBoard = new Integer[21];
               
        /** Enter Test Case Number Example: ("T1", "T2", "T3", "T4", "T5")**/
        /** To test all testcases change to "" **/ 
        String testCase = ""; 
           
        if(!testCase.equals("")){			//Runs One Test Case
        	game = new Game(); 
        	scoreBoard = getInput(testCase);
	        for(int i = 0; i < 21; i++) {
	        	game.roll(scoreBoard[i]);
	        }
	     endGame(testCase, game);
        }else{								//Runs All Tests Cases
        	setAllTestCases();
	        /** Iterates for each test case **/
	        for(String string: testCaseList){
	        	game = new Game(); 
	        	scoreBoard = getInput(string);
		        for(int i = 0; i < 21; i++) {
		        	game.roll(scoreBoard[i]);
		        }
		        endGame(string, game);
	        }
        }
             
    }
    
    public Integer[] getInput(String testCase){
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	Integer[] scoreBoard = new Integer[21];
    	
    	//scoreBoard[0] is the input
    	//scoreBoard[1] is the output
    	
    	if(testCase.equalsIgnoreCase("T1")){
        	/**T1 Test Case - Gutter**/
    		for(int i = 0; i < 21; i++) {
    			scoreBoard[i] = 0;
    		}
            
    	}else if(testCase.equalsIgnoreCase("T2")){
            /**T2 Test Case - Non Gutter**/
    		scoreBoard[0] = 1;
            scoreBoard[1] = 5;
            scoreBoard[2] = 1;
            scoreBoard[3] = 5;
            scoreBoard[4] = 1;
            scoreBoard[5] = 5;
            scoreBoard[6] = 1;
            scoreBoard[7] = 5;
            scoreBoard[8] = 1;
            scoreBoard[9] = 5;
            scoreBoard[10] = 1;
            scoreBoard[11] = 5;
            scoreBoard[12] = 1;
            scoreBoard[13] = 5;
            scoreBoard[14] = 1;
            scoreBoard[15] = 5;
            scoreBoard[16] = 1;
            scoreBoard[17] = 5;
            scoreBoard[18] = 1;
            scoreBoard[19] = 5;
            scoreBoard[20] = 0;
            
            
    	}else if(testCase.equalsIgnoreCase("T3")){
            /**T3 Test Case - Spare**/
    		for(int i = 0; i < 21; i++) {
    			scoreBoard[i] = 5;
    		}
            
    	}else if(testCase.equalsIgnoreCase("T4")){
            /**T4 Test Case - Strike Mixed**/
    		scoreBoard[0] = 0;
            scoreBoard[1] = 0;
            scoreBoard[2] = 10;
            scoreBoard[3] = 0;
            scoreBoard[4] = 3;
            scoreBoard[5] = 4;
            scoreBoard[6] = 10;
            scoreBoard[7] = 0;
            scoreBoard[8] = 5;
            scoreBoard[9] = 5;
            scoreBoard[10] = 0;
            scoreBoard[11] = 0;
            scoreBoard[12] = 7;
            scoreBoard[13] = 1;
            scoreBoard[14] = 7;
            scoreBoard[15] = 3;
            scoreBoard[16] = 10;
            scoreBoard[17] = 0;
            scoreBoard[18] = 0;
            scoreBoard[19] = 0;
            scoreBoard[20] = 0;
            
    	}else if(testCase.equalsIgnoreCase("T5")){
            /**T5 Test Case - Perfect Game**/
    		for(int i = 0; i < 17; i=i+2) {
    			scoreBoard[i] = 10;
    			scoreBoard[i+1] = 00;
    		}
    		scoreBoard[18] = 10;
            scoreBoard[19] = 10;
            scoreBoard[20] = 10;
    		
    	}else{
    		System.out.println("Please choose a corrent Test Case");
    	}
    	
    	return scoreBoard;    

    }
    
    public void endGame(String testCase, Game game){
    	// End of the game!
    	if(testCase.equalsIgnoreCase("T1")){
        	/**T1 Test Case - Gutter**/
    		 assertEquals(0, game.getScore());
            
    	}else if(testCase.equalsIgnoreCase("T2")){
            /**T2 Test Case - Non Gutter**/
    		assertEquals(60, game.getScore());
            
    	}else if(testCase.equalsIgnoreCase("T3")){
            /**T3 Test Case - Spare**/
    		assertEquals(150, game.getScore());
            
    	}else if(testCase.equalsIgnoreCase("T4")){
            /**T4 Test Case - Strike Mixed**/
    		assertEquals(92, game.getScore());
            
    	}else if(testCase.equalsIgnoreCase("T5")){
            /**T5 Test Case - Perfect Game**/
     		assertEquals(300, game.getScore());
    		
    	}else{
    		System.out.println("Please choose a corrent Test Case");
    	}
    	
    }
}
