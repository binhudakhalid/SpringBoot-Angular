package com.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.boot.model.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {	

	Location a = null;

	public Location findOneByid(long id);
	
	
 	@Query("SELECT t FROM Task t LEFT JOIN FETCH t.createdBy WHERE t.id = (:taskId)")
	public Location findOneByIdFetchCreatedByEagerly(@Param("taskId") long id);

	
	
}
                