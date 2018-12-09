package com.example.demo.beans;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Details2  {
    
	@Id
	private int eid;
	private String name;
	private String designation;
//	@OneToMany(mappedBy="Details2")
	@OneToOne
	private Property property;
	
	public Details2()
	{
		
	}
	
	public Details2(int eid, String name, String designation) {
		super();
		this.eid = eid;
		this.name = name;
		this.designation = designation;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public Property getProperty() {
		return property;
	}

	public void setProperty(Property property) {
		this.property = property;
	}

	@Override
	public String toString() {
		return "Details2 [eid=" + eid + ", name=" + name + ", designation=" + designation + "]";
	}
	
	
	
}
