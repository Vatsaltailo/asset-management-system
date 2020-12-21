package com.ddu.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="allocation")
public class Allocation {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int allocateid;
	private String machineid;
	private int billid;
	private String location;
	private String type;
	
	public Allocation()
	{
		
	}

	public Allocation(String machineid, int billid, String location, String type) {
		super();
		this.machineid = machineid;
		this.billid = billid;
		this.location = location;
		this.type = type;
	}

	public int getAllocateid() {
		return allocateid;
	}

	public void setAllocateid(int allocateid) {
		this.allocateid = allocateid;
	}

	public String getMachineid() {
		return machineid;
	}

	public void setMachineid(String machineid) {
		this.machineid = machineid;
	}

	public int getBillid() {
		return billid;
	}

	public void setBillid(int billid) {
		this.billid = billid;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Allocation [allocateid=" + allocateid + ", machineid=" + machineid + ", billid=" + billid
				+ ", location=" + location + ", type=" + type + "]";
	}
	
	
}
