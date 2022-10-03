package com.rest.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.dto.OrderRequest;
import com.rest.entity.CustomerABC;
import com.rest.repo.CustomerRepo;
@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepo customerRepo;
	
	public String setOrder(OrderRequest orderRequest) {
		CustomerABC abc =customerRepo.save(orderRequest.getCustomerABC());
		if(abc!=null) {
			return "success";
		}else {
		return "fail";
	     }
		}
	
	public List<CustomerABC> viewOrder() {
		return customerRepo.findAll();
	}

}
