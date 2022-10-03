package com.rest.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.dto.OrderRequest;
import com.rest.dto.OrderResponse;
import com.rest.entity.CustomerABC;
import com.rest.service.CustomerService;

@RestController
@RequestMapping("/customer/")
public class CustomerControl {
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping(value = "send")
	public String setOrder(@RequestBody(required = true) OrderRequest orderRequest) {
		return customerService.setOrder(orderRequest);
	}
	
	@GetMapping(value = "views")
	public List<CustomerABC> viewOrder() {
		return customerService.viewOrder();
	}
	
	@GetMapping(value = "view")
	public List<OrderResponse> getInfoOrderResponses() {
		return customerService.getInfoOrderResponses();
	}

}
