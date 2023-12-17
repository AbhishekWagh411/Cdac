package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Service.TourManager;
import com.example.entity.Tour;

@RestController
public class TourController {

	@Autowired
	TourManager tourManager;
	
	@PostMapping("/add")
	public void add(@RequestBody Tour tour) {
		tourManager.add(tour);
	}
	
	@GetMapping("/getAll")
	public List<Tour> getAll(){
		return tourManager.getAll();
	}
	@GetMapping("/byType/{type}")
	public Optional<Tour> findByType(@PathVariable String type){
		return tourManager.findByType(type);
	}
}
