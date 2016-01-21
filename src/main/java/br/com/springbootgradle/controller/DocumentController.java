package br.com.springbootgradle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.springbootgradle.entity.Document;
import br.com.springbootgradle.hateoas.resource.DocumentResource;
import br.com.springbootgradle.heteoas.assembler.DocumentResourceAssembler;
import br.com.springbootgradle.service.DocumentService;

@RestController
public class DocumentController {

	@Autowired
	private DocumentService documentService;
	
	@Autowired
	private DocumentResourceAssembler documentResourceAssembler;
	
	@RequestMapping(value = "/document/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public DocumentResource findById(@PathVariable(value = "id") Long id){
		Document document = documentService.findById(id);
		
		return documentResourceAssembler.toResource(document);
	}
}
