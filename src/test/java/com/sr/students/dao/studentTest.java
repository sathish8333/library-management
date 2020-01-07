package com.sr.students.dao;

import com.sr.students.dao.StudentDao;
import com.sr.students.pojo.Student;

public class studentTest {

	public static void main(String[] args) {

		Student st = new Student("venkat02", "ECE");
		StudentDao.saveStudent(st);
	}

}
