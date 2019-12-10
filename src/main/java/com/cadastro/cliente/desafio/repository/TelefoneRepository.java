package com.cadastro.cliente.desafio.repository;

import com.cadastro.cliente.desafio.model.entity.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TelefoneRepository extends JpaRepository<Telefone, Integer> {
}
