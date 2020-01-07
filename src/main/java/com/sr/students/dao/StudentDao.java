package com.sr.students.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.sr.students.pojo.Student;

public class StudentDao {
	static SessionFactory factory;

	public static void saveStudent(Student stuobj) {
		factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		Session session = factory.getCurrentSession();
		Transaction trans = session.beginTransaction();
		session.save(stuobj);
		// trans.commit();

		session.close();
		factory.close();

	}

	public static void getStudent(int id) {
		factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		Session session = factory.getCurrentSession();
		Transaction trans = session.beginTransaction();
		Query query = session.createQuery("from student where id=:stu_id ");
		query.setParameter("stu_id", id);
		query.list();
		// trans.commit();

		session.close();
		factory.close();

	}
}
