package com.ejemplo.tiendaalamano.repository;

//import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

import com.ejemplo.tiendaalamano.model.Cliente;

//@Repository("clienteRepository")
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    //@Transactional
    //void deleteById(Long id);
}

