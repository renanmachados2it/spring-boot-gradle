package br.com.springbootgradle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import br.com.springbootgradle.entity.Phone;
import br.com.springbootgradle.hateoas.resource.PhoneResource;

@RestResource(path = PhoneResource.REL, rel = "phones")
public interface PhoneRepository extends JpaRepository<Phone, Long>{

	@RestResource(path = "/person")
	@Query("from Phone p left join p.person p where p.id = ?1")
	Phone findByIdWithPerson(@Param("phoneId") Long phoneId);
}
