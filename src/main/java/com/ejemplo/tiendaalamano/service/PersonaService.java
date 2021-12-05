package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import com.ejemplo.tiendaalamano.model.Persona;

public interface PersonaService {
	public List<Persona> all();
	
	public Optional<Persona> findById(Long id);
	
	public Persona save(Persona persona);
	
	public void delete(Long id);
}


