package br.com.springbootgradle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.springbootgradle.entity.Person;
import br.com.springbootgradle.hateoas.resource.PersonResource;
import br.com.springbootgradle.heteoas.assembler.PersonResourceAssembler;
import br.com.springbootgradle.service.PersonService;

@RestController
public class PersonController {

	@Autowired
	private PersonService personService;
	
	@Autowired
	private PersonResourceAssembler personResourceAssembler;
	
	@RequestMapping(value = "/person/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public PersonResource findById(@PathVariable(value = "id") Long id){
		Person person = personService.findById(id);
		
		return personResourceAssembler.toResource(person);
	}
}
