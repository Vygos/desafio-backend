package com.cadastro.cliente.desafio.repository;

import com.cadastro.cliente.desafio.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
