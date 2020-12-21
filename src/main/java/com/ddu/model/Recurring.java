package com.ddu.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="recurring")
public class Recurring {
	
	@Id
	private int billid;
	private String billno;
	private String billissuer;
	private String type;
	private int available;
	private int total ;
	private String description;
	private String date;
	private int unitprice;
	
	public Recurring()
	{
		
	}
	public Recurring(String billno, String billissuer, String type, int available, int total,
			String description, String date, int unitprice) {
		super();
		this.billno = billno;
		this.billissuer = billissuer;
		this.type = type;
		this.available = available;
		this.total = total;
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
	public int getAvailable() {
		return available;
	}
	public void setAvailable(int available) {
		this.available = available;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
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
		return "Recurring [billid=" + billid + ", billno=" + billno + ", billissuer=" + billissuer + ", type=" + type
				+ ", availableQuantity=" + available + ", totalQuantity=" + total + ", description="
				+ description + ", date=" + date + ", unitprice=" + unitprice + "]";
	}
	
	

}
