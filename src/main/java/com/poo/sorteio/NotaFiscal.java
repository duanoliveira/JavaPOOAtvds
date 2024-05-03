package com.poo.sorteio;

import java.time.LocalDate;

public class NotaFiscal {
    private int id;
    private int usuarioId;
    private String chave;
    private String sequencial;
    private LocalDate dataProcessamento;

    public NotaFiscal(int id, int usuarioId, String chave, String sequencial, LocalDate dataProcessamento) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.chave = chave;
        this.sequencial = sequencial;
        this.dataProcessamento = dataProcessamento;
    }

    // Getters
    public int getId() {
        return id;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public String getChave() {
        return chave;
    }

    public String getSequencial() {
        return sequencial;
    }

    public LocalDate getDataProcessamento() {
        return dataProcessamento;
    }

    @Override
    public String toString() {
        return "NotaFiscal{id=" + id + ", chave='" + chave + "', sequencial='" + sequencial + "', dataProcessamento=" + dataProcessamento + "}";
    }
}
