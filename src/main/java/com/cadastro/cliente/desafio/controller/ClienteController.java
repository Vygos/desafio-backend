package com.cadastro.cliente.desafio.controller;

import com.cadastro.cliente.desafio.model.entity.Cliente;
import com.cadastro.cliente.desafio.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    public ClienteService clienteService;


    @PostMapping
    public ResponseEntity<Cliente> salvar(@Valid @RequestBody Cliente cliente){
        return new ResponseEntity<>(clienteService.salvarCliente(cliente), HttpStatus.OK);
    }
}
