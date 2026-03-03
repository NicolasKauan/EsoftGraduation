package com.nika.employer.models;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;
import java.time.LocalDate;

@Entity
@Table(name = "TBL_PESSOA")
public class PessoaModel {

    @Id //CRIA CHAVE PRIMERIA NO BANCO
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Gerar is automaticamente
    private Long id;
    private String nome;
    private String email;
    private Integer dataNascimento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Integer dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public PessoaModel(){

    }
}
