package com.cadastro.cliente.desafio.service;

import com.cadastro.cliente.desafio.model.entity.Cliente;
import com.cadastro.cliente.desafio.repository.ClienteRepository;
import com.cadastro.cliente.desafio.repository.EnderecoRepository;
import com.cadastro.cliente.desafio.repository.TelefoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;
    private final EnderecoRepository enderecoRepository;
    private final TelefoneRepository telefoneRepository;


    @Autowired
    public ClienteService(ClienteRepository clienteRepository,
                          EnderecoRepository enderecoRepository,
                          TelefoneRepository telefoneRepository){
        this.clienteRepository = clienteRepository;
        this.enderecoRepository = enderecoRepository;
        this.telefoneRepository = telefoneRepository;

    }


    @Transactional(propagation = Propagation.REQUIRED)
    public Cliente salvarCliente(Cliente cliente){
        cliente.getEndereco().setCliente(cliente);
        cliente.getTelefone().forEach(telefone -> telefone.setCliente(cliente));
        return clienteRepository.save(cliente);
    }

}
