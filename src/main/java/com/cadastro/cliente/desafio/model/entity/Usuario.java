package com.cadastro.cliente.desafio.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer id;

    @NotNull
    private String nome;

    @NotNull
    private String password;

    @OneToOne
    @JoinColumn(name = "idPermissao")
    private Permissao permissao;

}
