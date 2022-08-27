package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxiDAO extends JpaRepository<Taxipro, Integer>{
	
	@Query("from Taxipro where flag=0 and station=?1 order by tamt ASC")
	public List<Taxipro> selectTaxi(String station);
	
	public List<Taxipro> findByTname(String tname);

}
