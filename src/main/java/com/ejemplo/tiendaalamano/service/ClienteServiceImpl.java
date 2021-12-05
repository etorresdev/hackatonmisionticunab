package com.ejemplo.tiendaalamano.service;

import com.ejemplo.tiendaalamano.model.Cliente;
import com.ejemplo.tiendaalamano.repository.ClienteRepository;
import com.ejemplo.tiendaalamano.exception.BadResourceRequestException;
import com.ejemplo.tiendaalamano.exception.NoSuchResourceFoundException;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("clienteService")
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public void deleteAllClientes() {
    	clienteRepository.deleteAllInBatch();
    }

    @Override
    public void deleteClienteById(Long id) {
    	clienteRepository.deleteById(id);
    }

    @Override
    public void createCliente(Cliente cliente) {
        Optional<Cliente> existingCliente = clienteRepository.findById(cliente.getId());

        if (existingCliente.isPresent()) {
            throw new BadResourceRequestException("Customer with same id exists.");
        }

        clienteRepository.save(cliente);
    }

    @Override
    public Cliente getClienteById(Long id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);

        if (!cliente.isPresent()) {
            throw new NoSuchResourceFoundException("No customer with given id found.");
        }

        return cliente.get();
    }

    @Override
    public List<Cliente> getAllClientes() {
        return clienteRepository.findAll();
    }
}
