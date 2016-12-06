package com.example;

import java.util.List;

import org.apache.commons.collections.IteratorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.PersonRepository;
import com.example.entity.Person;

@RestController()
@RequestMapping("/person")
public class PersonController {

	@Autowired
	private PersonRepository repository;
	
	@RequestMapping(method = RequestMethod.GET, path="/list")
	public List<Person> list() {
		Iterable<Person> persons = repository.findAll();
		
		for (Person p:persons) {
			System.out.println(p);
		}
		
		
		return IteratorUtils.toList(persons.iterator());
	}

	@RequestMapping(method = RequestMethod.POST)
	public String add(@RequestBody Person person) {
		repository.save(person);
		return "OK";
	}

}
