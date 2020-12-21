package com.ddu.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="fixedasset")
public class FixedAsset {

	@Id
	private int billid;
	private String billno;
	private String billissuer;
	private String type;
	private int quantity;
	private String description;
	private String date;
	private int unitprice;
	
	public FixedAsset()
	{
		
	}

	public FixedAsset(String billno, String billissuer, String type, int quantity, String description, String date,
			int unitprice) {
		super();
		this.billno = billno;
		this.billissuer = billissuer;
		this.type = type;
		this.quantity = quantity;
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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
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
		return "FixedAsset [billid=" + billid + ", billno=" + billno + ", billissuer=" + billissuer + ", type=" + type
				+ ", quantity=" + quantity + ", description=" + description + ", date=" + date + ", unitprice="
				+ unitprice + "]";
	}
	
	
}
