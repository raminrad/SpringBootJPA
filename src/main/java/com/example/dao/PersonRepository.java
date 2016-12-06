package com.example.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.entity.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {
}
