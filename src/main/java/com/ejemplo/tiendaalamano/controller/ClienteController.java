package com.ejemplo.tiendaalamano.controller;

import com.ejemplo.tiendaalamano.model.Cliente;
import com.ejemplo.tiendaalamano.service.ClienteService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

//Tabla cliente

@RestController
@RequestMapping("/apic")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @RequestMapping(value = "/cliente", method = RequestMethod.POST, consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void createNewCliente(@RequestBody @Validated Cliente cliente) {
    	clienteService.createCliente(cliente);
    }

    @RequestMapping(value = "/erase", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteAllClientes() {
    	clienteService.deleteAllClientes();
    }

    @RequestMapping(value = "/cliente/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteClienteById(@RequestParam Long id) {
    	clienteService.deleteClienteById(id);
    }

    @RequestMapping(value = "/cliente", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Cliente> getAllClientes() {
        return clienteService.getAllClientes();
    }

    @RequestMapping(value = "/cliente/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Cliente getClienteById( @PathVariable Long id) {
        return clienteService.getClienteById(id);
    }
}
