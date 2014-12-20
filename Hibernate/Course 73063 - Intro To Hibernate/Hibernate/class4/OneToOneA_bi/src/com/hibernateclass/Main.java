package com.hibernateclass;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernateclass.util.HibernateUtil;

public class Main {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			Address address1 = new Address("3 Main st.", "Plano", "Tx", "75024");
			Student student1 = new Student("Ron Day", address1);
			Address address2 = new Address("4 Main st.", "Plano", "Tx", "75024");
			Student student2 = new Student("Joe Smith", address2);			
						
			address1.setStudent(student1);
			address2.setStudent(student2);
			
			session.save(student1);
			session.save(student2);
			
			System.out.println("info: " + address1.getStudent().getStudentName());
						
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

	}

}
