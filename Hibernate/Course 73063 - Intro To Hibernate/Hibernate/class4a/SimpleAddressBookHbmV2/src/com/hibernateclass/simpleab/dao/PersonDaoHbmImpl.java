// 20141213-006: Move all JDBC DAO classes into package: com.jdbcstarter.simpleab.dao
package com.hibernateclass.simpleab.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernateclass.simpleab.model.Person;


public class PersonDaoHbmImpl implements PersonDao {
	private static final Logger logger = Logger.getLogger(PersonDaoHbmImpl.class);

	@Override
	public int persist(Person person) {
		Session session=null;
		Transaction tx=null;
		int id;
		try{
			session  = HibernateUtil.getSessionFactory().openSession();
			tx = session.beginTransaction();
			tx.setTimeout(5);
			
			id = (Integer) session.save(person);
			
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
		return id;
	}

	@Override
	public Person get(String fName, String lName) {
		Person person = new Person();
		Session session = HibernateUtil.getSessionFactory().openSession();
		List<?> resultList = null;
		
		if (!(null == fName)  &&  !(null == lName)) {
			try {
				Query query = session.createQuery("select id FROM Person person WHERE person.firstName = :firstName and person.lastName = :lastName");
				query.setParameter("firstName", fName);
				query.setParameter("lastName", lName);
				resultList = query.list();
			} catch (HibernateException e) {
				e.printStackTrace();
			}
			logger.trace("****************************");
			logger.trace("get(firstName, lastName) found id=" + resultList.get(0));
			logger.trace("****************************");
			person.setId((Integer)(resultList.get(0)));
		}
		else{
			logger.debug("****************************");
			logger.debug("First Name and/or Last Name is null.");
			logger.debug("****************************");
		}
		logger.trace("get(" + person.getId() +")");
		try {
			person = (Person)session.get(Person.class, person.getId());
			logger.trace("get(firstName, lastName) found " + person);
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		session.close();
		return person;
	}

	@Override
	public void update(Person person) {
		Session session=null;
		Transaction tx=null;
		try{
			session  = HibernateUtil.getSessionFactory().openSession();
			tx = session.beginTransaction();
			tx.setTimeout(5);
			
			session.saveOrUpdate(person);
			
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
	public void delete(Person person) {
		Session session=null;
		Transaction tx=null;
		try{
			session  = HibernateUtil.getSessionFactory().openSession();
			tx = session.beginTransaction();
			tx.setTimeout(5);
			tx.begin();
			session.delete(person);
			
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
	public List<Person> list() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		List<?> results = session.createQuery("FROM Person person").list();
		List<Person> people = new ArrayList<Person>();
		if (! results.isEmpty()) {
			for (Object p: results) {
				people.add((Person)p);
			}
		}
		session.close();
		return people;
	}
}
