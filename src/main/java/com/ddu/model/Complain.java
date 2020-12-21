package com.ddu.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="complain")
public class Complain {
	
	@Id
	private int complainid;
	private String date;
	private String description;
	private String machineid;
	private String location;
	private String status;
	
	
	public Complain()
	{
		
	}


	public Complain(String sid, int sem, String batch, String date, String description, String machineid,
			String location, String status) {
		super();
		
		this.date = date;
		this.description = description;
		this.machineid = machineid;
		this.location = location;
		this.status = status;
	}


	public int getComplainid() {
		return complainid;
	}


	public void setComplain_id(int complainid) {
		this.complainid = complainid;
	}


	

	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getMachineid() {
		return machineid;
	}


	public void setMachineid(String machineid) {
		this.machineid = machineid;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "Complain [complainid=" + complainid + ", date=" + date + ", description=" + description + ", machineid="
				+ machineid + ", location=" + location + ", status=" + status + "]";
	}


				
}
