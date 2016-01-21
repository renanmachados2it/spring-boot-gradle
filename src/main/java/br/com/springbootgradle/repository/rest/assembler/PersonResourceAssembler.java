package br.com.springbootgradle.repository.rest.assembler;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import br.com.springbootgradle.controller.DocumentController;
import br.com.springbootgradle.controller.PersonController;
import br.com.springbootgradle.controller.PhoneController;
import br.com.springbootgradle.entity.Person;
import br.com.springbootgradle.entity.Phone;
import br.com.springbootgradle.repository.rest.resource.DocumentResource;
import br.com.springbootgradle.repository.rest.resource.PersonResource;
import br.com.springbootgradle.repository.rest.resource.PhoneResource;

public class PersonResourceAssembler extends ResourceAssemblerSupport<Person, PersonResource>{

	public PersonResourceAssembler() {
		super(PersonController.class, PersonResource.class);
	}

	@Override
	public PersonResource toResource(Person entity) {
		PersonResource resource = new PersonResource(entity);
		
		resource.add(linkTo(PersonController.class).slash(entity.getId()).withSelfRel());
		
		if(entity.getDocument() != null){
			resource.add(linkTo(methodOn(DocumentController.class).findById(entity.getDocument().getId())).withRel(DocumentResource.REL));
		}
		
		for(Phone phone : entity.getPhones()){
			resource.add(linkTo(methodOn(PhoneController.class).findById(phone.getId())).withRel(PhoneResource.REL));
		}
		
		return resource;
	}

}
