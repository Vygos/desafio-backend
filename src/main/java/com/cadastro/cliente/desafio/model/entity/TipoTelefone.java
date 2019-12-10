package com.cadastro.cliente.desafio.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class TipoTelefone {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    private String dsTipoTelefone;

}
