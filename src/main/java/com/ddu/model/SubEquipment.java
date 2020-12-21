package com.ddu.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="subequipment")
public class SubEquipment {

	@Id
	private int subequiid;
	private int comid;
	private String type;
	private String logicalid;
	
	public SubEquipment()
	{
		
	}
	
	public SubEquipment(int comid, String type, String logicalid) {
		super();
		this.comid = comid;
		this.type = type;
		this.logicalid = logicalid;
	}
	public int getSubequiid() {
		return subequiid;
	}
	public void setSubequiid(int subequiid) {
		this.subequiid = subequiid;
	}
	public int getComid() {
		return comid;
	}
	public void setComid(int comid) {
		this.comid = comid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLogicalid() {
		return logicalid;
	}
	public void setLogicalid(String logicalid) {
		this.logicalid = logicalid;
	}
	@Override
	public String toString() {
		return "SubEquipment [subequiid=" + subequiid + ", comid=" + comid + ", type=" + type + ", logicalid="
				+ logicalid + "]";
	}
	
	
}
