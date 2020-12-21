package com.ddu.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bill")
public class Bill {

	@Id
	private int billid;
	private int assetid;
	private String billno;
	private String billissuer;
	private String type;
	private String logicalid;
	private String description;
	private String date;
	private int unitprice;
	
	public Bill()
	{
		
	}

	public Bill(int assetid, String billno, String billissuer, String type, String logicalid, String description,
			String date, int unitprice) {
		super();
		this.assetid = assetid;
		this.billno = billno;
		this.billissuer = billissuer;
		this.type = type;
		this.logicalid = logicalid;
		this.description = description;
		this.date = date;
		this.unitprice = unitprice;
	}

	public int getBillid() {
		return billid;
	}

	public void setBillid(int billid) {
		this.billid = billid;
	}

	public int getAssetid() {
		return assetid;
	}

	public void setAssetid(int assetid) {
		this.assetid = assetid;
	}

	public String getBillno() {
		return billno;
	}

	public void setBillno(String billno) {
		this.billno = billno;
	}

	public String getBillissuer() {
		return billissuer;
	}

	public void setBillissuer(String billissuer) {
		this.billissuer = billissuer;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getUnitprice() {
		return unitprice;
	}

	public void setUnitprice(int unitprice) {
		this.unitprice = unitprice;
	}

	@Override
	public String toString() {
		return "Bill [billid=" + billid + ", assetid=" + assetid + ", billno=" + billno + ", billissuer=" + billissuer
				+ ", type=" + type + ", logicalid=" + logicalid + ", description=" + description + ", date=" + date
				+ ", unitprice=" + unitprice + "]";
	}
	
	
}
