// 20141213-006: Move all JDBC DAO classes into package: com.jdbcstarter.simpleab.dao
package com.jdbcstarter.simpleab.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.hibernateclass.simpleab.dao.PersonDao;
import com.hibernateclass.simpleab.model.Person;


public class PersonDaoJdbcImpl implements PersonDao {
	private static final Logger logger = Logger.getLogger(PersonDaoJdbcImpl.class);

	@Override
	public void persist(Person person) {
        try {
			Class.forName("com.mysql.jdbc.Driver");
			logger.trace("JDBC driver loaded");

			String url = "jdbc:mysql://localhost/simpleaddress";
			Connection con = DriverManager.getConnection(url, "root", "password");
			logger.trace("Database connection established");
			
			java.sql.Date sqlDate = new java.sql.Date(person.getDob().getTime());
			logger.trace("java.sql.Date for dob: " + sqlDate);
            // Using Statement ******************************
            Statement stmt1 = con.createStatement();
            String insertSql = "INSERT INTO persontbl VALUES (NULL,";
            insertSql += "'" + person.getFirstName() + "',";
            insertSql += "'" + person.getLastName() + "',";
            insertSql += "'" + person.getGender() + "', ";
            insertSql += "'" + sqlDate + "',";
            insertSql += "'" + person.getEmail() + "')";
// 20141213-004: Converted debugging sysout statements to logger.debug()
            logger.debug("\n    SQL Statement: " + insertSql);
            int i = stmt1.executeUpdate( insertSql );
            logger.trace("Inserted: row OK using Statement."  + i + " row(s)");
                   
            logger.trace("Inserted: row OK using Prepared Statement.");

            stmt1.close();
            con.close();

		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
			
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		
	}

	@Override
	public Person get(String firstName, String lastName) {
		Person person = null;
		final String GET_SQL = "SELECT id, firstname, lastname, gender, dob, email FROM persontbl WHERE firstname like ? and lastname like ?";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			logger.trace("JDBC driver loaded");

			String url = "jdbc:mysql://localhost/simpleaddress";
			Connection con = DriverManager.getConnection(url, "root", "password");
			logger.trace("Database connection established");
			
			logger.debug("\n   SQL Statement: " + GET_SQL + " for " + firstName + "," + lastName);
			PreparedStatement stmt = con.prepareStatement(GET_SQL);
			stmt.setString(1, firstName);
            stmt.setString(2, lastName);
			ResultSet rs = stmt.executeQuery();
			logger.trace("Got some results:");

			while (rs.next()) {
				int a = rs.getInt(1);
				String b = rs.getString("firstname");
				String c = rs.getString(3);
				String d = rs.getString(4);
				java.sql.Date e = rs.getDate(5);
				String f = rs.getString("email");
				
				person = new Person();
				person.setId(a);
				person.setFirstName(b);
				person.setLastName(c);
				person.setGender(d);
				person.setGender(d);
				person.setDob(e);
				person.setEmail(f);
			}
			stmt.close();
			con.close();

		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		return person;
	}

	@Override
	public void update(Person person) {
		final String UPDATE_SQL = "INSERT INTO persontbl VALUES (?,?,?,?,?,?)";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			logger.trace("JDBC driver loaded");

			String url = "jdbc:mysql://localhost/simpleaddress";
			Connection con = DriverManager.getConnection(url, "root", "password");
			logger.trace("Database connection established");
          
			java.sql.Date sqlDate = new java.sql.Date(person.getDob().getTime());
			logger.trace("java.sql.Date for dob: " + sqlDate);
			
			logger.debug("\n    SQL Statement: " + UPDATE_SQL + "\n   for " + person);
            //Using Prepared Statement **********************
            PreparedStatement stmt = con.prepareStatement(UPDATE_SQL);
            stmt.setInt(1, person.getId());
            stmt.setString(2, person.getFirstName());
            stmt.setString(3, person.getLastName());
            stmt.setString(4, person.getGender());
            stmt.setDate(5, sqlDate );
            stmt.setString(6, person.getEmail());

            stmt.executeUpdate();
            logger.trace("Inserted: row OK using Prepared Statement.");

            stmt.close();
            con.close();

		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
			
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		

	}

	@Override
	public void delete(Person person) {
		final String DELETE_SQL = "DELETE FROM persontbl WHERE id=?";
		int rowCount=0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			logger.trace("JDBC driver loaded");

			String url = "jdbc:mysql://localhost/simpleaddress";
			Connection con = DriverManager.getConnection(url, "root", "password");
			logger.trace("Database connection established");
            logger.debug("\n    SQL Statement: " + DELETE_SQL.replace("?", person.getId()+""));
			PreparedStatement stmt = con.prepareStatement(DELETE_SQL);
			stmt.setInt(1, person.getId());
			rowCount = stmt.executeUpdate();
            logger.trace("Deleted: " + rowCount + " row(s) OK using Prepared Statement.");
            
            stmt.close();
            con.close();

		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
			
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
	}

	@Override
	public List<Person> list() {
		ArrayList<Person> people = new ArrayList<Person>();
		Person person = null;
		Statement stmt = null;
		ResultSet rs = null;
		final String LIST_SQL = "select * from persontbl";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			logger.trace("JDBC driver loaded");

			String url = "jdbc:mysql://localhost/simpleaddress";
			Connection con = DriverManager.getConnection(url, "root", "password");
			logger.trace("Database connection established");
          
			logger.debug("\n    SQL Statement: " + LIST_SQL);
			stmt = con.createStatement();
			rs = stmt.executeQuery(LIST_SQL);

			while (rs.next()){
				person = new Person();
				person.setId(rs.getInt("id"));
				person.setFirstName(rs.getString("firstname"));
				person.setLastName(rs.getString("lastname"));
				person.setDob(rs.getDate("dob"));
				person.setGender(rs.getString("gender"));
				person.setEmail(rs.getString("email"));
				people.add(person);
				logger.trace("Adding to people: " + person.toString());
			}
			
			stmt.close();
            con.close();

		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
			
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		return people;
	}

}
