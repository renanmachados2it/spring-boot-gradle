package br.com.springbootgradle.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import br.com.springbootgradle.entity.Address;

@RestResource(path = "address", rel = "addresses")
public interface AddressRepository extends JpaRepository<Address, Long>{
	
	List<Address> buscaPorCidade(String city);
	
	@Query(value="select * from address a where a.street like :street"
			,nativeQuery=true)
	List<Address> findByStreet(@Param("street") String street);

}
