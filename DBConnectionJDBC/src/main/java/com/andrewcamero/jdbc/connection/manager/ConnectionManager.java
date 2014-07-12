package com.andrewcamero.jdbc.connection.manager;

import java.sql.DriverManager;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.logging.log4j.LogManager;
import java.sql.Connection;
import org.apache.logging.log4j.Logger;

/*
 * This Class establishes and closes the connection to the DB
 */

public class ConnectionManager
{
    private static Logger logger;
    private static Connection databaseConnection;
    
    /*
     * Establishes a connection to the DB
     * 
     * @param url location of the database
     * @param username 
     * @param password
     * @return		Connection to the DB
     */
    public static Connection getDBConnection( String url,  String username,  String password) {
        try {
            if (ConnectionManager.databaseConnection == null) {
                ConnectionManager.databaseConnection = DriverManager.getConnection(url, username, password);
                ConnectionManager.logger.debug("Connected to the DB");
            }
        }
        catch (Exception e) {
            ConnectionManager.logger.error(ExceptionUtils.getStackTrace(e));
        }
        return ConnectionManager.databaseConnection;
    }
    
    /*
     * Closes the Connection to the DB
     * @param connection name of the connection to be closed 
     */
    public static void closeConnection( Connection connection) {
        try {
        	connection.close();
        }
        catch (Exception e) {
            ConnectionManager.logger.error(ExceptionUtils.getStackTrace(e));
        }
    }
    
    /*
     * This main is used to test the connection ONLY
     */
    
//    public static void main( String[] aa) {
//    	Connection conn=null;
//		
//		try{
//			Class.forName("com.ibm.db2.jcc.DB2Driver");
//			conn = DriverManager.getConnection("jdbc:db2://","username","password");
//			System.out.println("Connected to the database");
//			
//		}catch(Exception e){
//			logger.error(ExceptionUtils.getStackTrace(e));
//		}
//		ConnectionManager.closeConnection(conn);
//    }
}