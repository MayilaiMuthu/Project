package com.rest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "M_SHOP")
public class Product {
	
	@Id
	private Integer rollNo;

}
