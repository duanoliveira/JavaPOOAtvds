package com.poo.sorteio;

import java.util.ArrayList;
import java.util.List;

public class Sorteio {
    private int id;
    private int ano;
    private int mes;
    private int valorPremio;
    private int apresentador;
    private int auditor;
    private int premiado;
    private String descricao;
    private String tipo;
    private List<Bilhete> bilhetes;

    public Sorteio(int id, int ano, int mes, int valorPremio, int apresentador, int auditor,
                   int premiado, String descricao, String tipo) {
        this.id = id;
        this.ano = ano;
        this.mes = mes;
        this.valorPremio = valorPremio;
        this.apresentador = apresentador;
        this.auditor = auditor;
        this.premiado = premiado;
        this.descricao = descricao;
        this.tipo = tipo;
        this.bilhetes = new ArrayList<>();
    }

    // Getters e setters
    public int getId() {
        return id;
    }

    public int getAno() {
        return ano;
    }

    public int getMes() {
        return mes;
    }

    public int getValorPremio() {
        return valorPremio;
    }

    public int getApresentador() {
        return apresentador;
    }

    public int getAuditor() {
        return auditor;
    }

    public int getPremiado() {
        return premiado;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public List<Bilhete> getBilhetes() {
        return bilhetes;
    }

    public void addBilhete(Bilhete bilhete) {
        this.bilhetes.add(bilhete);
    }

    public void removerBilhete(int id) {
        this.bilhetes.removeIf(b -> b.getId() == id);
    }

    @Override
    public String toString() {
        return "Sorteio{id=" + id + ", ano=" + ano + ", mes=" + mes + ", valorPremio=" + valorPremio + ", descricao='" + descricao + "', tipo='" + tipo + "', bilhetes=" + bilhetes + "}";
    }
}

