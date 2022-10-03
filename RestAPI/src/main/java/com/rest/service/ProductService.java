package com.rest.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.entity.Product;
import com.rest.repo.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepo productRepo;

	public Product get(int uid) {
		return productRepo.findById(uid).orElse(new Product());
	}
	
	public List<Product> getAll() {
		List<Product> list=productRepo.findAll();
		if(list!=null) {return list;}
		else { list=new ArrayList<>(); list.add(new Product());   return list;}
	}
	
	public String put(int uid,Product product) {
		Product pro=productRepo.findById(uid).orElse(null);
		if(pro!=null) {
			pro.setPAmt(product.getPAmt());
			pro.setPName(product.getPName());
			productRepo.save(pro);  return "success";
		} else { return "fail"; }
	}
	
	public String set(Product product) {
		if(product!=null) {productRepo.save(product);	return "success";}
		else { return "fail"; }
	}
	
	public String setAll(List<Product> list) {
		if(list!=null) {productRepo.saveAll(list); return "success";}
		else { return "fail"; }
	}
	
	public String del(int id) {
		boolean product=productRepo.existsById(id);
		if(product==true) { productRepo.deleteById(id);	return "success"; }
	    else { return "fail"; }
	}
	
	public String delAll() {
		List<Product> list=productRepo.findAll();
		if(list!=null) {productRepo.deleteAll(); return "success";}
		else { return "fail"; }
	}
	
}
