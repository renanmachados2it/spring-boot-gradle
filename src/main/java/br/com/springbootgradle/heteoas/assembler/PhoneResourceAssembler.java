package br.com.springbootgradle.heteoas.assembler;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import br.com.springbootgradle.controller.PhoneController;
import br.com.springbootgradle.entity.Phone;
import br.com.springbootgradle.hateoas.resource.PhoneResource;

public class PhoneResourceAssembler extends ResourceAssemblerSupport<Phone, PhoneResource>{

	public PhoneResourceAssembler() {
		super(PhoneController.class, PhoneResource.class);
	}

	@Override
	public PhoneResource toResource(Phone entity) {
		PhoneResource resource = new PhoneResource(entity);
		
		Link detail = linkTo(PhoneController.class).slash(entity.getId()).withSelfRel();
		resource.add(detail);
		
		return resource;
	}

}
