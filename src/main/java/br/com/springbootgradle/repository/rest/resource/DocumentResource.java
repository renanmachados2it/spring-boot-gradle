package br.com.springbootgradle.repository.rest.resource;

import org.springframework.hateoas.ResourceSupport;

import br.com.springbootgradle.entity.Document;

public class DocumentResource extends ResourceSupport{

	public static final String REL = "document";
	
	private String cpf;
	
	private Integer rg;

	public DocumentResource(Document document) {
		this.cpf = document.getCpf();
		this.rg = document.getRg();
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Integer getRg() {
		return rg;
	}

	public void setRg(Integer rg) {
		this.rg = rg;
	}
	
	
}
