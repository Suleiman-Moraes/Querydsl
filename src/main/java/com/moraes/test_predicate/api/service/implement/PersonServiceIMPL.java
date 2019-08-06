package com.moraes.test_predicate.api.service.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moraes.test_predicate.api.model.Person;
import com.moraes.test_predicate.api.model.QPerson;
import com.moraes.test_predicate.api.persistencia.PersonDAO;
import com.moraes.test_predicate.api.service.PersonService;
import com.querydsl.core.types.Predicate;

import lombok.Getter;

@Getter
@Service
public class PersonServiceIMPL implements PersonService{
	
	@Autowired
	private PersonDAO pessoaDAO;
	
	@Override
	public Person test() {
		QPerson person = QPerson.person;
		Predicate predicate = person.name.eq("Suleiman").and(person.address.containsIgnoreCase("nHe"));
		return pessoaDAO.findOne(predicate).get();
	}
}
