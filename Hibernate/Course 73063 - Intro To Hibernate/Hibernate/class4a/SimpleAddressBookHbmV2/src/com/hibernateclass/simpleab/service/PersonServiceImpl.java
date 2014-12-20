package com.hibernateclass.simpleab.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;

import com.hibernateclass.simpleab.dao.PersonDao;
import com.hibernateclass.simpleab.dao.PersonDaoHbmImpl;
import com.hibernateclass.simpleab.model.Person;
import com.jdbcstarter.simpleab.dao.PersonDaoJdbcImpl;

public class PersonServiceImpl implements PersonService {
	private final static Logger logger = Logger.getLogger(PersonServiceImpl.class);
	PersonDao personDao = new PersonDaoHbmImpl();
	
	// *** Uncomment this if you use JDBC
	//PersonDao personDao = new PersonDaoJdbcImpl();

	public PersonServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int save(Person person) {
		if (0 == person.getId()) personDao.persist(person);
		else personDao.update(person);
		logger.trace("Persisted: " + person);
		return 0;
	}

	@Override
	public Person get(Person person) {
		Person returnPerson = personDao.get(person.getFirstName(), person.getLastName());
		logger.trace("Retrieved: " + returnPerson);		
		return returnPerson;
	}

	@Override
	public List<Person> list() {
		ArrayList<Person> people = (ArrayList<Person>) personDao.list();
		logger.debug("people list() size is " + people.size());
		return people;
	}

	@Override
	public void remove(Person person) {
		personDao.delete(person);
		logger.trace("Deleted: " + person);
	}
	
	public int calculateAgeToday(Date date) {
		Date today = Calendar.getInstance().getTime();
		long msDiff = today.getTime() - date.getTime();
		int yearDiff = (int)(msDiff / 1000 / 60 / 60 / 24 / 365.25);
		return yearDiff;
	}

}
