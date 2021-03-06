package com.hibernateclass.simpleab;

import java.util.Arrays;
import java.util.GregorianCalendar;
import org.apache.log4j.Logger;
import com.hibernateclass.simpleab.model.Address;
import com.hibernateclass.simpleab.model.Person;
import com.hibernateclass.simpleab.service.AddressService;
import com.hibernateclass.simpleab.service.AddressServiceImpl;
import com.hibernateclass.simpleab.service.PersonService;
import com.hibernateclass.simpleab.service.PersonServiceImpl;

public class AppMainHbM0Better {

	public static void main(String[] args) {
		final Logger logger = Logger.getLogger(AppMainHbM0Better.class);
		PersonService personService = new PersonServiceImpl();
		AddressService addressService = new AddressServiceImpl();

		logger.debug("Hibernate.cfg.xml and Annotation and DAO layer implemented.");
		
		Person p1 = new Person("Thomas", "Smith", 25, "M", new GregorianCalendar(1975,0,15).getTime(), "any@email.com");
		int id = personService.save(p1);
		Address address = new Address(id, "123 Street", "Plano", "Tx", "75023" );
		addressService.save(address);
				
		
		Person p2 = new Person("Judy","Jones",38,"F", new GregorianCalendar(1968,2,25).getTime(),"another@email.com");
		id = personService.save(p2);
		Address address2 = new Address(id, "456 Avenue", "Frisco", "Tx", "75034" );
		addressService.save(address2);
		
		System.out.println("\n************************");
		System.out.println("List: people:\n" + (Arrays.toString(personService.list().toArray())).replace("],", "],\n"));
		System.out.println("************************");

		System.out.println("\n************************");
		System.out.println("List: locations:\n" + (Arrays.toString(addressService.list().toArray())).replace("],", "],\n"));
		System.out.println("************************");

		System.out.println("\n************************");
		System.out.println("Updating Ages\n");
		System.out.println("************************");
		Person p3 = new Person();
		p3.setFirstName("Thomas");
		p3.setLastName("Smith");
		p3 = personService.get(p3);
		p3.setAge(personService.calculateAgeToday(p3.getDob()));
		personService.save(p3);
		
		p3 = new Person();
		p3.setFirstName("Judy");
		p3.setLastName("Jones");
		p3 = personService.get(p3);
		p3.setAge(personService.calculateAgeToday(p3.getDob()));
		personService.save(p3);
		
		System.out.println("\n************************");
		System.out.println("List: people:\n" + (Arrays.toString(personService.list().toArray())).replace("],", "],\n"));
		System.out.println("************************");

	}

}
