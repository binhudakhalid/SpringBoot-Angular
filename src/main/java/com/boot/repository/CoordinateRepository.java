package com.boot.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.boot.model.Coodinate;
import com.boot.model.Task;


public interface CoordinateRepository extends JpaRepository<Coodinate, Integer> {

	public Coodinate findOneByid(int id);
	
	
	
	



}
