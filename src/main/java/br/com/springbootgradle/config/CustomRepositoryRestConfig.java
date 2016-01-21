package br.com.springbootgradle.config;

import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import org.springframework.stereotype.Component;

import br.com.springbootgradle.heteoas.assembler.DocumentResourceAssembler;
import br.com.springbootgradle.heteoas.assembler.PersonResourceAssembler;
import br.com.springbootgradle.heteoas.assembler.PhoneResourceAssembler;
import br.com.springbootgradle.repository.rest.handler.PersonHandler;

@Component
public class CustomRepositoryRestConfig extends RepositoryRestConfigurerAdapter {

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.setBasePath("/api");
	}

	@Bean
	public PersonHandler personEventHandler() {
		return new PersonHandler();
	}
	
	@Bean
	public PersonResourceAssembler personResourceAssembler(){
		return new PersonResourceAssembler();
	}
	
	@Bean
	public DocumentResourceAssembler documentResourceAssembler(){
		return new DocumentResourceAssembler();
	}
	
	@Bean
	public PhoneResourceAssembler phoneResourceAssembler(){
		return new PhoneResourceAssembler();
	}
}
