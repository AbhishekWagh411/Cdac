package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.User;
import com.example.service.JWTService;

@RestController
public class JWTController {

	@Autowired
	JWTService serv;
	@GetMapping("/users")
	public List<User> getAll(){
		return serv.getAll();
	}
	}
