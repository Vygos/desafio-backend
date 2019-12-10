package com.cadastro.cliente.desafio.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "cliente")
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Size(min = 3, max = 100)
    private String nome;


    @NotNull
    @Size(min = 11, max = 11)
    private String cpf;

    @NotNull
    private String email;

    @JsonIgnoreProperties("cliente")
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "cliente")
    private Endereco endereco;

    @JsonIgnoreProperties("cliente")
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cliente")
    private List<Telefone> telefone;

}
