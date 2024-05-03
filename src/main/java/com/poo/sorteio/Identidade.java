package com.poo.sorteio;

import java.time.LocalDate;

public class Identidade {
    private int id;
    private boolean consetimento;
    private LocalDate dataNascimento;
    private String nome;
    private String cpf;
    private String email;
    private String perfil;
    private String role;
    private String senha;
    private String telefone;
    private String estado;
    private String municipio;
    private String cep;
    private String bairro;
    private String logradouro;
    private String numero;
    private String complemento;

    public Identidade(int id, boolean consetimento, LocalDate dataNascimento, String nome, String cpf,
                      String email, String perfil, String role, String senha,
                      String telefone, String estado, String municipio,
                      String cep, String bairro, String logradouro,
                      String numero, String complemento) {
        this.id = id;
        this.consetimento = consetimento;
        this.dataNascimento = dataNascimento;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.perfil = perfil;
        this.role = role;
        this.senha = senha;
        this.telefone = telefone;
        this.estado = estado;
        this.municipio = municipio;
        this.cep = cep;
        this.bairro = bairro;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
    }

    // Getters e setters
    public int getId() {
        return id;
    }

    public boolean isConsetimento() {
        return consetimento;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getPerfil() {
        return perfil;
    }

    public String getRole() {
        return role;
    }

    public String getSenha() {
        return senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEstado() {
        return estado;
    }

    public String getMunicipio() {
        return municipio;
    }

    public String getCep() {
        return cep;
    }

    public String getBairro() {
        return bairro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    @Override
    public String toString() {
        return "Identidade{id=" + id + ", nome='" + nome + "', cpf='" + cpf + "'}";
    }
}