package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.User;
import com.example.repository.JWTRepository;

@Service
public class JWTService {

	@Autowired
	JWTRepository repo;
	
	public List<User> getAll() {
		return repo.findAll();
	}
}
