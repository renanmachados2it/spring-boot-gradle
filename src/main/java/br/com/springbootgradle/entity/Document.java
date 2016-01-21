package br.com.springbootgradle.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Document implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, unique=true, length=14)
	private String cpf;
	
	@Column(unique=true)
	private Integer rg;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Document [id=" + id + ", cpf=" + cpf + ", rg=" + rg + "]";
	}
	
	public Document() {
	}
	
	public Document(String cpf, Integer rg) {
		this.cpf = cpf;
		this.rg = rg;
	}
}
