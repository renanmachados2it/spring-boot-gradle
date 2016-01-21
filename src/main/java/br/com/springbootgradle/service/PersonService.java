package br.com.springbootgradle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.springbootgradle.amqp.Sender;
import br.com.springbootgradle.entity.Person;
import br.com.springbootgradle.repository.PersonRepository;
import br.com.springbootgradle.repository.rest.resource.PersonResource;

@Service
public class PersonService {

	@Autowired
	private Sender sender;
		
	@Autowired
	private PersonRepository personRepository;
	
	public List<Person> findAll(){
		return personRepository.findAll();
	}
	
	public Person findById(Long id) {
		Person person = personRepository.findOne(id);
		
		sender.send(new PersonResource(person, true, true));
		
		return person;
	}
}