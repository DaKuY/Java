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
			Address address = new Address("1 Main st.", "Plano", "Tx", "75024");
			Student student1 = new Student("Ron Day", address);
			Student student2 = new Student("Joe Smith", address);			
			session.save(student1);
			session.save(student2);
			
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

	}

}
