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

import com.hibernateclass.simpleab.dao.AddressDao;
import com.hibernateclass.simpleab.model.Address;

public class AddressDaoJdbcImpl implements AddressDao {
	private static final Logger logger = Logger.getLogger(AddressDaoJdbcImpl.class);
	@Override
	public void persist(Address address) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			logger.trace("JDBC driver loaded");

			String url = "jdbc:mysql://localhost/simpleaddress";
			Connection con = DriverManager.getConnection(url, "root", "password");
			logger.trace("Database connection established");
			
            // Using Statement ******************************
            Statement stmt1 = con.createStatement();
            String insertSql = "INSERT INTO addresstbl VALUES (";
            insertSql += "" + address.getPersonId()+ ",";
            insertSql += "'" + address.getStreet()+ "',";
            insertSql += "'" + address.getCity() + "',";
            insertSql += "'" + address.getState() + "', ";
            insertSql += "'" + address.getZipCode() + "')";
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
	public Address get(int personId) {
		Address address = null;
		final String GET_SQL = "SELECT person_Id, street, city, zipcode FROM addresstbl";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			logger.trace("JDBC driver loaded");

			String url = "jdbc:mysql://localhost/simpleaddress";
			Connection con = DriverManager.getConnection(url, "root", "password");
			logger.trace("Database connection established");

			logger.debug("\n   SQL Statement: " + GET_SQL);
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(GET_SQL);
			logger.trace("Got some results:");

			while (rs.next()) {
				int a = rs.getInt(1);
				String b = rs.getString("street");
				String c = rs.getString(3);
				String d = rs.getString(4);
				String e = rs.getString("zipcode");
				
				address = new Address();
				address.setPersonId(a);
				address.setStreet(b);
				address.setCity(c);
				address.setState(d);
				address.setZipCode(d);
			}
			stmt.close();
			con.close();

		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		return address;
	}

	@Override
	public void update(Address address) {
		final String UPDATE_SQL = "INSERT INTO addresstbl VALUES (?,?,?,?,?)";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			logger.trace("JDBC driver loaded");

			String url = "jdbc:mysql://localhost/simpleaddress";
			Connection con = DriverManager.getConnection(url, "root", "password");
			logger.trace("Database connection established");
          
			logger.debug("\n    SQL Statement: " + UPDATE_SQL + "\n   for " + address);
            //Using Prepared Statement **********************
            PreparedStatement stmt = con.prepareStatement(UPDATE_SQL);
            stmt.setInt(1, address.getPersonId());
            stmt.setString(2, address.getStreet());
            stmt.setString(3, address.getCity());
            stmt.setString(4, address.getState());
            stmt.setString(5, address.getZipCode());

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
	public void delete(Address address) {
		final String DELETE_SQL = "DELETE FROM addresstbl WHERE person_id=?";
		int rowCount=0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			logger.trace("JDBC driver loaded");

			String url = "jdbc:mysql://localhost/simpleaddress";
			Connection con = DriverManager.getConnection(url, "root", "password");
			logger.trace("Database connection established");
            logger.debug("\n    SQL Statement: " + DELETE_SQL.replace("?", address.getPersonId()+""));
			PreparedStatement stmt = con.prepareStatement(DELETE_SQL);
			stmt.setInt(1, address.getPersonId());
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
	public List<Address> list() {
		ArrayList<Address> addresses = new ArrayList<Address>();
		Address address = null;
		Statement stmt = null;
		ResultSet rs = null;
		final String LIST_SQL = "select * from addresstbl";
		
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
				address = new Address();
				address.setPersonId(rs.getInt("person_id"));
				address.setStreet(rs.getString("street"));
				address.setCity(rs.getString("city"));
				address.setState(rs.getString("state"));
				address.setZipCode(rs.getString("zipcode"));

				addresses.add(address);
				logger.trace("Adding to addresses: " + address.toString());
			}
			
			stmt.close();
            con.close();

		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
			
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		return addresses;
	}

}
