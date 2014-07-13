package com.andrewcamero.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.andrewcamero.spring.dao.ProviderDao;
import com.andrewcamero.spring.dao.impl.ProviderDaoImpl;


/**
 * Hello world! with Spring
 *
 */
public class App 
{
	/*
	 * Loads the Spring Beans
	 */
	static ApplicationContext context;
	static{
		 context = new ClassPathXmlApplicationContext("Spring-Beans.xml");
	}
	
    public static void main( String... vars )
    {
       helloWorld();
       jdbcTemplateExample();
    }
    
    /*
     * Get's the beans associated with 'helloWorld'
     * Then says Hello!
     */
	private static void helloWorld(){
		
		HelloWorld helloWorld=(HelloWorld)context.getBean("helloWorld");
		helloWorld.sayHello();
	}
	
	/*
	 * Gets Bean associated with 'providerDaoImpl'
	 * Connects to the DB and runs a SQL
	 */
	private static void jdbcTemplateExample(){
		ProviderDao dao = (ProviderDaoImpl)context.getBean("providerDaoImpl");
//		List<String> results = dao.queryTest();
//		for(String row:results){
//			System.out.println(row);
//		}
		dao.queryTest();
	}
}
