package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Person;
import com.example.repositeries.PersonRepository;

@Service
public class PersonService 
{
	@Autowired
	private PersonRepository prepository;
	
	public void addPerson(Person person)
	{
		prepository.save(person);
	}
	
	public List<Person> getAllPersons()
	{
		return prepository.findAll();
		 
	}

	public PersonService(PersonRepository prepository) {
		super();
		this.prepository = prepository;
	}

}
