package com.hibernateclass.simpleab;

import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernateclass.simpleab.model.Address;
import com.hibernateclass.simpleab.model.Person;

public class AppMainHbM0 {

	public static void main(String[] args) {
		
		Configuration config = new Configuration().configure();
		
		//Configuration config = new Configuration();
		//config.addAnnotatedClass(Person.class);
		//config.configure();
				
		SessionFactory sf = config.buildSessionFactory();
		
		//SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		Session session = sf.openSession();
		
		//         *** Drop Table ***
		//session.createSQLQuery("DROP TABLE person_table"). executeUpdate();
		
		//new SchemaExport(config).create(true, true);
		
		Person p1 = new Person("Thomas", "Smith", 25, "M", new GregorianCalendar(1975,0,15).getTime(), "any@email.com");
		session.beginTransaction();
		int id = (Integer)session.save(p1);
		Address address = new Address(id, "123 Street", "Plano", "Tx", "75023" );
		session.save(address);
		
		
		Person p2 = new Person("Judy","Jones",38,"F", new GregorianCalendar(1968,2,25).getTime(),"another@email.com");
		id = (Integer)session.save(p2);
		Address address2 = new Address(id, "456 Avenue", "Frisco", "Tx", "75034" );
		session.save(address2);
		
		List<Person> people = session.createQuery("FROM Person").list();
		List<Address> locations = session.createQuery("FROM Address").list();
		
		session.getTransaction().commit();
		session.close();
		
		System.out.println("************************");
		System.out.println("List: people:\n" + (Arrays.toString(people.toArray())).replace("],", "],\n"));
		System.out.println("************************");

		System.out.println("************************");
		System.out.println("List: locations:\n" + (Arrays.toString(locations.toArray())).replace("],", "],\n"));
		System.out.println("************************");

	}

}
