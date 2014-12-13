package com.hibernateclass.simpleab.service;

import java.util.List;
import com.hibernateclass.simpleab.model.Person;

public interface PersonService {
	
	public void save(Person person);
	public Person get(Person person);
	public List<Person> list();
	public void remove(Person person);
	
}
