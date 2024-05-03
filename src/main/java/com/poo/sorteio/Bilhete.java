package com.poo.sorteio;

public class Bilhete {
    private int id;
    private int ano;
    private int mes;
    private int numero;
    private int notaFiscalId;
    private int usuarioId;

    public Bilhete(int id, int ano, int mes, int numero, int notaFiscalId, int usuarioId) {
        this.id = id;
        this.ano = ano;
        this.mes = mes;
        this.numero = numero;
        this.notaFiscalId = notaFiscalId;
        this.usuarioId = usuarioId;
    }

    // Getters
    public int getId() {
        return id;
    }

    public int getAno() {
        return ano;
    }

    public int getMes() {
        return mes;
    }

    public int getNumero() {
        return numero;
    }

    public int getNotaFiscalId() {
        return notaFiscalId;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    @Override
    public String toString() {
        return "Bilhete{id=" + id + ", ano=" + ano + ", mes=" + mes + ", numero=" + numero + "}";
    }
}
