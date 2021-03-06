package com.andrewcamero.jdbc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.andrewcamero.jdbc.dao.DBConnection;

public class App {
	private static Logger logger = LogManager.getLogger(App.class);
	
	/*
	 * This program establishes a connection to the DB and runs SQL
	 */
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		DBConnection dbConnection = new DBConnection();
		dbConnection.start();
		
		long endTime = System.nanoTime();
		App.logger.debug("Took " + (endTime - startTime) / 1000000000L + "s");
	}

}
