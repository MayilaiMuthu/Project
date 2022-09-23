package com.rest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "M_SHOP")
public class Product {
	
	@Id
	private Integer rollNo;
	private Character classNo;
	private String sName;
	public Integer getRollNo() {
		return rollNo;
	}
	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}
	public Character getClassNo() {
		return classNo;
	}
	public void setClassNo(Character classNo) {
		this.classNo = classNo;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}

}
