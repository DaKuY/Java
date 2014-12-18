package com.hibernateclass.simpleab;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

import com.hibernateclass.simpleab.model.Address;
import com.hibernateclass.simpleab.model.Person;
import com.hibernateclass.simpleab.service.AddressService;
import com.hibernateclass.simpleab.service.AddressServiceImpl;
import com.hibernateclass.simpleab.service.PersonService;
import com.hibernateclass.simpleab.service.PersonServiceImpl;
import com.hibernateclass.simpleab.util.StrToDate;

public class AppMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

// 20141213-002: Added log4j
		final Logger logger = Logger.getLogger(AppMain.class);
		
/*******************************************************************
 * This app is really simple and provides a mock set of operations * 
 * to exercise our methods to access the database.                 *
 * Version 1 - Manual relationship between 1 Person and 1 Address. *
 *******************************************************************/

		
		Person person = new Person();
		Address address = new Address();
		PersonService personService = new PersonServiceImpl();
		AddressService addressService = new AddressServiceImpl();

// 20141213-009 Comment the following 7 lines NOT to reset peopletbl			
		List<Person> people = personService.list();
		if (people.size() > 0) {
			Iterator<Person> iterator = people.iterator();
			while (iterator.hasNext()) {
				personService.remove(iterator.next());
			}
		}
		

// 20141213-009 Comment the following 7 lines NOT to reset addresstbl 
		List<Address> locations = addressService.list();
		if (locations.size() > 0) {
			Iterator<Address> addressIterator = locations.iterator();
			while (addressIterator.hasNext()) {
				addressService.remove(addressIterator.next());
			}
		}
		

// EXERCISE: INSERT 'Tom','Smith','M', '1975-01-15','any@email.com' into database
		person.setFirstName("Tom");
		person.setLastName("Smith");
		person.setGender("M");
		person.setEmail("any@email.com");
// 20141213-001:			Fixed Date Format issue for inserting into DB and put in utility
		person.setDob(StrToDate.convert("01-15-1975"));
//20141217-001:			Fixed Age Bug		
		person.setAge(25);
				
		// Call ServiceLayer
		personService.save(person);
		
		address.setStreet("123 Street");
		address.setCity("Plano");
		address.setState("TX");
		address.setZipCode("75023");
		
		// We need the person id to save in the address.
		person = personService.get(person);
		address.setPersonId(person.getId());
		addressService.save(address);
		
// EXERCISE:  INSERT 'Judy','Jones','F', '1968-03-25','another@email.com' into database		
		person = new Person();
		address = new Address();
		person.setFirstName("Judy");
		person.setLastName("Jones");
		person.setGender("F");
		person.setDob(StrToDate.convert("03-25-1968"));
		person.setEmail("another@email.com");
		
		// Call ServiceLayer
		personService.save(person);
		
		address.setStreet("456 Avenue");
		address.setCity("Frisco");
		address.setState("TX");
		address.setZipCode("75034");
		
		person = personService.get(person);
		address.setPersonId(person.getId());
		addressService.save(address);
		
		
		people = personService.list();
// 20141213-005: Updated output statements to separate from logging better
		System.out.println("************************");
		System.out.println("List: people:\n" + (Arrays.toString(people.toArray())).replace("],", "],\n"));
		System.out.println("************************");
		locations = addressService.list();
		System.out.println("************************");
		System.out.println("List: locations:\n" + (Arrays.toString(locations.toArray())).replace("],", "],\n"));
		System.out.println("************************");


	}
	
		
	
}
