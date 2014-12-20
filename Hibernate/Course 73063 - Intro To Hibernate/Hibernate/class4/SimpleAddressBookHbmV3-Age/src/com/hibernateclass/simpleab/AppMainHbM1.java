package com.hibernateclass.simpleab;

import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernateclass.simpleab.dao.HibernateUtil;
import com.hibernateclass.simpleab.model.Address;
import com.hibernateclass.simpleab.model.Person;
import com.hibernateclass.simpleab.service.AddressService;
import com.hibernateclass.simpleab.service.AddressServiceImpl;
import com.hibernateclass.simpleab.service.PersonService;
import com.hibernateclass.simpleab.service.PersonServiceImpl;

public class AppMainHbM1 {

	public static void main(String[] args) {
		final Logger logger = Logger.getLogger(AppMainHbM1.class);
		PersonService personService = new PersonServiceImpl();
		AddressService addressService = new AddressServiceImpl();

		logger.debug("Hibernate.cfg.xml, Annotation DAO layer, age Transient implemented.");
		
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


	}

}
