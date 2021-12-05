package com.ejemplo.tiendaalamano.service;

import java.util.List;

import com.ejemplo.tiendaalamano.model.Cliente;

public interface ClienteService {
    public void deleteAllClientes();
    public void deleteClienteById(Long id);

    public void createCliente(Cliente cliente);

    public Cliente getClienteById(Long id);

    public List<Cliente> getAllClientes();
}