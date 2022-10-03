package com.rest.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import com.rest.entity.CustomerABC;

public interface CustomerRepo extends JpaRepository<CustomerABC, Integer> {
}
