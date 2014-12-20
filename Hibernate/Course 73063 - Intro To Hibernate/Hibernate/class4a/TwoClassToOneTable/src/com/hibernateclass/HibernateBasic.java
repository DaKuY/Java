package com.hibernateclass;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernateclass.util.HibernateUtil;

public class HibernateBasic {

	public static void main(String[] args) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx= session.beginTransaction();

		Student student = new Student("Ron Day", "45", "junior", "Physics");
		Address address = new Address("1 First St", "Plano", "Texas", "75024");
		student.setAddress(address);

		Long studentId = (Long)session.save(student);
		System.out.println("XML: ID = " + studentId);
				
		tx.commit();
		session.close();
		
		session = HibernateUtil.getSessionFactory().openSession();
		System.out.println("Student: " + (Student)session.get(Student.class, studentId));		
		
		
		session.close();
	}
	
}