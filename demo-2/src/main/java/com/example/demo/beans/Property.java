package com.example.demo.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Property {
	
	@Id
	private int lid;
	private String lname;
//	@ManyToOne
//	private Details2 details2;
	public Property()
	{
		
	}
	public Property(int lid, String lname) {
		super();
		this.lid = lid;
		this.lname = lname;
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	@Override
	public String toString() {
		return "Property [lid=" + lid + ", lname=" + lname + "]";
	}


}
