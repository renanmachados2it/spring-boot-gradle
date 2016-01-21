package br.com.springbootgradle.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import br.com.springbootgradle.entity.Person;
import br.com.springbootgradle.repository.rest.resource.PersonResource;

@RestResource(path = PersonResource.REL, rel = "person")
public interface PersonRepository extends JpaRepository<Person, Long>{
	
	@RestResource(path = "/ageBetween")
	List<Person> findByLastNameAndAgeBetween(@Param("lastName") String lastName, @Param("minAge") int min, @Param("maxAge") int max);

	@RestResource(path = "/attr")
	@Query("from Person p where p.firstName like ?1 or p.lastName like ?2 or p.age = ?3")
	List<Person> findByFirstNameOrLastNameOrAge(@Param("firstName") String firstName, @Param("lastName") String lastName, @Param("age") Integer age);
	
	@RestResource(path = "/attr/not")
	List<Person> findByFirstNameOrLastNameOrAgeNot(@Param("firstName") String firstName, @Param("lastName") String lastName, @Param("age") Integer age);
}
