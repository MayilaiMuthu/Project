package com.rest.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/product")
public class ProductContoller {
	
	@GetMapping("check")
	public String Check() {
		return "product";
	}

}
