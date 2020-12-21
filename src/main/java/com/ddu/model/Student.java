package com.ddu.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	
	@Id
	private int id;
	@javax.persistence.Column(name = "sid")
	private String sid;
	private String password;
	
	public Student()
	{
		
	}

	public Student(String sid, String password) {
		super();
		this.sid = sid;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getsid() {
		return sid;
	}

	public void setsid(String sid) {
		this.sid = sid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", sid=" + sid + ", password=" + password + "]";
	}

	
}
