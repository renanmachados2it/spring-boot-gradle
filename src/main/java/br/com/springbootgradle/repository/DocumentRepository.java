package br.com.springbootgradle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import br.com.springbootgradle.entity.Document;
import br.com.springbootgradle.repository.rest.resource.DocumentResource;

@RestResource(path = DocumentResource.REL, rel = "document")
public interface DocumentRepository extends JpaRepository<Document, Long>{

}
