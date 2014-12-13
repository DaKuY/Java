package com.hibernateclass.simpleab.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.hibernateclass.simpleab.model.Person;

public class PersonDaoJdbcImpl implements PersonDao {

	@Override
	public void persist(Person person) {
        try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("JDBC driver loaded");

			String url = "jdbc:mysql://localhost/simpleaddress";
			Connection con = DriverManager.getConnection(url, "root", "password");
			System.out.println("Database connection established");

            
            
            
            // Using Statement ******************************
            Statement stmt1 = con.createStatement();
            String insertSql = "INSERT INTO persontbl VALUES (NULL,";
            insertSql += "'" + person.getFirstName() + "',";
            insertSql += "'" + person.getLastName() + "',";
            insertSql += "'" + person.getGender() + "',";
            insertSql += "'" + person.getDob() + "',";
            insertSql += "'" + person.getEmail() + "')";
            
            int i = stmt1.executeUpdate( insertSql );
            System.out.println("Inserted: row OK using Statement."  + i + " row(s)");
            
            
            
            
            System.out.println("Inserted: row OK using Prepared Statement.");

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
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("JDBC driver loaded");

			String url = "jdbc:mysql://localhost/simpleaddress";
			Connection con = DriverManager.getConnection(url, "root", "password");
			System.out.println("Database connection established");

			Statement stmt = con.createStatement();
			ResultSet rs = stmt
					.executeQuery("SELECT id, firstname, lastname, gender, dob, email FROM persontbl");
			System.out.println("Got some results:");

			while (rs.next()) {
				int a = rs.getInt(1);
				String b = rs.getString("firstname");
				String c = rs.getString(3);
				String d = rs.getString(4);
				Date e = rs.getDate(5);
				String f = rs.getString("email");

				Person person = new Person();
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
		return null;
	}

	@Override
	public void update(Person person) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("JDBC driver loaded");

			String url = "jdbc:mysql://localhost/simpleaddress";
			Connection con = DriverManager.getConnection(url, "root", "password");
			System.out.println("Database connection established");
          
            //Using Prepared Statement **********************
            PreparedStatement stmt = con.prepareStatement("INSERT INTO persontbl VALUES (?,?,?,?,?,?)");
            stmt.setInt(1, person.getId());
            stmt.setString(2, person.getFirstName());
            stmt.setString(3, person.getLastName());
            stmt.setString(4, person.getGender());
            stmt.setDate(5, (Date) person.getDob());
            stmt.setString(6, person.getEmail());

            stmt.executeUpdate();
            System.out.println("Inserted: row OK using Prepared Statement.");

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
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("JDBC driver loaded");

			String url = "jdbc:mysql://localhost/simpleaddress";
			Connection con = DriverManager.getConnection(url, "root", "password");
			System.out.println("Database connection established");
          
            //Using Prepared Statement **********************
            //.....
			//.....

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
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("JDBC driver loaded");

			String url = "jdbc:mysql://localhost/simpleaddress";
			Connection con = DriverManager.getConnection(url, "root", "password");
			System.out.println("Database connection established");
          
            //Using Prepared Statement **********************
            //.....
			//.....

            con.close();

		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
			
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		return people;
	}

}
