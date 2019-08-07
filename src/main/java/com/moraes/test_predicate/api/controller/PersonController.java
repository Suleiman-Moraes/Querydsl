package com.moraes.test_predicate.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moraes.test_predicate.api.model.Person;
import com.moraes.test_predicate.api.service.PersonService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/person")
public class PersonController {
	
	@Autowired
	private PersonService service;
	
	@ApiOperation(value = "test querydsl")
	@GetMapping
	public ResponseEntity<Person> test(){
		return ResponseEntity.ok(service.test());
	}
}