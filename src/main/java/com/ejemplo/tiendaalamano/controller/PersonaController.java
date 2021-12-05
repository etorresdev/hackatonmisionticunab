package com.ejemplo.tiendaalamano.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.tiendaalamano.model.Persona;
import com.ejemplo.tiendaalamano.service.PersonaService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/persona")
public class PersonaController {
	
	@Autowired(required = false)
	private PersonaService service;
	
	@GetMapping
	public List<Persona> all() {
		return service.all();
	}
	
	@GetMapping("{id}")
	public Optional<Persona> show(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Persona save(@RequestBody Persona persona) {
		return service.save(persona);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Persona update(@PathVariable Long id, @RequestBody Persona persona) {
		Optional<Persona> op = service.findById(id);
		
		if (!op.isEmpty()) {
			Persona personaUpdate = op.get();
			personaUpdate.setDocumento(persona.getDocumento());
			personaUpdate.setNombre(persona.getNombre());
			personaUpdate.setOtro_nombre(persona.getOtro_nombre());
			personaUpdate.setPrimer_apellido(persona.getPrimer_apellido());
			personaUpdate.setSegundo_apellido(persona.getSegundo_apellido());
			personaUpdate.setCorreo(persona.getCorreo());
			personaUpdate.setDireccion(persona.getDireccion());
			personaUpdate.setTelefono(persona.getTelefono());
			return service.save(personaUpdate);
		}
		
		return persona;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
}
