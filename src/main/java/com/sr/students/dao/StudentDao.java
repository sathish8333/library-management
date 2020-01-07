package com.sr.students.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sr.students.pojo.Student;

public class StudentDao {
	static SessionFactory factory;

	public static void saveStudent(Student stuobj) {
		factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		Session session = factory.getCurrentSession();
		Transaction trans = session.beginTransaction();
		session.save(stuobj);
		//trans.commit();
		
		session.close();
		factory.close();

	}
}
