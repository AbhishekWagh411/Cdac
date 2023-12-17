package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.entity.Tour;


import java.util.Optional;

@Repository
@Transactional
public interface TourRepo extends JpaRepository<Tour, Integer> {
	@Query("select t from Tour t where t.type= :type")
	Optional<Tour> findByType(String type);
	
}
