package com.moraes.test_predicate.api.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import com.moraes.test_predicate.api.model.Person;

public interface PersonDAO extends JpaRepository<Person, Long>, QuerydslPredicateExecutor<Person>{

}
