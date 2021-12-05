package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.ejemplo.tiendaalamano.model.Persona;
import com.ejemplo.tiendaalamano.repository.PersonaRepository;

public class PersonaImpl implements PersonaService{
	
	@Autowired
	private PersonaRepository repository;
	
	@Override
	public List<Persona> all() {
		return this.repository.findAll();
	}
	
	@Override
	public Optional<Persona> findById(Long id) {
		return this.repository.findById(id);
	}
	
	@Override
	public Persona save(Persona persona) {
		return this.repository.save(persona);
	}
	
	@Override
	public void delete(Long id) {
		this.repository.deleteById(id);
	}
}


