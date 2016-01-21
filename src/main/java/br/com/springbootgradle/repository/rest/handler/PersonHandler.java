package br.com.springbootgradle.repository.rest.handler;

import org.springframework.data.rest.core.annotation.HandleAfterCreate;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;

import br.com.springbootgradle.entity.Person;

@RepositoryEventHandler(Person.class)
public class PersonHandler {

	@HandleAfterCreate
	public void handleAfterCreate(Person p){
		System.out.println("Entrei: "+p);
	}
}
