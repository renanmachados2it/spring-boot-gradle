package br.com.springbootgradle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.springbootgradle.entity.Phone;
import br.com.springbootgradle.hateoas.resource.PhoneResource;
import br.com.springbootgradle.heteoas.assembler.PhoneResourceAssembler;
import br.com.springbootgradle.service.PhoneService;

@RestController
public class PhoneController {

	@Autowired
	private PhoneService phoneService;
	
	@Autowired
	private PhoneResourceAssembler phoneResourceAssembler;
	
	@RequestMapping(value = "/phone/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public PhoneResource findById(@PathVariable(value = "id") Long id){
		Phone phone = phoneService.findById(id);
		
		return phoneResourceAssembler.toResource(phone);
	}
}
