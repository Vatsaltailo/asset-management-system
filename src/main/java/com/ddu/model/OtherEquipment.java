package com.ddu.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="otherequipment")
public class OtherEquipment {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int eid;
	private String type;
	private String location;
	private String description;
	private String logicalid;
	private int billid;
	
	public OtherEquipment()
	{
		
	}

	public OtherEquipment(String type, String location, String description, String logicalid, int billid) {
		super();
		this.type = type;
		this.location = location;
		this.description = description;
		this.logicalid = logicalid;
		this.billid = billid;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	public String getLogicalid() {
		return logicalid;
	}

	public void setLogicalid(String logicalid) {
		this.logicalid = logicalid;
	}

	public int getBillid() {
		return billid;
	}

	public void setBillid(int billid) {
		this.billid = billid;
	}

	@Override
	public String toString() {
		return "OtherEquipment [eid=" + eid + ", type=" + type + ", location=" + location + ", description="
				+ description + ", logicalid=" + logicalid + ", billid=" + billid + "]";
	}

	
	

}
