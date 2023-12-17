package com.example.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.entity.Tour;

public interface TourManager {

	void add(Tour tour);
	
	List<Tour> getAll();
	
	@Query("Select * from Tour t where t.type= :gettype")
	Optional<Tour> findByType(@Param("gettype") String type);
}
