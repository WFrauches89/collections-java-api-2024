package com.meuscursos.main.set.pesquisa;

import java.util.Objects;

public class Tarefa {

    private String descricao;

    private Boolean realizado;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.realizado = false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tarefa tarefa)) return false;
        return Objects.equals(descricao, tarefa.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(descricao);
    }

    public String getDescricao() {
        return descricao;
    }

    public Boolean getRealizado() {
        return realizado;
    }

    public void setRealizado(Boolean realizado) {
        this.realizado = realizado;
    }

    @Override
    public String toString() {
        return  descricao + ", Situação=" + realizado + '-';
    }


}
