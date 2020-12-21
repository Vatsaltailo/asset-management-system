package com.ddu.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="computer")
public class Computer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int comid;
	private String machineid;
	private String location;
	private String description;
	private int billid;
	
	public Computer()
	{
		
	}

	public Computer(String machineid, String location, String description, int billid) {
		super();
		this.machineid = machineid;
		this.location = location;
		this.description = description;
		this.billid = billid;
	}

	public int getComid() {
		return comid;
	}

	public void setComid(int comid) {
		this.comid = comid;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getBillid() {
		return billid;
	}

	public void setBillid(int billid) {
		this.billid = billid;
	}

	@Override
	public String toString() {
		return "Computer [comid=" + comid + ", machineid=" + machineid + ", location=" + location + ", description="
				+ description + ", billid=" + billid + "]";
	}

	
	
		
}
