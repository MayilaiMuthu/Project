package com.rest.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.entity.Product;
public interface ProductRepo extends JpaRepository<Product, Integer>{

}
