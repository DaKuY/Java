package com.hibernateclass.simpleab;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AppMainHbmStart {

	public static void main(String[] args) {
				
		System.out.println("Start Hibernate");
		SessionFactory sf = new Configuration().configure().buildSessionFactory();		
		Session session = sf.openSession();
		
		// Session 1
		System.out.println("start session 1");
		session.beginTransaction();

		// code here
		
		session.getTransaction().commit();
		session.close();
		

		//Session 2
		System.out.println("start session 2");
		Session session2 = sf.openSession();
		session2.beginTransaction();

		// code here
		
		session2.getTransaction().commit();
		session2.close();
		System.out.println("End Hibernate");
	}

}
