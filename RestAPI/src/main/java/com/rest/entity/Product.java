package com.rest.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "M_SHOP")
public class Product {
	
	@Id
	@GeneratedValue
	private Integer pId;
	private Integer pAmt;
	private String pName;


}
