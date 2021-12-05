package com.ejemplo.tiendaalamano.repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;

import com.ejemplo.tiendaalamano.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long>{
	//@Query("SELECT p FROM Usuario p WHERE p.username = :username and p.password = :password")
	//public List<Persona> login(String username, String password); 
}
