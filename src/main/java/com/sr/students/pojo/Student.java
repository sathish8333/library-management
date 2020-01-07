package com.sr.students.pojo;

public class Student {

	private int id;
	private String sname;
	private String sdepart;
	
	
	public Student(String sname, String sdepart) {
		super();
		this.sname = sname;
		this.sdepart = sdepart;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSdepart() {
		return sdepart;
	}
	public void setSdepart(String sdepart) {
		this.sdepart = sdepart;
	}
	
	
	
	
}
