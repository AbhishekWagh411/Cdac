package com.example.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.entity.Tour;
import com.example.repository.TourRepo;

@Service
public class TourManagerImpl implements TourManager {

	@Autowired
	TourRepo tourRepo;
	@Override
	public void add(@RequestBody Tour tour) {
		// TODO Auto-generated method stub
		tourRepo.save(tour);
		
	}

	@Override
	public List<Tour> getAll() {
		// TODO Auto-generated method stub
		return tourRepo.findAll();
	}

	@Override
	public Optional<Tour> findByType(String type) {
		// TODO Auto-generated method stub
		return tourRepo.findByType(type);
	}


}
