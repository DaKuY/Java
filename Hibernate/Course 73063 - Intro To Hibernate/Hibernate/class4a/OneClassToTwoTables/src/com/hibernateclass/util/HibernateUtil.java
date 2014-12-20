package com.hibernateclass.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {

	private static SessionFactory sessionFactory;

	static{
		try{
			sessionFactory=new AnnotationConfiguration().configure().buildSessionFactory();
		}catch(Throwable ex){
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}

	public static void shutdown(){
		getSessionFactory().close();
	}

}