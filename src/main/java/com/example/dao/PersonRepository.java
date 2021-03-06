package com.example.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
	
	@Query(value = "select * from PERSON where age < 20 and age > 12", nativeQuery=true)
	public List<Person> getTeens();
}
