package com.ddu.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class Admin {
	
	@Id
	private int id;
	@javax.persistence.Column(name = "aid")
	private String aid;
	private String a_name;
	private String password;
	
	public Admin()
	{
		
	}
	

	public Admin(String aid, String a_name, String password) {
		super();
		this.aid = aid;
		this.a_name = a_name;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAid() {
		return aid;
	}
	public void setAid(String aid) {
		this.aid = aid;
	}
	public String getA_name() {
		return a_name;
	}
	public void setA_name(String a_name) {
		this.a_name = a_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Admin [id=" + id + ", aid=" + aid + ", a_name=" + a_name + ", password=" + password + "]";
	}

}
