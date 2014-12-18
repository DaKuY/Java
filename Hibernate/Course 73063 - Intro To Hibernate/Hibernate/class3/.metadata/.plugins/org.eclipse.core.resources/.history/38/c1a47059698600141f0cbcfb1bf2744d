package com.hibernateclass.simpleab.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.hibernateclass.simpleab.dao.PersonDao;
import com.hibernateclass.simpleab.model.Person;
import com.jdbcstarter.simpleab.dao.PersonDaoJdbcImpl;

public class PersonServiceImpl implements PersonService {
	private final static Logger logger = Logger.getLogger(PersonServiceImpl.class);
	PersonDao personDao = new PersonDaoJdbcImpl();

	public PersonServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void save(Person person) {
		if (0 == person.getId()) personDao.persist(person);
		else personDao.update(person);
		logger.trace("Persisted: " + person);
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

}
