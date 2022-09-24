package com.example.demoperson.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoperson.model.person;
import com.example.demoperson.service.api.personServiceAPI;

@RestController
@RequestMapping(value = "/api/v1/")
public class PersonRestController {
	
	@Autowired
	private personServiceAPI personServiceAPI;
	
	@CrossOrigin(origins = "http://localhost:8081")
	@GetMapping(value = "/all")
	public List<person> getAll(){
		return personServiceAPI.getAll();
	}
	
	@CrossOrigin(origins = "http://localhost:8081")
	@GetMapping(value = "/find/{id_person}")
	public person fing(@PathVariable Long id_person) {
		return personServiceAPI.get(id_person);
	}
	
	@CrossOrigin(origins = "http://localhost:8081")
	@PostMapping(value = "/save")
	public ResponseEntity<person> save(@RequestBody person Person){
		person obj = personServiceAPI.save(Person);
		return new ResponseEntity<person>(obj, HttpStatus.OK);
	}
	
	@CrossOrigin(origins = "http://localhost:8081")
	@GetMapping(value = "/delete/{id_person}")
	public ResponseEntity<person> delete(@RequestBody Long id_person){
		person Person = personServiceAPI.get(id_person);
		if(Person != null) {
			personServiceAPI.delete(id_person);
		}else {
			return new ResponseEntity<person>(Person, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<person>(Person, HttpStatus.OK);
	}
}
