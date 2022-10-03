package com.rest.dto;

import com.rest.entity.CustomerABC;

import lombok.Data;

@Data
public class OrderRequest {
	
	private CustomerABC customerABC;

}
