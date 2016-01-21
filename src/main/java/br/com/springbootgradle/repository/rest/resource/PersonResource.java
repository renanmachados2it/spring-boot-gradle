package br.com.springbootgradle.repository.rest.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import br.com.springbootgradle.entity.Person;

@JsonInclude(Include.NON_NULL)
public class PersonResource extends ResourceSupport{

	public static final String REL = "person";
	
	private String firstName;
	
	private String lastName;
	
	private Integer age;
	
	private DocumentResource document = null;
	
	private List<PhoneResource> phones = null;
	
	public PersonResource(Person person) {		
		this.firstName = person.getFirstName();
		this.lastName = person.getLastName();
		this.age = person.getAge();
	}
	
	public PersonResource(Person person, boolean hasDocument) {		
		this(person);
		this.document = new DocumentResource(person.getDocument());
	}
	
	public PersonResource(Person person, boolean hasDocument, boolean hasPhones) {		
		this(person, true);
		person.getPhones().forEach(p -> this.getPhones().add(new PhoneResource(p)));
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public DocumentResource getDocument() {
		return document;
	}

	public void setDocument(DocumentResource document) {
		this.document = document;
	}

	public List<PhoneResource> getPhones() {
		if (phones == null) {
			phones = new ArrayList<>();
		}

		return phones;
	}

	public void setPhones(List<PhoneResource> phones) {
		this.phones = phones;
	}
	
	
}
