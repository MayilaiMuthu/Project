package com.rest.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.rest.dto.OrderResponse;
import com.rest.entity.CustomerABC;

public interface CustomerRepo extends JpaRepository<CustomerABC, Integer> {
	
	@Query("select new com.rest.dto.OrderResponse(c.cName,p.pName) from CustomerABC c JOIN c.products p")
	List<OrderResponse> getInfoOrderResponses();

}
