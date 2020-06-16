package com.br.codenation;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Jogador {
    public Long id;
    public Long idTime;
    public String nome;
    public LocalDate dataNascimento;
    public Integer nivelHabilidade;
    public BigDecimal salario;


    public Jogador(Long id, Long idTime, String nome, LocalDate dataNascimento, Integer nivelHabilidade, BigDecimal salario) {
        this.id = id;
        this.idTime = idTime;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.nivelHabilidade = nivelHabilidade;
        this.salario = salario;
    }


    public Jogador() {
    }
}
