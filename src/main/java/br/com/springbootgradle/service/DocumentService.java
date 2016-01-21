package br.com.springbootgradle.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.springbootgradle.entity.Document;
import br.com.springbootgradle.repository.DocumentRepository;

@Service
public class DocumentService {

	@Autowired
	private DocumentRepository documentRepository;
	
	public Document findById(Long id){
		return documentRepository.findOne(id);
	}
}
