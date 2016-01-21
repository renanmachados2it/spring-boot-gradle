package br.com.springbootgradle.repository.rest.resource;

import org.springframework.hateoas.ResourceSupport;

import br.com.springbootgradle.entity.Phone;
import br.com.springbootgradle.entity.Phone.TypePhone;

public class PhoneResource extends ResourceSupport{

	public static final String REL = "phone";
	
	public PhoneResource(Phone phone) {
		this.type = phone.getType();
		this.number = phone.getNumber();
	}
	
	private TypePhone type;
	
	private String number;
	
	public TypePhone getType() {
		return type;
	}

	public void setType(TypePhone type) {
		this.type = type;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	
}
