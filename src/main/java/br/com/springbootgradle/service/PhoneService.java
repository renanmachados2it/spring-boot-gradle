package br.com.springbootgradle.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.springbootgradle.entity.Phone;
import br.com.springbootgradle.repository.PhoneRepository;

@Service
public class PhoneService {

	@Autowired
	private PhoneRepository phoneRepository;
	
	public Phone findById(Long id){
		return phoneRepository.findOne(id);
	}
}
