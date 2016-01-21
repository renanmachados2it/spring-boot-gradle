package br.com.springbootgradle.heteoas.assembler;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import br.com.springbootgradle.controller.DocumentController;
import br.com.springbootgradle.entity.Document;
import br.com.springbootgradle.hateoas.resource.DocumentResource;

public class DocumentResourceAssembler extends ResourceAssemblerSupport<Document, DocumentResource>{

	public DocumentResourceAssembler() {
		super(DocumentController.class, DocumentResource.class);
	}

	@Override
	public DocumentResource toResource(Document entity) {
		DocumentResource resource = new DocumentResource(entity);
		
		Link detail = linkTo(DocumentController.class).slash(entity.getId()).withSelfRel();
		resource.add(detail);
		
		return resource;
	}

}
