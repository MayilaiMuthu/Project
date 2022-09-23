package com.rest.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.entity.Product;
import com.rest.service.ProductService;

@RestController
@RequestMapping(value = "/product/")
public class ProductContoller {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping(value = "check")
	public String Check() {
		return "product";
	}
	
	@GetMapping(value = "get-one/{uid}")
	public Product get(@PathVariable(required = true,name = "uid") int uid) {
		return productService.get(uid);
	}
	
	@GetMapping(value = "get-all")
	public List<Product> getAll() {
		return productService.getAll();
	}
	
	@PutMapping(value = "put-val/{uid}")
	public String put(@PathVariable(required = true,name = "uid") int uid,@RequestBody(required = true) Product product) {
		return productService.put(uid, product);
	}

	@PostMapping(value = "set-one")
	public String set(@RequestBody(required = true)Product product) {
		return productService.set(product);
	}
	
	@PostMapping(value = "set-all")
	public String setAll(@RequestBody(required = true)List<Product> product) {
		return productService.setAll(product);
	}
	
	@DeleteMapping(value = "del-one/{uid}")
	public String delete(@PathVariable(required = true,name = "uid") int uid) {
		return productService.del(uid);
	}
	
	@DeleteMapping(value = "del-all")
	public String deleteAll() {
		return productService.delAll();
	}
	
}
