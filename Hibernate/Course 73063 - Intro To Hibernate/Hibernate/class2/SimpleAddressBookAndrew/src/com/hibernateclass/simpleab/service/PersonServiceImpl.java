package com.hibernateclass.simpleab.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.hibernateclass.simpleab.model.Address;
import com.hibernateclass.simpleab.model.Person;

public class PersonServiceImpl implements PersonService {

	public PersonServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void save(Person person) {
		// TODO Auto-generated method stub
		System.out.println(person);

	}

	@Override
	public Person get(Person person) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> list() {
		// TODO Auto-generated method stub
		ArrayList<Person> people = new ArrayList<Person>();
		SimpleDateFormat sdf = new SimpleDateFormat("M-dd-yyyy hh:mm:ss");
		Person person = new Person();
		
		person.setFirstName("Tom");
		person.setLastName("Smith");
		person.setGender("M");
		person.setEmail("any@email.com");
		
		String dateInString = "01-15-1975 00:00:00";
		
		try {
			person.setDob(sdf.parse(dateInString));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		people.add(person);
		person = new Person();
		
		person.setFirstName("Judy");
		person.setLastName("Jones");
		person.setGender("F");
		person.setEmail("another@email.com");
		
		dateInString = "03-25-1968 00:00:00";
		
		try {
			person.setDob(sdf.parse(dateInString));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		people.add(person);
	
		return people;
	}

	@Override
	public void remove(Person person) {
		// TODO Auto-generated method stub

	}

}
