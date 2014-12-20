package com.hibernateclass.simpleab.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernateclass.simpleab.model.Address;
import com.hibernateclass.simpleab.model.Person;

public class AddressDaoHbmImpl implements AddressDao {
	private static final Logger logger = Logger.getLogger(AddressDaoHbmImpl.class);
	@Override
	public void persist(Address address) {
		Session session=null;
		Transaction tx=null;
		try{
			session  = HibernateUtil.getSessionFactory().openSession();
			tx = session.beginTransaction();
			tx.setTimeout(5);
			
			session.saveOrUpdate(address);
			
			if (!tx.wasCommitted())	tx.commit();
		} catch(RuntimeException e) {
			try{
				if ( tx != null) tx.rollback();
			} catch(RuntimeException rbe) {
				logger.error("Couldn't roll back transaction", rbe);
			}
			throw e;

		} finally{
			session.flush();
			session.clear();
			if (session!=null){
				session.close();
			}
		}
	}

	@Override
	public Address get(int personId) {
		Address address = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			address = (Address)session.get(Person.class, personId);
			logger.trace("get(person_id) found " + address);
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		session.close();
		return address;
	}

	@Override
	public void update(Address address) {
		this.persist(address);
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
		Session session = HibernateUtil.getSessionFactory().openSession();
		List<?> results = session.createQuery("FROM Address address").list();
		if (! results.isEmpty()) {
			for (Object a: results) {
				addresses.add((Address)a);
			}
		}
		session.close();
		return addresses;
	}
}
