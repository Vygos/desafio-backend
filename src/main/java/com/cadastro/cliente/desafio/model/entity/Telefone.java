package com.cadastro.cliente.desafio.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Table
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Telefone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer id;

    @NotNull
    @Length(min = 10, max = 11)
    private String numero;


    @ManyToOne
    @JoinColumn(name = "idTipoTelefone")
    private TipoTelefone tipoTelefone;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idCliente")
    private Cliente cliente;
}
